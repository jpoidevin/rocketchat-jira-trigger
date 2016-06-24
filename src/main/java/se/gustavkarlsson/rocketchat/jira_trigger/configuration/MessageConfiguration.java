package se.gustavkarlsson.rocketchat.jira_trigger.configuration;

import com.moandjiezana.toml.Toml;

public class MessageConfiguration {
	private static final String USERNAME_KEY = "username";
	private static final String ICON_URL_KEY = "icon_url";
	private static final String PRIORITY_COLORS_KEY = "priority_colors";
	private static final String DEFAULT_COLOR_KEY = "default_color";
	private static final String PRINT_DESCRIPTION_KEY = "print_description";
	private static final String PRINT_ASSIGNEE_KEY = "print_assignee";
	private static final String PRINT_STATUS_KEY = "print_status";
	private static final String PRINT_REPORTER_KEY = "print_reporter";
	private static final String PRINT_PRIORITY_KEY = "print_priority";
	private static final String PRINT_RESOLUTION_KEY = "print_resolution";
	private static final String PRINT_TYPE_KEY = "print_type";
	private static final String PRINT_CREATED_KEY = "print_created";
	private static final String PRINT_UPDATED_KEY = "print_updated";

	private static final boolean PRIORITY_COLORS_DEFAULT = true;
	private static final String DEFAULT_COLOR_DEFAULT = "#205081";
	private static final boolean PRINT_DESCRIPTION_DEFAULT = false;
	private static final boolean PRINT_ASSIGNEE_DEFAULT = true;
	private static final boolean PRINT_STATUS_DEFAULT = true;
	private static final boolean PRINT_REPORTER_DEFAULT = false;
	private static final boolean PRINT_PRIORITY_DEFAULT = false;
	private static final boolean PRINT_RESOLUTION_DEFAULT = false;
	private static final boolean PRINT_TYPE_DEFAULT = false;
	private static final boolean PRINT_CREATED_DEFAULT = false;
	private static final boolean PRINT_UPDATED_DEFAULT = false;

	private String username;
	private String iconUrl;
	private Boolean priorityColors;
	private String defaultColor;
	private Boolean printDescription;
	private Boolean printAssignee;
	private Boolean printStatus;
	private Boolean printReporter;
	private Boolean printPriority;
	private Boolean printResolution;
	private Boolean printCreated;
	private Boolean printUpdated;
	private Boolean printType;

	MessageConfiguration(Toml toml) throws ValidationException {
		try {
			username = toml.getString(USERNAME_KEY);
			iconUrl = toml.getString(ICON_URL_KEY);
			priorityColors = toml.getBoolean(PRIORITY_COLORS_KEY, PRIORITY_COLORS_DEFAULT);
			defaultColor = toml.getString(DEFAULT_COLOR_KEY, DEFAULT_COLOR_DEFAULT);
			printDescription = toml.getBoolean(PRINT_DESCRIPTION_KEY, PRINT_DESCRIPTION_DEFAULT);
			printAssignee = toml.getBoolean(PRINT_ASSIGNEE_KEY, PRINT_ASSIGNEE_DEFAULT);
			printStatus = toml.getBoolean(PRINT_STATUS_KEY, PRINT_STATUS_DEFAULT);
			printReporter = toml.getBoolean(PRINT_REPORTER_KEY, PRINT_REPORTER_DEFAULT);
			printPriority = toml.getBoolean(PRINT_PRIORITY_KEY, PRINT_PRIORITY_DEFAULT);
			printResolution = toml.getBoolean(PRINT_RESOLUTION_KEY, PRINT_RESOLUTION_DEFAULT);
			printCreated = toml.getBoolean(PRINT_CREATED_KEY, PRINT_CREATED_DEFAULT);
			printUpdated = toml.getBoolean(PRINT_UPDATED_KEY, PRINT_UPDATED_DEFAULT);
			printType = toml.getBoolean(PRINT_TYPE_KEY, PRINT_TYPE_DEFAULT);
		} catch (Exception e) {
			throw new ValidationException(e);
		}
	}

	public String getUsername() {
		return username;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public boolean isPriorityColors() {
		return priorityColors;
	}

	public String getDefaultColor() {
		return defaultColor;
	}

	public boolean isPrintDescription() {
		return printDescription;
	}

	public boolean isPrintAssignee() {
		return printAssignee;
	}

	public boolean isPrintStatus() {
		return printStatus;
	}

	public boolean isPrintReporter() {
		return printReporter;
	}

	public boolean isPrintPriority() {
		return printPriority;
	}

	public boolean isPrintResolution() {
		return printResolution;
	}

	public boolean isPrintCreated() {
		return printCreated;
	}

	public boolean isPrintUpdated() {
		return printUpdated;
	}

	public boolean isPrintType() {
		return printType;
	}
}
