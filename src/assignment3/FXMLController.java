package assignment3;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;


public class FXMLController implements Initializable {



    @FXML
    private Button a;

    @FXML
    private Button b;

    @FXML
    private Button c;

    @FXML
    private Button d;

    @FXML
    private Button e;

    @FXML
    private Button f;

    @FXML
    private Button g;

    @FXML
    private Button h;

    @FXML
    private Button i;

    @FXML
    private Button j;

    @FXML
    private Button k;

    @FXML
    private Button l;

    @FXML
    private Button m;

    @FXML
    private Button n;

    @FXML
    private Button o;

    @FXML
    private Button p;

    @FXML
    private Button q;

    @FXML
    private Button r;

    @FXML
    private Button s;

    @FXML
    private Button t;

    @FXML
    private Button u;

    @FXML
    private Button v;

    @FXML
    private Button w;

    @FXML
    private Button x;

    @FXML
    private Button y;

    @FXML
    private Button z;

    @FXML
    private Button submit;

    @FXML
    private Button restart;

    @FXML
    private Label A;

    @FXML
    private Label B;

    @FXML
    private Label C;

    @FXML
    private Label D;

    @FXML
    private Label E;

    @FXML
    private Label I;

    @FXML
    private Label J;

    @FXML
    private Label K;

    @FXML
    private Label L;

    @FXML
    private Label M;

    @FXML
    private Label F;

    @FXML
    private Label G;

    @FXML
    private Label H;

    @FXML
    private Label N;

    @FXML
    private Label O;

    @FXML
    private Label P;

    @FXML
    private Label Q;

    @FXML
    private Label R;

    @FXML
    private Label S;

    @FXML
    private Label T;

    @FXML
    private Label U;

    @FXML
    private Label V;

    @FXML
    private Label W;

    @FXML
    private Label X;

    @FXML
    private Label Y;

    @FXML
    private Label Z;

    @FXML
    private Label userDisplay;

    @FXML
    private Label error;

    @FXML
    private Label point;

    @FXML
    private Label history;

    int[] alphabetBag = {9, 2, 2, 4, 12, 2, 3, 2, 8, 1, 1, 4, 2, 6, 8, 2, 1, 6, 4, 6, 4, 2, 2, 1, 2, 1};
    int[] tempAlphabetBag = {9, 2, 2, 4, 12, 2, 3, 2, 8, 1, 1, 4, 2, 6, 8, 2, 1, 6, 4, 6, 4, 2, 2, 1, 2, 1};

    String inputedWord = "", disHis = "";
    int checkUpperWordLimit = 1;
    boolean checkForVowel = false, checkForBlankWord = true, checkLowerWordLimit = true;
    int totalPoint = 0;

    ArrayList<String> History = new ArrayList<>();


    @FXML
    private void alphabetPressed(ActionEvent event){
//        System.out.println(a.getText());

        if(checkUpperWordLimit<=8){
            if(event.getSource() == a){
                checkUpperWordLimit++;
                inputedWord += "A";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == b){
                checkUpperWordLimit++;
                inputedWord += "B";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == c){
                checkUpperWordLimit++;
                inputedWord += "C";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == d){
                checkUpperWordLimit++;
                inputedWord += "D";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == e){
                checkUpperWordLimit++;
                inputedWord += "E";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == f){
                checkUpperWordLimit++;
                inputedWord += "F";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == g){
                checkUpperWordLimit++;
                inputedWord += "G";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == h){
                checkUpperWordLimit++;
                inputedWord += "H";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == i){
                checkUpperWordLimit++;
                inputedWord += "I";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == j){
                checkUpperWordLimit++;
                inputedWord += "J";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == k){
                checkUpperWordLimit++;
                inputedWord += "K";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == l){
                checkUpperWordLimit++;
                inputedWord += "L";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == m){
                checkUpperWordLimit++;
                inputedWord += "M";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == n){
                checkUpperWordLimit++;
                inputedWord += "N";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == o){
                checkUpperWordLimit++;
                inputedWord += "O";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == p){
                checkUpperWordLimit++;
                inputedWord += "P";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == q){
                checkUpperWordLimit++;
                inputedWord += "Q";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == r){
                checkUpperWordLimit++;
                inputedWord += "R";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == s){
                checkUpperWordLimit++;
                inputedWord += "S";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == t){
                checkUpperWordLimit++;
                inputedWord += "T";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == u){
                checkUpperWordLimit++;
                inputedWord += "U";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == v){
                checkUpperWordLimit++;
                inputedWord += "v";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == w){
                checkUpperWordLimit++;
                inputedWord += "W";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == x){
                checkUpperWordLimit++;
                inputedWord += "X";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == y){
                checkUpperWordLimit++;
                inputedWord += "Y";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == z){
                checkUpperWordLimit++;
                inputedWord += "Z";
                userDisplay.setText(inputedWord);
            }
        }
        else{
            error.setText("Word exceed Characters limit.");
        }
    }



