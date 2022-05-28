package LAB_4.Part2.Service;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Service implements ActionListener {
    static JFrame frame;
    static JPanel panel;
    JFormattedTextField name,math,history,english,group,id,choose;
    JLabel A,B,C,D,F,G,H;
    JButton button,add;
    Integer h,ID;
    Double n,V;
    List<StudentDTO> datalist = new ArrayList<>();


    public void menu(){

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        frame = new JFrame("Тестирование знаний студентов");


        frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2  - frame.getSize().height / 2);

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel(){
            @Override
            public Dimension getPreferredSize(){
                return new Dimension(500,500);
            }
        };

        A = new JLabel();
        B = new JLabel();
        C = new JLabel();
        D = new JLabel();
        F = new JLabel();
        G = new JLabel();
        H = new JLabel();


        button = new JButton("OK");
        add = new JButton("Добавить");

        choose = new JFormattedTextField();
        name = new JFormattedTextField();
        group = new JFormattedTextField();
        id = new JFormattedTextField();
        math = new JFormattedTextField();
        history = new JFormattedTextField();
        english = new JFormattedTextField();

        id.setBounds(320,100,100,20);
        group.setBounds(320,60,100,20);
        name.setBounds(320,20,100,20);
        math.setBounds(320,140,100,20);
        history.setBounds(320,180,100,20);
        english.setBounds(320,220,100,20);

        D.setBounds(20,20,300,20);
        A.setBounds(20,60,300,20);
        B.setBounds(20,100,300,20);
        C.setBounds(20,140,300,20);
        F.setBounds(20,180,300,20);
        G.setBounds(20,220,300,20);
        H.setBounds(250,10,130,20);

        H.setText("Menu");
        D.setText("1 - Добавить Студента");
        A.setText("2 - Найти Студента");
        B.setText("3 - Обновить студента");
        C.setText("4 - удалить студента");

        add.setBounds(120,440,130,20);

        choose.setBounds(250,460,130,20);
        button.setBounds(120,460,130,20);
        button.addActionListener( this);
        add.addActionListener(this);

        frame.add(A);
        frame.add(B);
        frame.add(C);
        frame.add(D);
        frame.add(F);
        frame.add(G);
        frame.add(H);
        frame.add(button);
        frame.add(add);
        frame.add(choose);
        frame.add(panel);

        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.pack();
        frame.setVisible(true);




    }


    @Override
    public void actionPerformed(ActionEvent e){
        JButton actionSource = (JButton) e.getSource();
        if (actionSource.equals(button)){

            h = Integer.parseInt(choose.getText());
            switch (h){
                case 1:
                    H.setText("Добавление нового студента");
                    D.setText("Имя: ");
                    A.setText("Группа: ");
                    B.setText("ID: ");
                    C.setText("Математика: ");
                    F.setText("История: ");
                    G.setText("Английский: ");
                    frame.add(A);
                    frame.add(B);
                    frame.add(C);
                    frame.add(D);
                    frame.add(F);
                    frame.add(G);
                    frame.add(H);
                    frame.add(name);
                    frame.add(group);
                    frame.add(id);
                    frame.add(math);
                    frame.add(history);
                    frame.add(english);
                    frame.add(panel);
                    frame.setLocationRelativeTo(null);
                    frame.setResizable(true);
                    frame.pack();
                    frame.setVisible(true);
                    JButton actionSource2 = (JButton) e.getSource();
                    if (actionSource2.equals(add)) {


                        ID = Integer.parseInt(id.getText());
                        create(name.getText(), group.getText(),ID, math.getText(), history.getText(), english.getText());

                    }


            }
        }
    }

    public void create(String name,String group,Integer id,String math,String hist,String eng){
        StudentDTO student = new StudentDTO();

        student.setName(name);
        student.setGroup(group);
        student.setId(id);

        student.getGrades().setMath(math);
        student.getGrades().setEnglish(eng);
        student.getGrades().setHistory(hist);
        datalist.add(student);


    }
}
