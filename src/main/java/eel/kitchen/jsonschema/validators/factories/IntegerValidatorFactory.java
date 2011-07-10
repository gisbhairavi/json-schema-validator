package eel.kitchen.jsonschema.validators.factories;

import eel.kitchen.jsonschema.validators.EnumValidator;
import eel.kitchen.jsonschema.validators.type.IntegerValidator;
import org.codehaus.jackson.JsonNode;

public final class IntegerValidatorFactory
    extends AbstractValidatorFactory
{
    public IntegerValidatorFactory(final JsonNode schemaNode)
    {
        super(schemaNode, "integer", IntegerValidator.class);

        if (schemaNode.has("enum"))
            validatorList.add(EnumValidator.class);
    }
}
