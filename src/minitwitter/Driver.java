package minitwitter;

public class Driver {

    /**
     * main method : Trigger the Admin Control Panel
     *
     * @param args
     */
    public static void main(String[] args) {
        AdminControlPanel controlPanel = AdminControlPanel.getAdminControlPanel();
        controlPanel.setLocationRelativeTo(null);
        controlPanel.setVisible(true);
    }
    
}
