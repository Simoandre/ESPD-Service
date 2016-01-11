package eu.europa.ec.grow.espd.xml.response.importing.exclusion

import eu.europa.ec.grow.espd.domain.LawCriterion
import eu.europa.ec.grow.espd.domain.EspdDocument
import eu.europa.ec.grow.espd.domain.SelfCleaning
import eu.europa.ec.grow.espd.xml.base.AbstractXmlFileImport
import org.apache.commons.io.IOUtils
/**
 * Created by ratoico on 1/7/16 at 5:43 PM.
 */
class BreachingOfObligationsEnvironmentalImportTest extends AbstractXmlFileImport {

    def "09. should import all fields of 'Breaching of obligations in the fields of environmental, social and labour law'"() {
        given:
        def espdResponseXml = importXmlResponseFile("exclusion/breaching_of_obligations_import.xml")

        when:
        EspdDocument espd = marshaller.importEspdResponse(IOUtils.toInputStream(espdResponseXml))

        then:
        espd.breachingObligationsEnvironmental.exists == true
        espd.breachingObligationsEnvironmental.description == "Hodor description"

        then: "self cleaning"
        espd.breachingObligationsEnvironmental.selfCleaning.exists == true
        espd.breachingObligationsEnvironmental.selfCleaning.description == "Hodor is very clean"

    }

    def "all fields needed to generate a XML sample"() {
        given:
        def espd = new EspdDocument(breachingObligationsEnvironmental: new LawCriterion(exists: true, description: "Hodor description",
                selfCleaning: new SelfCleaning(exists: true, description: "Hodor is very clean")))

        expect:
        1 == 1
    }

}