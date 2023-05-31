import javafx.application.Application
import javafx.geometry.Insets
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.scene.layout.GridPane
import javafx.scene.layout.HBox
import javafx.stage.Stage
import org.apache.poi.hssf.usermodel.HSSFWorkbook
import java.io.FileOutputStream
import javax.mail.*
import javax.mail.internet.InternetAddress
import javax.mail.internet.MimeMessage

class RegistrationForm : Application() {

    private lateinit var firstNameField: TextField
    private lateinit var lastNameField: TextField
    private lateinit var emailField: TextField
    private lateinit var phoneField: TextField
    private lateinit var courseField: TextField

    override fun start(primaryStage: Stage) {
        val root = GridPane()
        root.padding = Insets(10.0)
        root.hgap = 10.0
        root.vgap = 10.0

        val titleLabel = Label("Course Enrollment Form")
        titleLabel.style = "-fx-font-size: 24px;"
        titleLabel.padding = Insets(0.0, 0.0, 10.0, 0.0)

        val firstNameLabel = Label("First Name:")
        firstNameField = TextField()


        val emailLabel = Label("Email:")
        emailField = TextField()

        val phoneLabel = Label("Phone:")
        phoneField = TextField()

        val courseLabel = Label("Course:")
        courseField = TextField()

        val lastNameLabel = Label("Topic :")
        lastNameField = TextField()
        val submitButton = Button("Submit")
        submitButton.style = "-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-padding: 5px 10px;"
        submitButton.setOnAction { submitForm() }

        val hbox = HBox()
        hbox.children.addAll(submitButton)