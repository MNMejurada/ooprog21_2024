using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ProjectAppsDev1
{
    public partial class Form1 : Form
    {

        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string input = textBox1.Text.Trim(); 
            int ruleNumber;

            // Validate input
            if (int.TryParse(input, out ruleNumber) && ruleNumber >= 1 && ruleNumber <= 12)
            {
                label1.Text = GetRuleDescription(ruleNumber);
            }
            else
            {
                label1.Text = "Please enter a valid number between 1 and 12.";
            }

        }

        private string GetRuleDescription(int number)
        {
            switch (number)
            {
                case 1: return "Rule 1 Maintain silence, proper decorum, \r" +
                                "\nand discipline inside the laboratory. \r" +
                                "\nMobile phones, walkmans and other \r" +
                                "\npersonal pieces of equipment must be switched off.\r\n";

                case 2: return "Rule 2Games are not allowed inside the lab. \r" +
                                "\nThis includes computer-related games, \r" +
                                "\ncard games and other games that may disturb the operation of the lab.";

                case 3: return "Rule 3 Surfing the Internet is allowed only with the permission of the instructor. \r" +
                               "\nDownloading and installing of software are strictly prohibited.";

                case 4: return "Rule 4 Getting access to other websites not related to the course \r" +
                                "\n(especially pornographic and illicit sites) " +
                                "is strictly prohibited.\r\n";

                case 5: return "Rule 5 Deleting computer files and changing \r" +
                               "\nthe set-up of the computer is a major offense.";

                case 6: return "Rule 6 Observe computer time usage carefully. A fifteen-minute \r" +
                                "\nallowance is given for each use. Otherwise, the unit will be given \r" +
                                "\nto those who wish to \"sit-in\".";

                case 7: return "Rule 7 Observe proper decorum while inside the laboratory. \r" +
                                "\na. Do not get inside the lab unless the instructor is present.\r" +
                                "\nb. All bags, knapsacks, and the likes must be deposited at the counter.\r" +
                                "\nc. Follow the seating arrangement of your instructor.\r" +
                                "\nd. At the end of class, all software programs must be closed.\r" +
                                "\ne. Return all chairs to their proper places after using.\r\n";

                case 8: return "Rule 8 Chewing gum, eating, drinking, smoking, and other\r" +
                                "\nforms of vandalism are prohibited inside the lab.\r\n";

                case 9: return "Rule 9 Anyone causing a continual disturbance will be asked to leave the lab. \r" +
                                "\nActs or gestures offensive to the members of the community,\r" +
                                "\n including public display of physical intimacy, are not tolerated.";

                case 10: return "Rule 10 Persons exhibiting hostile or threatening behavior such as yelling, swearing, \r" +
                                "\nor disregarding requests made by lab personnel will be asked to leave the lab.";

                case 11: return "Rule 11 For serious offense, the lab personnel may call the \r" +
                                "\nCivil Security Office (CSU) for assistance.";

                case 12: return "Rule 12 Any technical problem or difficulty must be addressed to the \r" +
                                "\nlaboratory supervisor, student assistant or instructor immediately.";

                default: return "Invalid rule number.";
            }
        }

        private void label1_Click(object sender, EventArgs e)
        {
            label1.Text = "You’re proof that even evolution makes mistakes.";
            
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
