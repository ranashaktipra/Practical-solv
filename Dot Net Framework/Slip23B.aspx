<%@ Page Language="VB" AutoEventWireup="false" CodeFile="Default.aspx.vb" Inherits="_Default" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
    </div>
    <asp:Label ID="Label1" runat="server" Text="UserName"></asp:Label>
        <asp:TextBox ID="TextBox1" runat="server" style="margin-left: 45px"></asp:TextBox>
        <p>
            <asp:Label ID="Label2" runat="server" Text="PassWord"></asp:Label>
            <asp:TextBox ID="TextBox2" runat="server" style="margin-left: 52px"></asp:TextBox>
        </p>
        <p>
            <asp:Label ID="Label3" runat="server" Text="ReConfirm "></asp:Label>
            <asp:TextBox ID="TextBox3" runat="server" style="margin-left: 38px"></asp:TextBox>
        </p>
        <p>
            <asp:Label ID="Label4" runat="server" Text="Email"></asp:Label>
            <asp:TextBox ID="TextBox4" runat="server" style="margin-left: 82px"></asp:TextBox>
        </p>
        <p>
            <asp:Label ID="Label5" runat="server" Text="Age"></asp:Label>
            <asp:TextBox ID="TextBox5" runat="server" style="margin-left: 99px"></asp:TextBox>
        </p>
        <asp:Button ID="Button1" runat="server" Height="35px" style="margin-left: 45px; margin-top: 20px" Text="Login" />
        <p>
            <asp:TextBox ID="TextBox6" runat="server" Height="62px" Width="424px" Visible="False"></asp:TextBox>
        </p>
    </form>
</body>
</html>
