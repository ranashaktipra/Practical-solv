
Partial Class _Default
    Inherits System.Web.UI.Page

    Protected Sub Button1_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles Button1.Click
        Dim n As Integer = CInt(TextBox1.Text)
        Dim i, sum As Integer
        sum = 0
        For i = 1 To n - 1
            If (n Mod i = 0) Then
                sum += i
            End If



        Next i
        If (sum = n) Then
            TextBox2.Text = "Number is Perfect Number"

        Else
            TextBox2.Text = "Number is not a Perfect Number"
        End If

    End Sub
End Class
