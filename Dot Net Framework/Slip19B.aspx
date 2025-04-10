<%@ Page Language="VB" AutoEventWireup="false" CodeFile="Default.aspx.vb" Inherits="_Default" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
     <asp:RadioButton ID="rbGood" runat="server" GroupName="vote" Text="Good" /><asp:Label ID="lblGood" runat="server" Text=" (0%)"></asp:Label><br>
        <asp:RadioButton ID="rbSatisfactory" runat="server" GroupName="vote" Text="Satisfactory" /><asp:Label ID="lblSatisfactory" runat="server" Text=" (0%)"></asp:Label><br>
        <asp:RadioButton ID="rbBad" runat="server" GroupName="vote" Text="Bad" /><asp:Label ID="lblBad" runat="server" Text=" (0%)"></asp:Label><br><br>

        <asp:Button ID="btnVote" runat="server" Text="VOTE" OnClick="btnVote_Click" /><br>
    </div>
    </form>
</body>
</html>
