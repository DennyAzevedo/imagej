package wfentity;

import java.util.HashMap;
import java.util.UUID;

import wfapi.EntityBase;

/**
 * Connection represents a directional relationship between two objects (always A to B). 
 */
public class Connection extends EntityBase 
{
	private UUID fromIdentifier;
	private UUID toIdentifier;
	
	public Connection( UUID fromIdentifier, UUID toIdentifier, HashMap<String, Object> propertyHashMap, UUID identifier )
	{
		this.identifier = identifier;
		this.propertyHashMap = propertyHashMap;
		this.fromIdentifier = fromIdentifier; 
		this.toIdentifier = toIdentifier;
	}

	public UUID getFromIdentifier() {
		return fromIdentifier;
	}

	public void setFromIdentifier(UUID fromIdentifier) {
		this.fromIdentifier = fromIdentifier;
	}

	public UUID getToIdentifier() {
		return toIdentifier;
	}

	public void setToIdentifier(UUID toIdentifier) {
		this.toIdentifier = toIdentifier;
	}
	
	
	
}
