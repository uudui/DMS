package team.epm.dcm.view;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Feb 04 16:07:19 CST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DcmTemplateViewImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public DcmTemplateViewImpl() {
    }

    /**
     * Returns the bind variable value for locale.
     * @return bind variable value for locale
     */
    public String getlocale() {
        return (String)getNamedWhereClauseParam("locale");
    }

    /**
     * Sets <code>value</code> for bind variable locale.
     * @param value value to bind as locale
     */
    public void setlocale(String value) {
        setNamedWhereClauseParam("locale", value);
    }
}
