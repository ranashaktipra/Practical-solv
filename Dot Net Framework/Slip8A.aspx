<%@ Page Language="VB" AutoEventWireup="false" CodeFile="EmployeeListbox_Slip8-A.aspx.vb" Inherits="EmployeeListbox_Slip8_A" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <asp:Label ID="Label1" runat="server" Text="List of Employees ::"></asp:Label>
        </div>
        <asp:ListBox ID="ListBox1" runat="server" Height="181px" style="margin-top: 44px" Width="367px">
            <asp:ListItem>Anurag</asp:ListItem>
            <asp:ListItem>Sharuk</asp:ListItem>
            <asp:ListItem>Salman</asp:ListItem>
            <asp:ListItem>Bobby</asp:ListItem>
            <asp:ListItem>Hritik</asp:ListItem>
            <asp:ListItem>Ajay</asp:ListItem>
            <asp:ListItem>Kamlesh</asp:ListItem>
        </asp:ListBox>
        <p>
            <asp:Button ID="Button1" runat="server" Text="Display Selected" Height="50px" Width="157px" />
            <asp:Button ID="Button2" runat="server" Height="50px" style="margin-bottom: 0px; margin-left: 50px; margin-top: 0px;" Text="Print All" />
        </p>
        <p>
            <asp:TextBox ID="TextBox1" runat="server" Height="103px" Width="300px"></asp:TextBox>
        </p>
    </form>
</body>
</html>
