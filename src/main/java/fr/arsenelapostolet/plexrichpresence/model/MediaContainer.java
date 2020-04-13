
package fr.arsenelapostolet.plexrichpresence.model;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class MediaContainer {

    public Integer size;
    public List<Metadatum> Metadata = null;
}
