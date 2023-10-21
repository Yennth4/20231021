/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Dialog.java to edit this template
 */
package com.poly.ui;

import com.poly.dao.KhoaHocDao;
import com.poly.dao.ThongKeDao;
import com.poly.entity.KhoaHoc;
import com.poly.utils.Auth;
import com.poly.utils.XImage;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class TongHopThongKeDiaLog extends java.awt.Dialog {

    /**
     * Creates new form TongHopThongKeDiaLog
     */
    public TongHopThongKeDiaLog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbxKhoaHoc = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBangDiem = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNguoiHoc = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblChuyenDe = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbxNam = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDoanhThu = new javax.swing.JTable();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("TỔNG HỢP THỐNG KÊ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Khóa học");

        tblBangDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã NH", "Họ và tên", "Điểm", "Xếp loại"
            }
        ));
        jScrollPane1.setViewportView(tblBangDiem);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxKhoaHoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        tabs.addTab("Bảng điểm", jPanel4);

        tblNguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Năm", "Số NH", "ĐK sớm nhất", "ĐK muộn nhất"
            }
        ));
        jScrollPane2.setViewportView(tblNguoiHoc);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        tabs.addTab("Người học", jPanel3);

        tblChuyenDe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Chuyên đề", "SL HV", "Điểm TN", "Điểm CN", "Điểm TB"
            }
        ));
        jScrollPane3.setViewportView(tblChuyenDe);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        tabs.addTab("Điểm chuyên đề", jPanel1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Năm");

        tblDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblDoanhThu);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxNam, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabs.addTab("Doanh thu", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tabs))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TongHopThongKeDiaLog dialog = new TongHopThongKeDiaLog(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<KhoaHoc> cbxKhoaHoc;
    private javax.swing.JComboBox<String> cbxNam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblBangDiem;
    private javax.swing.JTable tblChuyenDe;
    private javax.swing.JTable tblDoanhThu;
    private javax.swing.JTable tblNguoiHoc;
    // End of variables declaration//GEN-END:variables
     private void init() {
        this.setLocationRelativeTo(null);
        this.setIconImage(XImage.getApplImage());
        fillComboBoxKhoaHoc();
        fillTableBangDiem();
        fillTableNguoiHoc();
        fillTableChuyenDe();
        fillComboBoxNam();
        fillTableDoanhThu();

        this.selectTab(0);
        if (!Auth.isManager()) {
            tabs.remove(3);
        }
    }

    void selectTab(int index) {
        tabs.setSelectedIndex(index);
    }

    ThongKeDao dao = new ThongKeDao();
    KhoaHocDao khdao = new KhoaHocDao();

    private void fillComboBoxKhoaHoc() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbxKhoaHoc.getModel();
        model.removeAllElements();

        List<KhoaHoc> list = khdao.selectAll();
        for (KhoaHoc kh : list) {
            model.addElement(kh);
        }
    }

    private void fillTableBangDiem() {
        DefaultTableModel model = (DefaultTableModel) tblBangDiem.getModel();
        model.setRowCount(0);
        KhoaHoc kh = (KhoaHoc) cbxKhoaHoc.getSelectedItem();
        List<Object[]> list = dao.getBangDiem(kh.getMaKH());
        for (Object[] row : list) {
            double diem = (double) row[2];
            model.addRow(new Object[]{row[0], row[1], diem, getXepLoai(diem)});
        }
    }

    String getXepLoai(double diem) {
        if (diem < 5) {
            return "Chưa đạt";
        }
        if (diem < 6.5) {
            return "Trung bình";
        }
        if (diem < 5) {
            return "Khá";
        }
        if (diem < 5) {
            return "Giỏi";
        }
        return "Xuất sắc";
    }

    private void fillTableNguoiHoc() {
        DefaultTableModel model = (DefaultTableModel) tblNguoiHoc.getModel();
        model.setRowCount(0);
        List<Object[]> list = dao.getLuongNguoiHoc();
        for (Object[] row : list) {
            model.addRow(row);
        }
    }

    private void fillTableChuyenDe() {
        DefaultTableModel model = (DefaultTableModel) tblChuyenDe.getModel();
        model.setRowCount(0);
        List<Object[]> list = dao.getDiemChuyenDe();
        for (Object[] row : list) {
            model.addRow(new Object[]{row[0], row[1], row[2], row[3], row[4]});
        }
    }

    private void fillComboBoxNam() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbxNam.getModel();
        model.removeAllElements();
        List<Integer> list = khdao.selectYears();
        for(Integer year: list) {
            model.addElement(year);
        }
    }

    private void fillTableDoanhThu() {
        DefaultTableModel model =  (DefaultTableModel) tblDoanhThu.getModel();
        model.setRowCount(0);
        int nam = (Integer) cbxNam.getSelectedItem();
        List<Object[]> list = dao.getDoanhThu(nam);
        for(Object[] row : list) {
            model.addRow(row);
        }
    }
}
