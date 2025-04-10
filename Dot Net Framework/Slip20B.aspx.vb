
Partial Class IndexOutofBound_Slip20_B
    Inherits System.Web.UI.Page


    Protected Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim a() As Integer = {1, 2, 3}

        Try
            TextBox1.Text = a(4)
        Catch ex As Exception
            Response.Redirect("~/IndexOutOfBoundExceptionRedirectedPage- Slip20-b.aspx")
            TextBox1.Text = "Index Out Of bound Exception"
        End Try
    End Sub
End Class
