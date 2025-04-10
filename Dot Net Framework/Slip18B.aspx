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
        <asp:ListBox ID="ListBox1" runat="server" Height="191px" Width="241px">
            <asp:ListItem Text="Apple" Value="Apple" />
             <asp:ListItem Text="Mango" Value="Mango" />
             <asp:ListItem Text="Orange" Value="Orange" />
            <asp:ListItem Text="Strawberry" Value="Strawberry" />
            <asp:ListItem Text="Watermelon" Value="Watermelon" />
            <asp:ListItem Text="Kiwi" Value="Kiwi" />
            <asp:ListItem Text="Guava" Value="Guava" />

        </asp:ListBox>
        <p>
            <asp:Button ID="Button1" runat="server" Text="Select" />
        </p>
        <p>
            <asp:Image ID="Image1" runat="server" Width="238px" Height="147px" />
        </p>
        <p>
            <asp:Label ID="Label2" runat="server" Text="Price ::"></asp:Label>
            <asp:Label ID="Label3" runat="server" Text=""></asp:Label>
        </p>
    </form>
</body>
</html>
