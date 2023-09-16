package emoji;

import com.vdurmont.emoji.EmojiParser;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class EmojiPicker extends VBox {
    private ListView<String> emojiListView;

    public EmojiPicker() {
        // Load the emoji images
        List<String> emojis = new ArrayList<>();

        String[] emojiHtmlList = new String[]{"&#128524;","&#128546;","&#128523;","&#128513;","&#129303;",
        "&#128517;","&#128518;","&#10024;","&#128077;","&#128521;","&#128150;","&#129392;","&#127881;","&#128079;"};

        for (String em:emojiHtmlList) {
            emojis.add(EmojiParser.parseToUnicode(em));
        }

        emojiListView = new ListView<>();
        emojiListView.setItems(FXCollections.observableArrayList(emojis));

        HBox hBox = new HBox(emojiListView);
        hBox.setPadding(new Insets(10));

        getChildren().add(hBox);
    }

    public ListView<String> getEmojiListView() {
        return emojiListView;
    }
}
