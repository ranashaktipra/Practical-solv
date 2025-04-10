using System;
using System.Configuration;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.HtmlControls;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Xml.Linq;

public partial class _Default : System.Web.UI.Page
{
    protected void btnCalculate_Click(object sender, EventArgs e)
    {
        decimal P = Convert.ToDecimal(txtLoanAmount.Text);
        decimal R = Convert.ToDecimal(txtInterestRate.Text);
        int T = Convert.ToInt32(txtDuration.Text);
        decimal SI = (P * R * T) / 100;
        lblResult.Text = SI.ToString("F2");
    }
}
