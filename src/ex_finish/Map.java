package ex_finish;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Map {
	static String path = "C:/web1_����_java/���೻��.txt";
		static String where = "����� ����ֽ��ϱ�?";
		
		static Image wheremap ;
		public static void main(String[] args) {
			
			JFrame mainpage = new JFrame("����ȭ��");
			mainpage.setBounds(1200, 50, 500, 800);
			mainpage.setBackground(Color.black); // ���� ȭ��Ʈ
			mainpage.setLayout(null);// �ڵ���ġ ����
			mainpage.setIconImage(Toolkit.getDefaultToolkit().getImage("��ī300.png"));

			//��� �̹���(�α���)
			ImageIcon main_img = new ImageIcon("main_back.png");
			JLabel mainimg = new JLabel(main_img);
			mainimg.setBounds(0, 0, 500, 800);
			
			Font mainfont = new Font("Arial", Font.CENTER_BASELINE, 20);
			
			
			//ȭ�鿡 �ؽ�Ʈ�� ����ϴ� Ŭ����(Label)
			
			ImageIcon select_img = new ImageIcon("select_back.png");
			JLabel select = new JLabel(select_img);
			select.setBounds(20, 45, 450, 35);

			//���û���
			Choice bt = new Choice();
			bt.setBounds(40, 85, 400, 0);
			bt.add("�����ϼ���");
			bt.add("���̿�");
			bt.add("ȫ���Ա���");
			bt.add("�̴뿪");
			bt.setFont(mainfont);

	
			
			//���� ��� �޴�
			ImageIcon menu_img = new ImageIcon("menu.png");
			JButton menu_btn = new JButton();
			menu_btn.setIcon(menu_img);
			menu_btn.setBounds(20, 10, 35, 35);
			menu_btn.setBorderPainted(false);
			menu_btn.setFocusPainted(false);
			menu_btn.setContentAreaFilled(false);
			mainpage.add(menu_btn);
			
			// ��������
			ImageIcon map_img = new ImageIcon("����.png");
			ImageIcon sinchon_img = new ImageIcon("���̿�.png");
			ImageIcon hongdae_img = new ImageIcon("ȫ���Ա���.png");
			ImageIcon idae_img = new ImageIcon("�̴뿪.png");
			

	
			//�� �̹���
	
			
			JLabel map = new JLabel(map_img);
			map.setBackground(Color.red);
			map.setBounds(20,120, 450, 400);
	
			JLabel sinchon = new JLabel(sinchon_img);
			sinchon.setBackground(Color.red);
			sinchon.setBounds(20,120, 450, 400);
			

			
			
	
			//ùȭ�� �Ʒ��� �ؽ�Ʈ
			
			ImageIcon result_img = new ImageIcon("result_back.png");
			JLabel result = new JLabel(result_img);
			result.setBounds(20, 530, 450, 200);
			

			//EtchedBorder border2 = new EtchedBorder(EtchedBorder.LOWERED);
		//	result2.setBorder(border2);
			
		
			mainpage.add(map);
			mainpage.add(select);
			mainpage.add(bt);
			mainpage.add(result);
			mainpage.add(mainimg);
			/////////////////////////////////
			/////////////////////////////////
			//////////// ���� ������ /////////////
			/////////////////////////////////
			/////////////////////////////////
			
			JFrame main2 = new JFrame("����ȭ��");
			main2.setBounds(1200, 50, 500, 800);
			main2.setBackground(Color.black); // ���� ȭ��Ʈ
			main2.setLayout(null);// �ڵ���ġ ����
			main2.setIconImage(Toolkit.getDefaultToolkit().getImage("��ī300.png"));

			//��� �̹���(�α���)
			ImageIcon main_img2 = new ImageIcon("main_back.png");
			JLabel mainimg2 = new JLabel(main_img2);
			mainimg2.setBounds(0, 0, 500, 800);
			
			Font font2 = new Font("Arial", Font.CENTER_BASELINE, 20);
			
			
			//ȭ�鿡 �ؽ�Ʈ�� ����ϴ� Ŭ����(Label)
			
			JLabel select2 = new JLabel(select_img);
			select2.setBounds(20, 45, 450, 35);
			
			
			
			//���û���
			Choice bt2 = new Choice();
			bt2.setBounds(40, 85, 400, 0);
			bt2.add("�����ϼ���");
			bt2.add("���̿�");
			bt2.add("ȫ���Ա���");
			bt2.add("�̴뿪");
			bt2.setFont(font2);

	
			
			//���� ��� ��ư
			
			ImageIcon menu_img2 = new ImageIcon("menu.png");
			JButton menu_btn2 = new JButton();
			menu_btn2.setIcon(menu_img2);
			menu_btn2.setBounds(20, 10, 35, 35);
			menu_btn2.setBorderPainted(false);
			menu_btn2.setFocusPainted(false);
			menu_btn2.setContentAreaFilled(false);
			main2.add(menu_btn2);
			
			
			ImageIcon map_img2 = new ImageIcon("����.png");
			ImageIcon sinchon_img2 = new ImageIcon("���̿�.png");
			ImageIcon hongdae_img2 = new ImageIcon("ȫ���Ա���.png");
			ImageIcon idae_img2 = new ImageIcon("�̴뿪.png");
			

	
			//�� �̹���
	
			
			JLabel map2 = new JLabel(map_img2);
			map2.setBackground(Color.red);
			map2.setBounds(20,120, 450, 400);
	
			JLabel sinchon2 = new JLabel(sinchon_img2);
			sinchon2.setBackground(Color.red);
			sinchon2.setBounds(20,120, 450, 400);
			

			
			JButton pass_btn2 = new JButton();
			pass_btn2.setBounds(50, 550, 400, 150);
			pass_btn2.setContentAreaFilled(false); // ��ư ���� ����
			pass_btn2.setBorderPainted(false); // ��ư �ܰ��� ���ֱ�
			pass_btn2.setContentAreaFilled(false);
			
			ImageIcon result2_img = new ImageIcon("result2_back.png");
			JLabel result2 = new JLabel(result2_img);
			result2.setBounds(20, 530, 450, 200);


			
			
			
			main2.add(pass_btn2);
			main2.add(sinchon2);
			main2.add(map2);
			main2.add(select2);
			main2.add(bt2);
			main2.add(result2);
			main2.add(mainimg2);
			
			
			
			/////////////////////////////////
			/////////////////////////////////
			//////////// ���� ������ /////////////
			/////////////////////////////////
			/////////////////////////////////
			//(jh)ùȭ�� ������
			JFrame f = new JFrame("������ ����");
			ImageIcon ff = new ImageIcon("���ȭ��.png");
			JLabel ff1 = new JLabel(ff);
			ff1.setBounds(0,0,500,800);
			f.setBounds(1200,50,500,800);
			f.setLayout(null);
			
			//(jh)ù������ ���
			ImageIcon juchar = new ImageIcon("������.jpg");
			JLabel j = new JLabel(juchar);
			
			j.setBounds(0,0,600,270);
			
			ImageIcon ic2 = new ImageIcon("���̿�-������.png");
			JLabel p = new JLabel(ic2);
			p.setBounds(170,300,150,40);
			
			ImageIcon ic = new ImageIcon("��ݾȳ�.png");
			JLabel p1 = new JLabel(ic);
			p1.setBounds(200,395,90,40);
			
			
			ImageIcon ic1 = new ImageIcon("��ݾȳ�-�ϴ�-penel.png");
			JLabel p2 = new JLabel(ic1);
			p2.setBounds(110,470,270,140);
			
			//(jh)ù������ �ϴܹ�ư
			ImageIcon bi = new ImageIcon("�����ϱ�1.png");
			JButton buy = new JButton("�����ϱ�");
			buy.setIcon(bi);
			ImageIcon ci = new ImageIcon("���.png");
			JButton cancel = new JButton("���");
			cancel.setIcon(ci);
			
			buy.setBounds(105,650,110,40);
			cancel.setBounds(280,650,110,40);
			
			buy.setBorderPainted(false);
			buy.setFocusPainted(false);
			buy.setContentAreaFilled(false);
			cancel.setBorderPainted(false);
			cancel.setFocusPainted(false);
			cancel.setContentAreaFilled(false);
			
			f.add(p);
			f.add(p1);
			f.add(p2);
			f.add(j);
			f.add(buy);
			f.add(cancel);
			f.add(ff1);
			
			//�����ư
			ImageIcon back1 = new ImageIcon("");
			JButton b1 = new JButton("0:30");
			ImageIcon back2 = new ImageIcon("");
			JButton b2 = new JButton("1:00");
			ImageIcon back3 = new ImageIcon("");
			JButton b3 = new JButton("1:30");
			ImageIcon back4 = new ImageIcon("");
			JButton b4 = new JButton("2:00");
			ImageIcon back5 = new ImageIcon("");
			JButton b5 = new JButton("2:30");
			ImageIcon back6 = new ImageIcon("");
			JButton b6 = new JButton("3:00");
			ImageIcon back7 = new ImageIcon("");
			JButton b7 = new JButton("���ϱ�");
			ImageIcon back8 = new ImageIcon("");
			JButton b8 = new JButton("���ױ�");
			ImageIcon back9 = new ImageIcon("");
			JButton b9 = new JButton("������");
			ImageIcon back10 = new ImageIcon("");
			JButton b10 = new JButton("������");
			ImageIcon back11 = new ImageIcon("");
			JButton b11 = new JButton("������");
			
			b1.setBounds(25,40,100,40);
			b2.setBounds(155,40,100,40);
			b3.setBounds(25,130,100,40);
			b4.setBounds(155,130,100,40);
			b5.setBounds(25,220,100,40);
			b6.setBounds(155,220,100,40);	
			b7.setBounds(15,50,100,40);
			b8.setBounds(135,50,100,40);
			b9.setBounds(15,40,100,40);
			b10.setBounds(125,40,100,40);
			b11.setBounds(72,130,100,40);
			
			//����ȭ��
			JFrame f3 = new JFrame("����");
			f3.setLayout(null);
			f3.setBounds(1320,400,270,200);
			f3.add(b7);
			f3.add(b8);
			
			//���ϱ� ����ȭ��
			JFrame f4 = new JFrame("���ϱ�");
			f4.setLayout(null);
			f4.setBounds(1320,370,260,260);
			f4.add(b9);
			f4.add(b10);
			f4.add(b11);
			
			//���ϱ� ����ȭ��
			JFrame f2 = new JFrame("�ð� ����");
			f2.setLayout(null);
			f2.setBounds(1320,300,300,370);
			f2.add(b1);
			f2.add(b2);
			f2.add(b3);
			f2.add(b4);
			f2.add(b5);
			f2.add(b6);
			
			buy.addActionListener(new ActionListener() {
				
				@Override
						public void actionPerformed(ActionEvent arg0) {
							
							f3.setVisible(true);
						}
					});
					
					b1.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
						
							
							try {
								FileWriter fw = new FileWriter(path);
								String id = "������/";
								String msg = "0:30/";
								String money = "2000��";
								
								
								fw.write(id);
								fw.write(msg);
								fw.write(money);
								
								fw.close();
								
								
							
								
								JOptionPane.showMessageDialog(f2,"����Ϸ�");
								f2.dispose();	
							} catch (Exception e) {
								e.printStackTrace();
							}
							
						
						}
					});
				
					
					b2.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
						
							
							try {
								FileWriter fw = new FileWriter(path);
								String id = "������/";
								String msg = "1:00/";
								String money = "4000��";
								
								
								fw.write(id);
								fw.write(msg);
								fw.write(money);
								
								fw.close();
								
								JOptionPane.showMessageDialog(f2,"����Ϸ�");
								f2.dispose();	
							} catch (Exception e) {
								e.printStackTrace();
							}
					
					
						};
					});
					
					b3.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							try {
								FileWriter fw = new FileWriter(path);
								String id = "������/";
								String msg = "1:30/";
								String money = "6000��";
								
								
								fw.write(id);
								fw.write(msg);
								fw.write(money);
								
								fw.close();
								
								JOptionPane.showMessageDialog(f2,"����Ϸ�");
								f2.dispose();	
							} catch (Exception e1) {
								e1.printStackTrace();
							}
							
						}
					});
					
			       b4.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							try {
								FileWriter fw = new FileWriter(path);
								String id = "������/";
								String msg = "2:00/";
								String money = "8000��";
								
								
								fw.write(id);
								fw.write(msg);
								fw.write(money);
								
								fw.close();
								
								JOptionPane.showMessageDialog(f2,"����Ϸ�");
								f2.dispose();	
							} catch (Exception e1) {
								e1.printStackTrace();
							}
							
						}
					});
			       
			       b5.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							try {
								FileWriter fw = new FileWriter(path);
								String id = "������/";
								String msg = "2:30/";
								String money = "10000��";
								
								
								fw.write(id);
								fw.write(msg);
								fw.write(money);
								
								fw.close();
								
								JOptionPane.showMessageDialog(f2,"����Ϸ�");
								f2.dispose();	
							} catch (Exception e1) {
								e1.printStackTrace();
							}
							
						}
					});
			       
			       b6.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							try {
								FileWriter fw = new FileWriter(path);
								String id = "������/";
								String msg = "3:00/";
								String money = "12000��";
								
								
								fw.write(id);
								fw.write(msg);
								fw.write(money);
								
								fw.close();
								
								JOptionPane.showMessageDialog(f2,"����Ϸ�");
								f2.dispose();	
							} catch (Exception e1) {
								e1.printStackTrace();
							}
							
						}
					});
			       
			       b7.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
					
						f2.setVisible(true);
						f3.dispose();
					}
					
				});
			       
			       b8.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						f4.setVisible(true);
						f3.dispose();
						
					}
				});
			       
			    b9.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						try {
							FileWriter fw = new FileWriter(path);
							String id = "������/";
							String msg = "������/";
							String money = "30000��";
							
							
							fw.write(id);
							fw.write(msg);
							fw.write(money);
							
							fw.close();
							
							JOptionPane.showMessageDialog(f4,"����Ϸ�");
							f4.dispose();	
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						
					}
				});   
			       
			       
			    b10.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						try {
							FileWriter fw = new FileWriter(path);
							String id = "������/";
							String msg = "������/";
							String money = "100000��";
							
							
							fw.write(id);
							fw.write(msg);
							fw.write(money);
							
							fw.close();
							
							JOptionPane.showMessageDialog(f4,"����Ϸ�");
							f4.dispose();	
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						
					}
				});

			    b11.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					
					try {
						FileWriter fw = new FileWriter(path);
						String id = "������/";
						String msg = "������/";
						String money = "500000��";
						
						
						fw.write(id);
						fw.write(msg);
						fw.write(money);
						
						fw.close();
						
						JOptionPane.showMessageDialog(f4,"����Ϸ�");
						f4.dispose();	
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					
				}
			});
			       
			       
					cancel.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							main2.setVisible(true);
							f.dispose();
						}
					});
			
			
			//Choice���� ���õ� �׸� �˾Ƴ���
			bt.addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					
					mainpage.setVisible(false);
					main2.setVisible(true);
					where = "���� " + bt.getSelectedItem() + " �αٿ� �ִ� �������Դϴ�";
					wheremap = sinchon_img.getImage();
				}
			});
			
			//Ȯ�� ��ư Ŭ���� Choice�� � �׸��� ���õǾ� �ִ����� �����Ͽ�
			//result���̺� �߰�
			pass_btn2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//
					main2.dispose();
					f.setVisible(true);
					
				}
			});
			
//			sinchon.addMouseListener(new MouseAdapter() {
//				@Override
//				public void mousePressed(MouseEvent e) {
//					System.out.println("��ư ���� Ȯ��");
//					
//					// TODO �ڵ� ������ �޼ҵ� ����
//					
//				}
//			});
//			
//			
			mainpage.setVisible(true);
			
			mainpage.addWindowListener( new WindowAdapter() {

				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);	//�����ִ� ��� �������� ����
					//f.dispose(); --> ���� �����Ӹ� ����
				};

			} );
		}
			
			
			public void itemStateChanged(ItemEvent e) {//choice�� ���°� �ٲ𶧸� ȣ��ȴ�. ���� ���� �� �����൵ �ٲ��� �ʴ´�.
				int bt;
				// System.out.println(e.getItem());     
				if(e.getItem().equals("�����ϼ���")) {
					bt = 1;
				} else if(e.getItem().equals("���̿�")) {
					bt = 2;
				} else if(e.getItem().equals("ȫ���Ա���")) {
					bt = 3;
				}
				
			
			
			
			
		}//main
	}


