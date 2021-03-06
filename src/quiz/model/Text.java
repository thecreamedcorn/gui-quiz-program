/*
gui-quiz-program lets one take quizzes via a gui program
Copyright (C) 2017  Wil Gaboury

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package quiz.model;

/**
 * class that comprises of the data needed to represent a peice of text in the quiz
 */
public class Text implements QuizElement
    {
    private String text;

    public Text()
        {}

    /**
     * {@inheritDoc}
     */
    @Override
    public QuizElementType getType()
        { return QuizElementType.TEXT; }

    /**
     * @return a string of text
     */
    public String getText()
        { return text; }

    /**
     * sets the text
     * @param text the text
     */
    public void setText(String text)
        { this.text = text; }
    }
