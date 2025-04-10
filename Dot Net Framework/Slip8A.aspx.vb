
Partial Class EmployeeListbox_Slip8_A
    Inherits System.Web.UI.Page


    Protected Sub TextBox1_TextChanged(sender As Object, e As EventArgs) Handles TextBox1.TextChanged

    End Sub

    Protected Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        TextBox1.Text = ListBox1.SelectedValue
    End Sub

    Protected Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Dim a As ListItem
        TextBox1.Text = ""
        For Each a In ListBox1.Items
            TextBox1.Text += " " & a.Text

        Next
    End Sub
End Class
