import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Iface extends JFrame
{
    private JPanel contentPane;    //内容面板
    private JTextField textField;    //文本框
    public String s = "";
    public String Ans = "";
    public static void main(String[] args)
    {
        Iface frame=new Iface();
        frame.setVisible(true);
    }
    public Iface()
    {
        setTitle("计算器");    //设置窗体的标题
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //设置窗体退出时操作
        setBounds(100, 100, 350, 380);    //设置窗体位置和大小
        setResizable(false);
        contentPane=new JPanel();    //创建内容面板
        contentPane.setBorder(new EmptyBorder(4,4,5,5));    //设置面板的边框
        contentPane.setLayout(new BorderLayout(0,0));    //设置内容面板为边界布局
        setContentPane(contentPane);    //应用内容面板
        JPanel panel1=new JPanel();    //新建面板用于保存文本框
        contentPane.add(panel1,BorderLayout.NORTH);    //将面板放置在边界布局的北部
        textField=new JTextField();    //新建文本框
        textField.setHorizontalAlignment(SwingConstants.RIGHT);    //文本框中的文本使用右对齐
        panel1.add(textField);    //将文本框增加到面板中
        textField.setColumns(30);    //设置文本框的列数是18
        textField.setFont(new Font("楷体",Font.BOLD,20));
        textField.setEnabled(false);

        JPanel panel2=new JPanel();    //新建面板用于保存按钮
        contentPane.add(panel2, BorderLayout.CENTER);    //将面板放置在边界布局的中央
        panel2.setLayout(new GridLayout(6,4,5,5));    //面板使用网格4X4布局
        JButton button01=new JButton("(");    //新建按钮
        panel2.add(button01);    //应用按钮
        JButton button02=new JButton(")");    //新建按钮
        panel2.add(button02);    //应用按钮
        JButton button03=new JButton("^");    //新建按钮
        panel2.add(button03);    //应用按钮
        JButton button04=new JButton("Sqrt");    //新建按钮
        panel2.add(button04);    //应用按钮
        JButton button05=new JButton("C");    //新建按钮
        panel2.add(button05);    //应用按钮
        JButton button06=new JButton("DEL");    //新建按钮
        panel2.add(button06);    //应用按钮
        JButton button07=new JButton("");    //新建按钮
        panel2.add(button07);    //应用按钮
        JButton button08=new JButton("/");    //新建按钮
        panel2.add(button08);    //应用按钮
        JButton button09=new JButton("7");    //新建按钮
        panel2.add(button09);    //应用按钮
        JButton button10=new JButton("8");    //新建按钮
        panel2.add(button10);    //应用按钮
        JButton button11=new JButton("9");    //新建按钮
        panel2.add(button11);    //应用按钮
        JButton button12=new JButton("*");    //新建按钮
        panel2.add(button12);    //应用按钮
        JButton button13=new JButton("4");    //新建按钮
        panel2.add(button13);    //应用按钮
        JButton button14=new JButton("5");    //新建按钮
        panel2.add(button14);    //应用按钮
        JButton button15=new JButton("6");    //新建按钮
        panel2.add(button15);    //应用按钮
        JButton button16=new JButton("-");    //新建按钮
        panel2.add(button16);    //应用按钮
        JButton button17=new JButton("1");    //新建按钮
        panel2.add(button17);    //应用按钮
        JButton button18=new JButton("2");    //新建按钮
        panel2.add(button18);    //应用按钮
        JButton button19=new JButton("3");    //新建按钮
        panel2.add(button19);    //应用按钮
        JButton button20=new JButton("+");    //新建按钮
        panel2.add(button20);    //应用按钮
        JButton button21=new JButton("Ans");    //新建按钮
        panel2.add(button21);    //应用按钮
        JButton button22=new JButton("0");    //新建按钮
        panel2.add(button22);    //应用按钮
        JButton button23=new JButton(".");    //新建按钮
        panel2.add(button23);    //应用按钮
        JButton button24=new JButton("=");    //新建按钮
        panel2.add(button24);    //应用按钮


        button01.addActionListener(new ActionListener()
                                   {
                                       public void actionPerformed(ActionEvent e)
                                       {
                                           s+="(";
                                           textField.setText(s);
                                       }
                                   }
        );
        button02.addActionListener(new ActionListener()
                                   {
                                       public void actionPerformed(ActionEvent e)
                                       {
                                           s+=")";
                                           textField.setText(s);
                                       }
                                   }
        );
        button03.addActionListener(new ActionListener()
                                   {
                                       public void actionPerformed(ActionEvent e)
                                       {
                                           s+="^";
                                           textField.setText(s);
                                       }
                                   }
        );
        button04.addActionListener(new ActionListener()
                                   {
                                       public void actionPerformed(ActionEvent e)
                                       {
                                           s+="√";
                                           textField.setText(s);
                                       }
                                   }
        );
        button05.addActionListener(new ActionListener()
                                   {
                                       public void actionPerformed(ActionEvent e)
                                       {
                                           s = "";
                                           textField.setText(s);
                                       }
                                   }
        );
        button06.addActionListener(new ActionListener()
                                   {
                                       public void actionPerformed(ActionEvent e)
                                       {
                                           s = s.substring(0,s.length()-1);
                                           textField.setText(s);
                                       }
                                   }
        );
        button07.addActionListener(new ActionListener()
                                   {
                                       public void actionPerformed(ActionEvent e)
                                       {
                                           s +="";
                                           textField.setText(s);
                                       }
                                   }
        );
        button08.addActionListener(new ActionListener()
                                   {
                                       public void actionPerformed(ActionEvent e)
                                       {
                                           s+="/";
                                           textField.setText(s);
                                       }
                                   }
        );
        button09.addActionListener(new ActionListener()
                                   {
                                       public void actionPerformed(ActionEvent e)
                                       {
                                           s+="7";
                                           textField.setText(s);
                                       }
                                   }
        );
        button10.addActionListener(new ActionListener()
                                   {
                                       public void actionPerformed(ActionEvent e)
                                       {
                                           s+="8";
                                           textField.setText(s);
                                       }
                                   }
        );
        button11.addActionListener(new ActionListener()
                                   {
                                       public void actionPerformed(ActionEvent e)
                                       {
                                           s+="9";
                                           textField.setText(s);
                                       }
                                   }
        );
        button12.addActionListener(new ActionListener()
                                   {
                                       public void actionPerformed(ActionEvent e)
                                       {
                                           s+="*";
                                           textField.setText(s);
                                       }
                                   }
        );
        button13.addActionListener(new ActionListener()
                                   {
                                       public void actionPerformed(ActionEvent e)
                                       {
                                           s+="4";
                                           textField.setText(s);
                                       }
                                   }
        );
        button14.addActionListener(new ActionListener()
                                   {
                                       public void actionPerformed(ActionEvent e)
                                       {
                                           s+="5";
                                           textField.setText(s);
                                       }
                                   }
        );
        button15.addActionListener(new ActionListener()
                                   {
                                       public void actionPerformed(ActionEvent e)
                                       {
                                           s+="6";
                                           textField.setText(s);
                                       }
                                   }
        );
        button16.addActionListener(new ActionListener()
                                   {
                                       public void actionPerformed(ActionEvent e)
                                       {
                                           s+="-";
                                           textField.setText(s);
                                       }
                                   }
        );
        button17.addActionListener(new ActionListener()
                                   {
                                       public void actionPerformed(ActionEvent e)
                                       {
                                           s+="1";
                                           textField.setText(s);
                                       }
                                   }
        );
        button18.addActionListener(new ActionListener()
                                   {
                                       public void actionPerformed(ActionEvent e)
                                       {
                                           s+="2";
                                           textField.setText(s);
                                       }
                                   }
        );
        button19.addActionListener(new ActionListener()
                                   {
                                       public void actionPerformed(ActionEvent e)
                                       {
                                           s+="3";
                                           textField.setText(s);
                                       }
                                   }
        );
        button20.addActionListener(new ActionListener()
                                   {
                                       public void actionPerformed(ActionEvent e)
                                       {
                                           s+="+";
                                           textField.setText(s);
                                       }
                                   }
        );
        button21.addActionListener(new ActionListener()
                                   {
                                       public void actionPerformed(ActionEvent e)
                                       {
                                           s+=Ans;
                                           textField.setText(s);
                                       }
                                   }
        );
        button22.addActionListener(new ActionListener()
                                   {
                                       public void actionPerformed(ActionEvent e)
                                       {
                                           s+="0";
                                           textField.setText(s);
                                       }
                                   }
        );
        button23.addActionListener(new ActionListener()
                                   {
                                       public void actionPerformed(ActionEvent e)
                                       {
                                           s+=".";
                                           textField.setText(s);
                                       }
                                   }
        );
        button24.addActionListener(new ActionListener()
                                   {
                                       public void actionPerformed(ActionEvent e)
                                       {

                                           s+="(";
                                           textField.setText(s);
                                       }
                                   }
        );
    }
}

