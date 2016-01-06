package example.reporting.api.scenario;

import example.reporting.api.shared.BasicInfo;
import org.mongodb.morphia.annotations.Id;

import java.util.HashSet;
import java.util.Set;

public class ScenarioListItemView {

    @Id
    private String id;

    private BasicInfo info;

    private Set<String> tags = new HashSet<>();

    private StepStatus status;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public BasicInfo getInfo() {
        return info;
    }

    public void setInfo(BasicInfo info) {
        this.info = info;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(final Set<String> tags) {
        this.tags = tags;
    }

    public StepStatus getStatus() {
        return status;
    }

    public void setStatus(StepStatus status) {
        this.status = status;
    }

}