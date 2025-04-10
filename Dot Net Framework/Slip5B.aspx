<%@ Page Language="C#" AutoEventWireup="true"  CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
    Loan Amount: <asp:TextBox ID="txtLoanAmount" runat="server"></asp:TextBox><br>
        Interest Rate: <asp:TextBox ID="txtInterestRate" runat="server"></asp:TextBox><br>
        Duration (Years): <asp:TextBox ID="txtDuration" runat="server"></asp:TextBox>
    <br />
    <br>
        <asp:Button ID="btnCalculate" runat="server" Text="Calculate" OnClick="btnCalculate_Click" />
    <br />
    <br>
        Simple Interest: <asp:Label ID="lblResult" runat="server"></asp:Label>
    </form>
<p>
    &nbsp;</p>
</body>
</html>
