Partial Class _Default
    Inherits System.Web.UI.Page

    Protected Sub Button1_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles Button1.Click
        TextBox6.Visible = True
        If ValidateInputs() Then
            TextBox6.Text = "All fields should be filled !!"
            TextBox6.ForeColor = Drawing.Color.Red
        ElseIf TextBox1.Text.Length < 7 Or TextBox1.Text.Length > 15 Then
            TextBox6.Text = "UserName length should be Min 7 and Max 15"
            TextBox6.ForeColor = Drawing.Color.Red
        ElseIf TextBox2.Text <> TextBox3.Text Then
            TextBox6.Text = "Password and Confirm Password do not match"
            TextBox6.ForeColor = Drawing.Color.Red
        ElseIf Not IsValidEmail(TextBox4.Text) Then
            TextBox6.Text = "Email is invalid"
            TextBox6.ForeColor = Drawing.Color.Red
        ElseIf Not AgeCheck() Then
            TextBox6.Text = "Age should be between 21 and 30 only"
            TextBox6.ForeColor = Drawing.Color.Red
        Else
            TextBox6.Text = "Login successful"
            TextBox6.ForeColor = Drawing.Color.Green
        End If
    End Sub

    Private Function ValidateInputs() As Boolean
        Return String.IsNullOrEmpty(TextBox1.Text) Or String.IsNullOrEmpty(TextBox2.Text) Or String.IsNullOrEmpty(TextBox3.Text) Or String.IsNullOrEmpty(TextBox4.Text) Or String.IsNullOrEmpty(TextBox5.Text)
    End Function

    Private Function AgeCheck() As Boolean
        Dim a As Int32 = Convert.ToInt32(TextBox5.Text)
        Return a >= 21 And a <= 30
    End Function

    Private Function IsValidEmail(ByVal email As String) As Boolean
        Dim emailPattern As String = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$"
        Return Regex.IsMatch(email, emailPattern)
    End Function
End Class
