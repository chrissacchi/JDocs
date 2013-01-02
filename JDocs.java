/*
* JDocs - The simple temporary note taker.
* 2012 Christopher P. Sacchi chris.sacchi@gmail.com
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*
*/
import javax.swing.*;
import java.awt.*;
public class JDocs extends JFrame
{
	JPanel jp1 = new JPanel();
	JLabel jl1 = new JLabel("Type text, minimize your window, and do something else. When you forget something, look it up in our editor.");
	JTextArea ja1 = new JTextArea(65, 65);
	public JDocs()
	{
		ja1.setEditable(true);
		ja1.setLineWrap(true);
		setTitle("JDocs");
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		jp1.add(jl1);
		jp1.add(ja1);
		add(jp1);
		validate();
	}
	
	public static void main(String[] args)
	{
		JDocs j = new JDocs();
	} 
}
