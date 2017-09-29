
package entity;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "equipmentCodes",
    "model"
})
public class Eleganz {

    @JsonProperty("equipmentCodes")
    private EquipmentCodes__ equipmentCodes;
    @JsonProperty("model")
    private Integer model;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("equipmentCodes")
    public EquipmentCodes__ getEquipmentCodes() {
        return equipmentCodes;
    }

    @JsonProperty("equipmentCodes")
    public void setEquipmentCodes(EquipmentCodes__ equipmentCodes) {
        this.equipmentCodes = equipmentCodes;
    }

    @JsonProperty("model")
    public Integer getModel() {
        return model;
    }

    @JsonProperty("model")
    public void setModel(Integer model) {
        this.model = model;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
