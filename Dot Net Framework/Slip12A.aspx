<%@ Page Language="VB" AutoEventWireup="false" CodeFile="Default.aspx.vb" Inherits="_Default" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
    <style>
        {
            background-color: green;
            cursor: pointer;
        }
    </style>
    <script>
        function changeColorOnHover(btn) {
            btn.style.backgroundColor = "yellow";
        }

        function revertColor(btn) {
            btn.style.backgroundColor = "green";
        }
    </script>
</head>
<body>
     <form id="form1" runat="server">
    <asp:Button ID="btnColor" runat="server" Text="Hover Me" 
            onmouseover="changeColorOnHover(this)" 
            onmouseout="revertColor(this)" />
    </form>
</body>
</html>
