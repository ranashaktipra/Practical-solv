
Partial Class _Default
    Inherits System.Web.UI.Page

    Protected Sub Button1_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles Button1.Click
        Dim n As Integer = CInt(TextBox1.Text)
        Dim temp As Integer = n
        Dim r As Integer = 0

        While n > 0
            Dim digit As Integer = n Mod 10
            r = r * 10 + digit
            n = n \ 10
        End While

        If temp = r Then
            Label1.Text = "The number is a palindrome."
        Else
            Label1.Text = "The number is not a palindrome."
        End If
    End Sub
End Class
