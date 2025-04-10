
Partial Class _Default
    Inherits System.Web.UI.Page

    Protected Sub Button1_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles Button1.Click
       
        If TextBox1.Text = "DYP" And TextBox2.Text = "Pimpri" Then
            TextBox3.Text = "Authorization Succesful"
        Else
            TextBox3.Text = "Invalid Credential"
        End If

    End Sub
End Class
