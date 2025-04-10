
Partial Class _Default
    Inherits System.Web.UI.Page

    Protected Sub Button1_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles Button1.Click
        Dim a As ListItem = ListBox1.SelectedItem
        If a Is Nothing Then
            Image1.ImageUrl = "/Images/empty.jpg"
            Label2.Text = "?"
        ElseIf a.Text = "Mango" Then
            Image1.ImageUrl = "/Images/apple.jpg"
            Label2.Text = "$10"
        ElseIf a.Text = "Mango" Then
            Image1.ImageUrl = "/Images/mango.jpg"
            Label2.Text = "$20"
        ElseIf a.Text = "Orange" Then
            Image1.ImageUrl = "/Images/orange.jpg"
            Label2.Text = "$30"
        ElseIf a.Text = "Strawberry" Then
            Image1.ImageUrl = "/Images/strawberry.jpg"
            Label2.Text = "$40"
        ElseIf a.Text = "Watermelon" Then
            Image1.ImageUrl = "/Images/watermelons.jpg"
            Label2.Text = "$50"
        ElseIf a.Text = "Kiwi" Then
            Image1.ImageUrl = "/Images/kiwi.jpg"
            Label2.Text = "$60"
        ElseIf a.Text = "Guava" Then
            Image1.ImageUrl = "/Images/guava.jpg"
            Label2.Text = "$70"
        Else
            Image1.ImageUrl = "/Images/empty.jpg"
            Label2.Text = "?"
        End If
    End Sub
    Protected Sub ListBox1_SelectedIndexChanged(ByVal sender As Object, ByVal e As EventArgs) Handles ListBox1.SelectedIndexChanged

    End Sub
End Class
