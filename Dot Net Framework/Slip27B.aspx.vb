
Imports System.Drawing

Partial Class _255CharacterMaxTyping
    Inherits System.Web.UI.Page

    Dim a As Int32
    Protected Sub TextBox1_TextChanged(sender As Object, e As EventArgs) Handles TextBox1.TextChanged

        a = CInt(TextBox1.Text.Length)
        Label2.Text = a
        If (TextBox1.Text.Length < 255) Then

            TextBox1.BackColor = Color.White
        Else

            TextBox1.BackColor = Color.Red
        End If

    End Sub
End Class
