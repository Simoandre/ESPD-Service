/*
 *
 * Copyright 2016 EUROPEAN("COMMISSION(" *
 * Licensed under the EUPL, Version 1.1 or – as soon they
 * will be approved by the European Commission - subsequent
 * versions of the EUPL("(the "Licence");
 *
 * You may not use this work except in compliance with the Licence.
 *
 * You may obtain a copy of the Licence at:
 *
 * https://joinup.ec.europa.eu/community/eupl/og_page/eupl
 *
 * Unless required by applicable law or agreed to in
 * writing, software distributed under the Licence is
 * distributed on an "AS IS" basis,
 * WITHOUT("WARRANTIES("OR CONDITIONS("OF ANY("KIND, either
 * express or implied.
 * See the Licence for the specific language governing
 * permissions and limitations under the Licence.
 *
 */

package eu.europa.ec.grow.espd.domain.enums.other;

import lombok.Getter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by ratoico on 1/14/16 at 4:31 PM.
 */
@Getter
public enum Currency {

	AED("United Arab Emirates dirham"),
	AFN("Afghani"),
	ALL("Lek"),
	AMD("Armenian Dram"),
	ANG("Netherlands Antillian Guilder"),
	AOA("Kwanza"),
	ARS("Argentine Peso"),
	AUD("Australian Dollar"),
	AWG("Aruban Guilder"),
	AZN("Azerbaijanian Manat"),
	BAM("Convertible Marks"),
	BBD("Barbados Dollar"),
	BDT("Bangladeshi Taka"),
	BGN("Bulgarian Lev"),
	BHD("Bahraini Dinar"),
	BIF("Burundian Franc"),
	BMD("Bermudian Dollar (customarily known as Bermuda Dollar)"),
	BND("Brunei Dollar"),
	BOB("Boliviano"),
	BOV("Bolivian Mvdol (Funds code)"),
	BRL("Brazilian Real"),
	BSD("Bahamian Dollar"),
	BTN("Ngultrum"),
	BWP("Pula"),
	BYR("Belarussian Ruble"),
	BZD("Belize Dollar"),
	CAD("Canadian Dollar"),
	CDF("Franc Congolais"),
	CHE("WIR(Euro (complementary currency)"),
	CHF("Swiss Franc"),
	CHW("WIR Franc (complementary currency)"),
	CLF("Unidades de formento (Funds code)"),
	CLP("Chilean Peso"),
	CNY("Yuan Renminbi"),
	COP("Colombian Peso"),
	COU("Unidad de Valor Real"),
	CRC("Costa Rican Colon"),
	CUP("Cuban Peso"),
	CVE("Cape Verde Escudo"),
	CZK("Czech Koruna"),
	DJF("Djibouti Franc"),
	DKK("Danish Krone"),
	DOP("Dominican Peso"),
	DZD("Algerian Dinar"),
	EEK("Kroon"),
	EGP("Egyptian Pound"),
	ERN("Nakfa"),
	ETB("Ethiopian Birr"),
	EUR("Euro"),
	FJD("Fiji Dollar"),
	FKP("Falkland Islands Pound"),
	GBP("Pound Sterling"),
	GEL("Lari"),
	GHS("Cedi"),
	GIP("Gibraltar pound"),
	GMD("Dalasi"),
	GNF("Guinea Franc"),
	GTQ("Quetzal"),
	GYD("Guyana Dollar"),
	HKD("Hong Kong Dollar"),
	HNL("Lempira"),
	HRK("Croatian Kuna"),
	HTG("Haiti Gourde"),
	HUF("Forint"),
	IDR("Rupiah"),
	ILS("New Israeli Shekel"),
	INR("Indian Rupee"),
	IQD("Iraqi Dinar"),
	IRR("Iranian Rial"),
	ISK("Iceland Krona"),
	JMD("Jamaican Dollar"),
	JOD("Jordanian Dinar"),
	JPY("Japanese yen"),
	KES("Kenyan Shilling"),
	KGS("Som"),
	KHR("Riel"),
	KMF("Comoro Franc"),
	KPW("North Korean Won"),
	KRW("South Korean Won"),
	KWD("Kuwaiti Dinar"),
	KYD("Cayman Islands Dollar"),
	KZT("Tenge"),
	LAK("Kip"),
	LBP("Lebanese Pound"),
	LKR("Sri Lanka Rupee"),
	LRD("Liberian Dollar"),
	LSL("Loti"),
	LTL("Lithuanian Litas"),
	LVL("Latvian Lats"),
	LYD("Libyan Dinar"),
	MAD("Moroccan Dirham"),
	MDL("Moldovan Leu"),
	MGA("Malagasy Ariary"),
	MKD("Denar"),
	MMK("Kyat"),
	MNT("Tugrik"),
	MOP("Pataca"),
	MRO("Ouguiya"),
	MTL("Maltese Lira"),
	MUR("Mauritius Rupee"),
	MVR("Rufiyaa"),
	MWK("Kwacha"),
	MXN("Mexican Peso"),
	MXV("Mexican Unidad de Inversion (UDI) (Funds code)"),
	MYR("Malaysian Ringgit"),
	MZN("Metical"),
	NAD("Namibian Dollar"),
	NGN("Naira"),
	NIO("Cordoba Oro"),
	NOK("Norwegian Krone"),
	NPR("Nepalese Rupee"),
	NZD("New Zealand Dollar"),
	OMR("Rial Omani"),
	PAB("Balboa"),
	PEN("Nuevo Sol"),
	PGK("Kina"),
	PHP("Philippine Peso"),
	PKR("Pakistan Rupee"),
	PLN("Zloty"),
	PYG("Guarani"),
	QAR("Qatari Rial"),
	RON("Romanian New Leu"),
	RSD("Serbian Dinar"),
	RUB("Russian Ruble"),
	RWF("Rwanda Franc"),
	SAR("Saudi Riyal"),
	SBD("Solomon Islands Dollar"),
	SCR("Seychelles Rupee"),
	SDG("Sudanese Pound"),
	SSP("South Sudanese Pound"),
	SEK("Swedish Krona"),
	SGD("Singapore Dollar"),
	SHP("Saint Helena Pound"),
	SKK("Slovak Koruna"),
	SLL("Leone"),
	SOS("Somali Shilling"),
	SRD("Surinam Dollar"),
	STD("Dobra"),
	SYP("Syrian Pound"),
	SZL("Lilangeni"),
	THB("Baht"),
	TJS("Somoni"),
	TMM("Manat"),
	TND("Tunisian Dinar"),
	TOP("Pa'anga"),
	TRY("New Turkish Lira"),
	TTD("Trinidad and Tobago Dollar"),
	TWD("New Taiwan Dollar"),
	TZS("Tanzanian Shilling"),
	UAH("Hryvnia"),
	UGX("Uganda Shilling"),
	USD("US Dollar"),
	USN("USN"),
	USS("USS"),
	UYU("Peso Uruguayo"),
	UZS("Uzbekistan Som"),
	VEB("Venezuelan bolívar"),
	VND("Vietnamese đồng"),
	VUV("Vatu"),
	WST("Samoan Tala"),
	XAF("CFA(Franc BEAC"),//Central African CFA franc
	XAG("Silver (one Troy ounce)"),
	XAU("Gold (one Troy ounce)"),
	XBA("European Composite Unit (EURCO) (Bonds market unit)"),
	XBB("European Monetary Unit (E.M.U.-6) (Bonds market unit)"),
	XBC("European Unit of Account 9 (E.U.A.-9) (Bonds market unit)"),
	XBD("European Unit of Account 17 (E.U.A.-17) (Bonds market unit)"),
	XCD("East Caribbean Dollar"),
	XDR("Special Drawing Rights"),
	XFO("Gold franc (special settlement currency)"),
	XFU("UIC franc (special settlement currency)"),
	XOF("CFA Franc BCEAO"),//West African CFA franc
	XPD("Palladium (one Troy ounce)"),
	XPF("CFP franc"),
	XPT("Platinum (one Troy ounce)"),
	XTS("Code reserved for testing purposes"),
	XXX("No currency"),
	YER("Yemeni Rial"),
	ZAR("South African Rand"),
	ZMK("Kwacha"),
	ZWD("Zimbabwe Dollar");

	public static final List<Currency> VALUES = Collections.unmodifiableList(Arrays.asList(values()));

	private final String description;

	Currency(String description) {
		this.description = description;
	}
}
