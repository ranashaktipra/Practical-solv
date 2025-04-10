Partial Class _Default
    Inherits System.Web.UI.Page

    Shared good As Integer = 0
    Shared satisfactory As Integer = 0
    Shared bad As Integer = 0
    Shared total As Integer = 0

    Protected Sub btnVote_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnVote.Click
        If rbGood.Checked Then
            good += 1
        ElseIf rbSatisfactory.Checked Then
            satisfactory += 1
        ElseIf rbBad.Checked Then
            bad += 1
        End If

        total = good + satisfactory + bad

        If total > 0 Then
            lblGood.Text = String.Format(" ({0}%)", (good * 100 / total))
            lblSatisfactory.Text = String.Format(" ({0}%)", (satisfactory * 100 / total))
            lblBad.Text = String.Format(" ({0}%)", (bad * 100 / total))
        End If
    End Sub
End Class
