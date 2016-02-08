
/* Pseudo console for f**g IE9, otherwise it makes undefined error */
window.console = window.console || (function () {
	var c = {};
	c.log = c.warn = c.debug = c.info = c.error = c.time = c.dir = c.profile = c.clear = c.exception = c.trace = c.assert = function () {};
	return c;
})();

function validator(validators, name, text) {
	validators[name] = jQuery.validator.format("<span data-i18n=\"validator_" + name + "\">" + text + "</span>");
}
    
function dataShow() {
	$($(this).attr("data-target-show")).show();
}

function dataHide() {
	$($(this).attr("data-target-hide")).hide();
}

var defaultValidators = {};

function language(code) {
	var flags = [];
	var codes = [];

	for (var name in defaultValidators) {
		if (flags["validator_" + name] != true) {
			codes.push("validator_" + name);
		}
	}
	$("*[data-i18n]").each(function (index) {
		var className = $(this).attr("data-i18n");
		if (flags[className] != true) {
			flags[className] = true;
			codes.push(className);
		}
	});

	$.ajax({
		type: "POST",
		url: "translate?lang=" + code,
		data: {
			labels: codes
		},
		success: function (data) {
			var array = JSON.parse(data);
			var validators = {};
			for (var i = 0; i < codes.length; i++) {
				if (codes[i].indexOf("validator_") == 0) {
					validator(validators, codes[i].substring("validator_".length), array[i]);
					if($("*[data-i18n='" + codes[i] + "']").length == 0) continue;
				}
				var elem = $("*[data-i18n='" + codes[i] + "']");
				var tagName = elem.prop("tagName").toLowerCase();
				if(tagName == "input" || tagName == "textarea") {
					elem.attr('placeholder', array[i]);
				}
				else if (elem.attr("data-toggle") == "tooltip") {
					elem.attr("title", array[i]);
					elem.attr("data-original-title", array[i]);
				}
				else {
					elem.html(array[i]);
				}
			}
			jQuery.extend(jQuery.validator.messages, validators);
		}
	});
}

$(function () {
	validator(defaultValidators, "required", "${i18n['validator_required']}");
	validator(defaultValidators, "number", "${i18n['validator_number']}");
	validator(defaultValidators, "digits", "${i18n['validator_digits']}");
	validator(defaultValidators, "url", "${i18n['validator_url']}");

	jQuery.extend(jQuery.validator.messages, defaultValidators);
            
	$("input.datepicker").datepicker({format: "dd-mm-yyyy", clearBtn: true, todayHighlight: true});
	$("span[data-toggle='tooltip']").tooltip({placement: "top", html: true, trigger: "hover"}).addClass("fa").addClass("fa-info-circle");
	$("input:radio[data-target-show]").change(dataShow);
	$("input:radio[data-target-hide]").change(dataHide);
});
    