    @FXML
    private void submitButtonPressed(ActionEvent event){
        scrabbleModel m1 = new scrabbleModel(inputedWord);

        try{
            m1.ValidateInput();
        }
        catch(Exception e){
            error.setText(e.getMessage());
        }
        // check for vowel
        checkForBlankWord = true;
        checkForVowel = false;
        checkLowerWordLimit = true;

        for(int i = 0; i < inputedWord.length(); i++){
            if(inputedWord.charAt(i) == 'A'|| inputedWord.charAt(i) == 'E'|| inputedWord.charAt(i) == 'I' || inputedWord.charAt(i) == 'O' || inputedWord.charAt(i) == 'U' || inputedWord.charAt(i) == 'Y') {
                checkForVowel = true;
            }
        }
        if(!checkForVowel){
            error.setText("Enter Word does not have any vowel.");
        }
        if(inputedWord.isEmpty()){
            error.setText("Word is Empty.");
            checkForBlankWord = false;
        }
        if(inputedWord.length() < 2){
            error.setText("Word dose not have enough Characters . ");
            checkLowerWordLimit = false;
        }

        if(checkForBlankWord == true && checkForVowel == true && checkLowerWordLimit == true){
            History.add(inputedWord);
            disHis += inputedWord + ", ";
            userDisplay.setText("");

            for(int i=0; i < inputedWord.length(); i++){
                if(inputedWord.charAt(i) == 'A'){
                    alphabetBag[0]--;
                    if(alphabetBag[0]==0){
                        A.setText(String.valueOf(alphabetBag[0]));
                        a.setDisable(true);
                    }
                    A.setText(String.valueOf(alphabetBag[0]));

                    totalPoint += 1;
                }
                if(inputedWord.charAt(i) == 'B'){
                    alphabetBag[1]--;
                    if(alphabetBag[1]==0){
                        B.setText(String.valueOf(alphabetBag[1]));
                        b.setDisable(true);
                    }
                    B.setText(String.valueOf(alphabetBag[1]));
                    totalPoint += 3;
                }
                if(inputedWord.charAt(i) == 'C'){
                    alphabetBag[2]--;
                    if(alphabetBag[1]==0){
                        C.setText(String.valueOf(alphabetBag[2]));
                        c.setDisable(true);
                    }
                    C.setText(String.valueOf(alphabetBag[2]));
                    totalPoint += 3;
                }
                if(inputedWord.charAt(i) == 'D'){
                    alphabetBag[3]--;
                    D.setText(String.valueOf(alphabetBag[3]));
                    totalPoint += 2;
                }
                if(inputedWord.charAt(i) == 'E'){
                    alphabetBag[4]--;
                    E.setText(String.valueOf(alphabetBag[4]));
                    totalPoint += 1;
                }
                if(inputedWord.charAt(i) == 'F'){
                    alphabetBag[5]--;
                    F.setText(String.valueOf(alphabetBag[5]));
                    totalPoint += 4;
                }
                if(inputedWord.charAt(i) == 'G'){
                    alphabetBag[6]--;
                    G.setText(String.valueOf(alphabetBag[6]));
                    totalPoint += 2;
                }
                if(inputedWord.charAt(i) == 'H'){
                    alphabetBag[7]--;
                    H.setText(String.valueOf(alphabetBag[7]));
                    totalPoint += 4;
                }
                if(inputedWord.charAt(i) == 'I'){
                    alphabetBag[8]--;
                    I.setText(String.valueOf(alphabetBag[8]));
                    totalPoint += 1;
                }
                if(inputedWord.charAt(i) == 'J'){
                    alphabetBag[9]--;
                    J.setText(String.valueOf(alphabetBag[9]));
                    totalPoint += 8;
                }
                if(inputedWord.charAt(i) == 'K'){
                    alphabetBag[10]--;
                    K.setText(String.valueOf(alphabetBag[10]));
                    totalPoint += 5;
                }
                if(inputedWord.charAt(i) == 'L'){
                    alphabetBag[11]--;
                    L.setText(String.valueOf(alphabetBag[11]));
                    totalPoint += 1;
                }
                if(inputedWord.charAt(i) == 'M'){
                    alphabetBag[12]--;
                    M.setText(String.valueOf(alphabetBag[12]));
                    totalPoint += 3;
                }
                if(inputedWord.charAt(i) == 'N'){
                    alphabetBag[13]--;
                    N.setText(String.valueOf(alphabetBag[13]));
                    totalPoint += 1;
                }
                if(inputedWord.charAt(i) == 'O'){
                    alphabetBag[14]--;
                    O.setText(String.valueOf(alphabetBag[14]));
                    totalPoint += 1;
                }
                if(inputedWord.charAt(i) == 'P'){
                    alphabetBag[15]--;
                    P.setText(String.valueOf(alphabetBag[15]));
                    totalPoint += 3;
                }
                if(inputedWord.charAt(i) == 'Q'){
                    alphabetBag[16]--;
                    Q.setText(String.valueOf(alphabetBag[16]));
                    totalPoint += 10;
                }
                if(inputedWord.charAt(i) == 'R'){
                    alphabetBag[17]--;
                    R.setText(String.valueOf(alphabetBag[17]));
                    totalPoint += 1;
                }
                if(inputedWord.charAt(i) == 'S'){
                    alphabetBag[18]--;
                    S.setText(String.valueOf(alphabetBag[18]));
                    totalPoint += 1;
                }
                if(inputedWord.charAt(i) == 'T'){
                    alphabetBag[19]--;
                    T.setText(String.valueOf(alphabetBag[19]));
                    totalPoint += 1;
                }
                if(inputedWord.charAt(i) == 'U'){
                    alphabetBag[20]--;
                    U.setText(String.valueOf(alphabetBag[20]));
                    totalPoint += 1;
                }
                if(inputedWord.charAt(i) == 'V'){
                    alphabetBag[21]--;
                    V.setText(String.valueOf(alphabetBag[21]));
                    totalPoint += 4;
                }
                if(inputedWord.charAt(i) == 'W'){
                    alphabetBag[22]--;
                    W.setText(String.valueOf(alphabetBag[22]));
                    totalPoint += 4;
                }
                if(inputedWord.charAt(i) == 'X'){
                    alphabetBag[23]--;
                    X.setText(String.valueOf(alphabetBag[23]));
                    totalPoint += 8;
                }
                if(inputedWord.charAt(i) == 'Y'){
                    alphabetBag[24]--;
                    Y.setText(String.valueOf(alphabetBag[24]));
                    totalPoint += 4;
                }
                if(inputedWord.charAt(i) == 'Z'){
                    alphabetBag[25]--;
                    Z.setText(String.valueOf(alphabetBag[25]));
                    totalPoint += 10;
                }
            }

            point.setText(String.valueOf(totalPoint));
            inputedWord = "";
            checkUpperWordLimit = 1;
            history.setText(disHis);
            error.setText("");
        }
    }

    @FXML
    private void restartButtonPressed(ActionEvent event){
        for(int i=0; i<alphabetBag.length; i++){
            alphabetBag[i] = tempAlphabetBag[i];
        }

        inputedWord = "";
        disHis = "";
        point.setText("");
        checkUpperWordLimit = 1;
        checkForVowel = false;
        checkForBlankWord = true;
        checkLowerWordLimit = true;
        totalPoint = 0;
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        A.setText("9");
        B.setText("2");
        C.setText("2");
        D.setText("4");
        E.setText("12");
        F.setText("2");
        G.setText("3");
        H.setText("2");
        I.setText("8");
        J.setText("1");
        K.setText("1");
        L.setText("4");
        M.setText("2");
        N.setText("6");
        O.setText("8");
        P.setText("2");
        Q.setText("1");
        R.setText("6");
        S.setText("4");
        T.setText("6");
        U.setText("4");
        V.setText("2");
        W.setText("2");
        X.setText("1");
        Y.setText("2");
        Z.setText("1");
    }



}

