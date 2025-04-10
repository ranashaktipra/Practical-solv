<%@ Page Language="VB" AutoEventWireup="false" CodeFile="Default.aspx.vb" Inherits="_Default" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
   <div>
            <asp:Label ID="Label1" runat="server" Text="Enter No. to Check Perfect Number :"></asp:Label>
            <asp:TextBox ID="TextBox1" runat="server" style="margin-left: 42px; margin-top: 5px"></asp:TextBox>
        </div>
        <asp:Button ID="Button1" runat="server" style="margin-left: 0px; margin-top: 20px" Text="Button" />
        <p>
            <asp:TextBox ID="TextBox2" runat="server" Height="78px" style="margin-left: 18px; margin-top: 10px" Width="256px"></asp:TextBox>
        </p>
    </form>
</body>
</html>
