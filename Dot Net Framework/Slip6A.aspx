<!DOCTYPE html>
<html>
<head>
    <title>Binding to a label</title>
    <script language="C#" runat="server">
        void Btn_Click(Object sender, EventArgs e) {
            Page.DataBind();
        }
    </script>
</head>
<body>
    <form runat="server">
        <asp:RadioButtonList id="Flower" repeatcolumns="2" runat="server">
            <asp:ListItem>Jasmine</asp:ListItem>
            <asp:ListItem>Rose</asp:ListItem>
            <asp:ListItem>Lotus</asp:ListItem>
            <asp:ListItem>Lily</asp:ListItem>
            <asp:ListItem>Daisy</asp:ListItem>
            <asp:ListItem>Dahlia</asp:ListItem>
        </asp:RadioButtonList>
        <br><br>
        <asp:button Text="Submit" OnClick="Btn_Click" runat="server"/>
        <br><br>
        Your favourite flower is: 
        <asp:label text='<%# Flower.SelectedItem.Text %>' runat="server"/>
    </form>
</body>
</html>
