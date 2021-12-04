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
	static String path = "C:/web1_오후_java/예약내역.txt";
		static String where = "당신은 어디에있습니까?";
		
		static Image wheremap ;
		public static void main(String[] args) {
			
			JFrame mainpage = new JFrame("메인화면");
			mainpage.setBounds(1200, 50, 500, 800);
			mainpage.setBackground(Color.black); // 배경색 화이트
			mainpage.setLayout(null);// 자동배치 끄기
			mainpage.setIconImage(Toolkit.getDefaultToolkit().getImage("썸카300.png"));

			//배경 이미지(로그인)
			ImageIcon main_img = new ImageIcon("main_back.png");
			JLabel mainimg = new JLabel(main_img);
			mainimg.setBounds(0, 0, 500, 800);
			
			Font mainfont = new Font("Arial", Font.CENTER_BASELINE, 20);
			
			
			//화면에 텍스트를 출력하는 클래스(Label)
			
			ImageIcon select_img = new ImageIcon("select_back.png");
			JLabel select = new JLabel(select_img);
			select.setBounds(20, 45, 450, 35);

			//선택상자
			Choice bt = new Choice();
			bt.setBounds(40, 85, 400, 0);
			bt.add("선택하세요");
			bt.add("신촌역");
			bt.add("홍대입구역");
			bt.add("이대역");
			bt.setFont(mainfont);

	
			
			//왼쪽 상단 메뉴
			ImageIcon menu_img = new ImageIcon("menu.png");
			JButton menu_btn = new JButton();
			menu_btn.setIcon(menu_img);
			menu_btn.setBounds(20, 10, 35, 35);
			menu_btn.setBorderPainted(false);
			menu_btn.setFocusPainted(false);
			menu_btn.setContentAreaFilled(false);
			mainpage.add(menu_btn);
			
			// 지도사진
			ImageIcon map_img = new ImageIcon("지도.png");
			ImageIcon sinchon_img = new ImageIcon("신촌역.png");
			ImageIcon hongdae_img = new ImageIcon("홍대입구역.png");
			ImageIcon idae_img = new ImageIcon("이대역.png");
			

	
			//맵 이미지
	
			
			JLabel map = new JLabel(map_img);
			map.setBackground(Color.red);
			map.setBounds(20,120, 450, 400);
	
			JLabel sinchon = new JLabel(sinchon_img);
			sinchon.setBackground(Color.red);
			sinchon.setBounds(20,120, 450, 400);
			

			
			
	
			//첫화면 아래에 텍스트
			
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
			//////////// 신촌 페이지 /////////////
			/////////////////////////////////
			/////////////////////////////////
			
			JFrame main2 = new JFrame("메인화면");
			main2.setBounds(1200, 50, 500, 800);
			main2.setBackground(Color.black); // 배경색 화이트
			main2.setLayout(null);// 자동배치 끄기
			main2.setIconImage(Toolkit.getDefaultToolkit().getImage("썸카300.png"));

			//배경 이미지(로그인)
			ImageIcon main_img2 = new ImageIcon("main_back.png");
			JLabel mainimg2 = new JLabel(main_img2);
			mainimg2.setBounds(0, 0, 500, 800);
			
			Font font2 = new Font("Arial", Font.CENTER_BASELINE, 20);
			
			
			//화면에 텍스트를 출력하는 클래스(Label)
			
			JLabel select2 = new JLabel(select_img);
			select2.setBounds(20, 45, 450, 35);
			
			
			
			//선택상자
			Choice bt2 = new Choice();
			bt2.setBounds(40, 85, 400, 0);
			bt2.add("선택하세요");
			bt2.add("신촌역");
			bt2.add("홍대입구역");
			bt2.add("이대역");
			bt2.setFont(font2);

	
			
			//왼쪽 상단 버튼
			
			ImageIcon menu_img2 = new ImageIcon("menu.png");
			JButton menu_btn2 = new JButton();
			menu_btn2.setIcon(menu_img2);
			menu_btn2.setBounds(20, 10, 35, 35);
			menu_btn2.setBorderPainted(false);
			menu_btn2.setFocusPainted(false);
			menu_btn2.setContentAreaFilled(false);
			main2.add(menu_btn2);
			
			
			ImageIcon map_img2 = new ImageIcon("지도.png");
			ImageIcon sinchon_img2 = new ImageIcon("신촌역.png");
			ImageIcon hongdae_img2 = new ImageIcon("홍대입구역.png");
			ImageIcon idae_img2 = new ImageIcon("이대역.png");
			

	
			//맵 이미지
	
			
			JLabel map2 = new JLabel(map_img2);
			map2.setBackground(Color.red);
			map2.setBounds(20,120, 450, 400);
	
			JLabel sinchon2 = new JLabel(sinchon_img2);
			sinchon2.setBackground(Color.red);
			sinchon2.setBounds(20,120, 450, 400);
			

			
			JButton pass_btn2 = new JButton();
			pass_btn2.setBounds(50, 550, 400, 150);
			pass_btn2.setContentAreaFilled(false); // 버튼 내부 투명
			pass_btn2.setBorderPainted(false); // 버튼 외곽선 없애기
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
			//////////// 신촌 페이지 /////////////
			/////////////////////////////////
			/////////////////////////////////
			//(jh)첫화면 프레임
			JFrame f = new JFrame("주차장 예매");
			ImageIcon ff = new ImageIcon("배경화면.png");
			JLabel ff1 = new JLabel(ff);
			ff1.setBounds(0,0,500,800);
			f.setBounds(1200,50,500,800);
			f.setLayout(null);
			
			//(jh)첫페이지 페널
			ImageIcon juchar = new ImageIcon("주차장.jpg");
			JLabel j = new JLabel(juchar);
			
			j.setBounds(0,0,600,270);
			
			ImageIcon ic2 = new ImageIcon("신촌역-주차장.png");
			JLabel p = new JLabel(ic2);
			p.setBounds(170,300,150,40);
			
			ImageIcon ic = new ImageIcon("요금안내.png");
			JLabel p1 = new JLabel(ic);
			p1.setBounds(200,395,90,40);
			
			
			ImageIcon ic1 = new ImageIcon("요금안내-하단-penel.png");
			JLabel p2 = new JLabel(ic1);
			p2.setBounds(110,470,270,140);
			
			//(jh)첫페이지 하단버튼
			ImageIcon bi = new ImageIcon("예약하기1.png");
			JButton buy = new JButton("예약하기");
			buy.setIcon(bi);
			ImageIcon ci = new ImageIcon("취소.png");
			JButton cancel = new JButton("취소");
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
			
			//예약버튼
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
			JButton b7 = new JButton("일일권");
			ImageIcon back8 = new ImageIcon("");
			JButton b8 = new JButton("정액권");
			ImageIcon back9 = new ImageIcon("");
			JButton b9 = new JButton("일주차");
			ImageIcon back10 = new ImageIcon("");
			JButton b10 = new JButton("월주차");
			ImageIcon back11 = new ImageIcon("");
			JButton b11 = new JButton("연주차");
			
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
			
			//선택화면
			JFrame f3 = new JFrame("선택");
			f3.setLayout(null);
			f3.setBounds(1320,400,270,200);
			f3.add(b7);
			f3.add(b8);
			
			//종일권 예약화면
			JFrame f4 = new JFrame("종일권");
			f4.setLayout(null);
			f4.setBounds(1320,370,260,260);
			f4.add(b9);
			f4.add(b10);
			f4.add(b11);
			
			//일일권 예약화면
			JFrame f2 = new JFrame("시간 설정");
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
								String id = "양준혁/";
								String msg = "0:30/";
								String money = "2000원";
								
								
								fw.write(id);
								fw.write(msg);
								fw.write(money);
								
								fw.close();
								
								
							
								
								JOptionPane.showMessageDialog(f2,"예약완료");
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
								String id = "양준혁/";
								String msg = "1:00/";
								String money = "4000원";
								
								
								fw.write(id);
								fw.write(msg);
								fw.write(money);
								
								fw.close();
								
								JOptionPane.showMessageDialog(f2,"예약완료");
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
								String id = "양준혁/";
								String msg = "1:30/";
								String money = "6000원";
								
								
								fw.write(id);
								fw.write(msg);
								fw.write(money);
								
								fw.close();
								
								JOptionPane.showMessageDialog(f2,"예약완료");
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
								String id = "양준혁/";
								String msg = "2:00/";
								String money = "8000원";
								
								
								fw.write(id);
								fw.write(msg);
								fw.write(money);
								
								fw.close();
								
								JOptionPane.showMessageDialog(f2,"예약완료");
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
								String id = "양준혁/";
								String msg = "2:30/";
								String money = "10000원";
								
								
								fw.write(id);
								fw.write(msg);
								fw.write(money);
								
								fw.close();
								
								JOptionPane.showMessageDialog(f2,"예약완료");
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
								String id = "양준혁/";
								String msg = "3:00/";
								String money = "12000원";
								
								
								fw.write(id);
								fw.write(msg);
								fw.write(money);
								
								fw.close();
								
								JOptionPane.showMessageDialog(f2,"예약완료");
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
							String id = "양준혁/";
							String msg = "일주차/";
							String money = "30000원";
							
							
							fw.write(id);
							fw.write(msg);
							fw.write(money);
							
							fw.close();
							
							JOptionPane.showMessageDialog(f4,"예약완료");
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
							String id = "양준혁/";
							String msg = "월주차/";
							String money = "100000원";
							
							
							fw.write(id);
							fw.write(msg);
							fw.write(money);
							
							fw.close();
							
							JOptionPane.showMessageDialog(f4,"예약완료");
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
						String id = "양준혁/";
						String msg = "연주차/";
						String money = "500000원";
						
						
						fw.write(id);
						fw.write(msg);
						fw.write(money);
						
						fw.close();
						
						JOptionPane.showMessageDialog(f4,"예약완료");
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
			
			
			//Choice에서 선택된 항목 알아내기
			bt.addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					
					mainpage.setVisible(false);
					main2.setVisible(true);
					where = "현재 " + bt.getSelectedItem() + " 인근에 있는 주차장입니다";
					wheremap = sinchon_img.getImage();
				}
			});
			
			//확인 버튼 클릭시 Choice에 어떤 항목이 선택되어 있는지를 구별하여
			//result레이블에 추가
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
//					System.out.println("버튼 누름 확인");
//					
//					// TODO 자동 생성된 메소드 스텁
//					
//				}
//			});
//			
//			
			mainpage.setVisible(true);
			
			mainpage.addWindowListener( new WindowAdapter() {

				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);	//열려있는 모든 프레임을 종료
					//f.dispose(); --> 현재 프레임만 종료
				};

			} );
		}
			
			
			public void itemStateChanged(ItemEvent e) {//choice의 상태가 바뀔때만 호출된다. 같은 것을 또 눌러줘도 바뀌지 않는다.
				int bt;
				// System.out.println(e.getItem());     
				if(e.getItem().equals("선택하세요")) {
					bt = 1;
				} else if(e.getItem().equals("신촌역")) {
					bt = 2;
				} else if(e.getItem().equals("홍대입구역")) {
					bt = 3;
				}
				
			
			
			
			
		}//main
	}


