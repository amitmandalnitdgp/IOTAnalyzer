//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.19 at 02:21:08 PM CET 
//


package juliawsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the juliawsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnalysisResult_QNAME = new QName("http://service.server.web.julia.juliasoft.com/", "analysisResult");
    private final static QName _ProjectMetrics_QNAME = new QName("http://service.server.web.julia.juliasoft.com/", "projectMetrics");
    private final static QName _JuliaWSException_QNAME = new QName("http://service.server.web.julia.juliasoft.com/", "JuliaWSException");
    private final static QName _AnalysisReportResult_QNAME = new QName("http://service.server.web.julia.juliasoft.com/", "analysisReportResult");
    private final static QName _AnalysisSpecification_QNAME = new QName("http://service.server.web.julia.juliasoft.com/", "analysisSpecification");
    private final static QName _AnalysisProgress_QNAME = new QName("http://service.server.web.julia.juliasoft.com/", "analysisProgress");
    private final static QName _JuliaWarningMessageOutputArtifactsOutputArtifact_QNAME = new QName("", "outputArtifact");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: juliawsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Checker }
     * 
     */
    public Checker createChecker() {
        return new Checker();
    }

    /**
     * Create an instance of {@link JuliaWarningMessage }
     * 
     */
    public JuliaWarningMessage createJuliaWarningMessage() {
        return new JuliaWarningMessage();
    }

    /**
     * Create an instance of {@link AnalysisResult }
     * 
     */
    public AnalysisResult createAnalysisResult() {
        return new AnalysisResult();
    }

    /**
     * Create an instance of {@link AnalysisResult.Metrics }
     * 
     */
    public AnalysisResult.Metrics createAnalysisResultMetrics() {
        return new AnalysisResult.Metrics();
    }

    /**
     * Create an instance of {@link AnalysisSpecification }
     * 
     */
    public AnalysisSpecification createAnalysisSpecification() {
        return new AnalysisSpecification();
    }

    /**
     * Create an instance of {@link JuliaWSExceptionBean }
     * 
     */
    public JuliaWSExceptionBean createJuliaWSExceptionBean() {
        return new JuliaWSExceptionBean();
    }

    /**
     * Create an instance of {@link AnalysisReportResult }
     * 
     */
    public AnalysisReportResult createAnalysisReportResult() {
        return new AnalysisReportResult();
    }

    /**
     * Create an instance of {@link AnalysisProgress }
     * 
     */
    public AnalysisProgress createAnalysisProgress() {
        return new AnalysisProgress();
    }

    /**
     * Create an instance of {@link ProjectMetrics }
     * 
     */
    public ProjectMetrics createProjectMetrics() {
        return new ProjectMetrics();
    }

    /**
     * Create an instance of {@link FileOption }
     * 
     */
    public FileOption createFileOption() {
        return new FileOption();
    }

    /**
     * Create an instance of {@link AnalysisCost }
     * 
     */
    public AnalysisCost createAnalysisCost() {
        return new AnalysisCost();
    }

    /**
     * Create an instance of {@link ExternalClassification }
     * 
     */
    public ExternalClassification createExternalClassification() {
        return new ExternalClassification();
    }

    /**
     * Create an instance of {@link Artifact }
     * 
     */
    public Artifact createArtifact() {
        return new Artifact();
    }

    /**
     * Create an instance of {@link IntOption }
     * 
     */
    public IntOption createIntOption() {
        return new IntOption();
    }

    /**
     * Create an instance of {@link Solution }
     * 
     */
    public Solution createSolution() {
        return new Solution();
    }

    /**
     * Create an instance of {@link Options }
     * 
     */
    public Options createOptions() {
        return new Options();
    }

    /**
     * Create an instance of {@link StringOption }
     * 
     */
    public StringOption createStringOption() {
        return new StringOption();
    }

    /**
     * Create an instance of {@link SetOption }
     * 
     */
    public SetOption createSetOption() {
        return new SetOption();
    }

    /**
     * Create an instance of {@link EnumeratedOption }
     * 
     */
    public EnumeratedOption createEnumeratedOption() {
        return new EnumeratedOption();
    }

    /**
     * Create an instance of {@link Alternative }
     * 
     */
    public Alternative createAlternative() {
        return new Alternative();
    }

    /**
     * Create an instance of {@link AnalysisExtendedStatus }
     * 
     */
    public AnalysisExtendedStatus createAnalysisExtendedStatus() {
        return new AnalysisExtendedStatus();
    }

    /**
     * Create an instance of {@link AdaptedRemark }
     * 
     */
    public AdaptedRemark createAdaptedRemark() {
        return new AdaptedRemark();
    }

    /**
     * Create an instance of {@link AnalysisSpecificationBase }
     * 
     */
    public AnalysisSpecificationBase createAnalysisSpecificationBase() {
        return new AnalysisSpecificationBase();
    }

    /**
     * Create an instance of {@link AnalysisPackage }
     * 
     */
    public AnalysisPackage createAnalysisPackage() {
        return new AnalysisPackage();
    }

    /**
     * Create an instance of {@link AnalysisSpecificationBaseArray }
     * 
     */
    public AnalysisSpecificationBaseArray createAnalysisSpecificationBaseArray() {
        return new AnalysisSpecificationBaseArray();
    }

    /**
     * Create an instance of {@link OutputArtifact }
     * 
     */
    public OutputArtifact createOutputArtifact() {
        return new OutputArtifact();
    }

    /**
     * Create an instance of {@link BooleanOption }
     * 
     */
    public BooleanOption createBooleanOption() {
        return new BooleanOption();
    }

    /**
     * Create an instance of {@link SolutionArray }
     * 
     */
    public SolutionArray createSolutionArray() {
        return new SolutionArray();
    }

    /**
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link Checker.Warnings }
     * 
     */
    public Checker.Warnings createCheckerWarnings() {
        return new Checker.Warnings();
    }

    /**
     * Create an instance of {@link JuliaWarningMessage.ExternalClassifications }
     * 
     */
    public JuliaWarningMessage.ExternalClassifications createJuliaWarningMessageExternalClassifications() {
        return new JuliaWarningMessage.ExternalClassifications();
    }

    /**
     * Create an instance of {@link JuliaWarningMessage.OutputArtifacts }
     * 
     */
    public JuliaWarningMessage.OutputArtifacts createJuliaWarningMessageOutputArtifacts() {
        return new JuliaWarningMessage.OutputArtifacts();
    }

    /**
     * Create an instance of {@link AnalysisResult.Warnings }
     * 
     */
    public AnalysisResult.Warnings createAnalysisResultWarnings() {
        return new AnalysisResult.Warnings();
    }

    /**
     * Create an instance of {@link AnalysisResult.Remarks }
     * 
     */
    public AnalysisResult.Remarks createAnalysisResultRemarks() {
        return new AnalysisResult.Remarks();
    }

    /**
     * Create an instance of {@link AnalysisResult.OutputArtifacts }
     * 
     */
    public AnalysisResult.OutputArtifacts createAnalysisResultOutputArtifacts() {
        return new AnalysisResult.OutputArtifacts();
    }

    /**
     * Create an instance of {@link AnalysisResult.Metrics.Entry }
     * 
     */
    public AnalysisResult.Metrics.Entry createAnalysisResultMetricsEntry() {
        return new AnalysisResult.Metrics.Entry();
    }

    /**
     * Create an instance of {@link AnalysisSpecification.Packages }
     * 
     */
    public AnalysisSpecification.Packages createAnalysisSpecificationPackages() {
        return new AnalysisSpecification.Packages();
    }

    /**
     * Create an instance of {@link AnalysisSpecification.Checkers }
     * 
     */
    public AnalysisSpecification.Checkers createAnalysisSpecificationCheckers() {
        return new AnalysisSpecification.Checkers();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnalysisResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.web.julia.juliasoft.com/", name = "analysisResult")
    public JAXBElement<AnalysisResult> createAnalysisResult(AnalysisResult value) {
        return new JAXBElement<AnalysisResult>(_AnalysisResult_QNAME, AnalysisResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectMetrics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.web.julia.juliasoft.com/", name = "projectMetrics")
    public JAXBElement<ProjectMetrics> createProjectMetrics(ProjectMetrics value) {
        return new JAXBElement<ProjectMetrics>(_ProjectMetrics_QNAME, ProjectMetrics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JuliaWSExceptionBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.web.julia.juliasoft.com/", name = "JuliaWSException")
    public JAXBElement<JuliaWSExceptionBean> createJuliaWSException(JuliaWSExceptionBean value) {
        return new JAXBElement<JuliaWSExceptionBean>(_JuliaWSException_QNAME, JuliaWSExceptionBean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnalysisReportResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.web.julia.juliasoft.com/", name = "analysisReportResult")
    public JAXBElement<AnalysisReportResult> createAnalysisReportResult(AnalysisReportResult value) {
        return new JAXBElement<AnalysisReportResult>(_AnalysisReportResult_QNAME, AnalysisReportResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnalysisSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.web.julia.juliasoft.com/", name = "analysisSpecification")
    public JAXBElement<AnalysisSpecification> createAnalysisSpecification(AnalysisSpecification value) {
        return new JAXBElement<AnalysisSpecification>(_AnalysisSpecification_QNAME, AnalysisSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnalysisProgress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.web.julia.juliasoft.com/", name = "analysisProgress")
    public JAXBElement<AnalysisProgress> createAnalysisProgress(AnalysisProgress value) {
        return new JAXBElement<AnalysisProgress>(_AnalysisProgress_QNAME, AnalysisProgress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "outputArtifact", scope = JuliaWarningMessage.OutputArtifacts.class)
    @XmlIDREF
    public JAXBElement<Object> createJuliaWarningMessageOutputArtifactsOutputArtifact(Object value) {
        return new JAXBElement<Object>(_JuliaWarningMessageOutputArtifactsOutputArtifact_QNAME, Object.class, JuliaWarningMessage.OutputArtifacts.class, value);
    }

}
