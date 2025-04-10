<%@ Page Language="VB" AutoEventWireup="false" CodeFile="CreditCardValidation.aspx.vb" Inherits="CreditCardValidation" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <asp:Label ID="Label1" runat="server" Text="UserName"></asp:Label>
            <asp:TextBox ID="TextBox1" runat="server" style="margin-left: 177px"></asp:TextBox>
            <br />
        </div>
        <asp:Label ID="Label2" runat="server" Text="Mode of Payment"></asp:Label>
        <asp:DropDownList ID="DropDownList1" runat="server" style="margin-left: 105px">
            <asp:ListItem>UPI</asp:ListItem>
            <asp:ListItem>Cash</asp:ListItem>
            <asp:ListItem Selected="True">Credit Card</asp:ListItem>
        </asp:DropDownList>
        <p>
            <asp:Label ID="Label3" runat="server" Text="Credit Card No."></asp:Label>
            <asp:TextBox ID="TextBox3" runat="server" style="margin-left: 127px"></asp:TextBox>
        </p>
        <asp:Button ID="Button1" runat="server" style="margin-left: 283px" Text="Button" />
        <p>
            <asp:TextBox ID="TextBox4" runat="server" Height="42px" style="margin-top: 27px" Width="263px"></asp:TextBox>
        </p>
    </form>
</body>
</html>
