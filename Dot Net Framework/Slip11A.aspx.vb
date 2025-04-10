
Partial Class CreditCardValidation
    Inherits System.Web.UI.Page


    Protected Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        If TextBox1.Text = "ssracs" And TextBox3.Text = "123456789" Then
            TextBox4.Text = "Valiation Successful"

        Else
            TextBox4.Text = "Wrong Credential"
        End If

    End Sub


End Class
