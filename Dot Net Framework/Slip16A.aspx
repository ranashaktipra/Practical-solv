<%@ Page Language="VB" AutoEventWireup="false" CodeFile="Default.aspx.vb" Inherits="_Default" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
   <asp:Label ID="Label1" runat="server" Text="User Name"></asp:Label>
        <asp:TextBox ID="TextBox1" runat="server" style="margin-left: 35px"></asp:TextBox>
        <p>
            <asp:Label ID="Label2" runat="server" Text="Password"></asp:Label>
            <asp:TextBox ID="TextBox2" runat="server" style="margin-left: 48px"></asp:TextBox>
        </p>
        <p>
            <asp:Button ID="Button1" runat="server" style="margin-left: 172px; margin-top: 37px" Text="Submit" />
        </p>
        <asp:TextBox ID="TextBox3" runat="server" style="margin-left: 67px; margin-top: 29px" Width="224px"></asp:TextBox>
    </form>
</body>
</html>
