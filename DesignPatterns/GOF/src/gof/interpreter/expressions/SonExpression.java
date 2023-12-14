package gof.interpreter.expressions;

public class SonExpression implements Expression{
    private Expression fatherExpression = null;
    private Expression sonExpression = null;

    public SonExpression(Expression fatherExpression, Expression sonExpression) {
        this.fatherExpression = fatherExpression;
        this.sonExpression = sonExpression;
    }

    @Override
    public boolean interpret(String context) {
        return fatherExpression.interpret(context) && sonExpression.interpret(context);
    }
}
