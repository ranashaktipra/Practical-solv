<%@ Page Language="VB" AutoEventWireup="false" CodeFile="255CharacterMaxTyping.aspx.vb" Inherits="_255CharacterMaxTyping" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <asp:Label ID="Label3" runat="server" Text="Document :"></asp:Label>
        </div>
       <asp:TextBox ID="TextBox1" runat="server" Height="166px" MaxLength="255" Width="563px" Multiline="True" AutoPostBack="True"></asp:TextBox>

        <p>
            <asp:Label ID="Label1" runat="server" Text="Length ::"></asp:Label>
            <asp:Label ID="Label2" runat="server" Text="0"></asp:Label>
        </p>
    </form>
</body>
</html>
