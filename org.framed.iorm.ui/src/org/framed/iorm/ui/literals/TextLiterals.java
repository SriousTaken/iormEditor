package org.framed.iorm.ui.literals;

import org.framed.iorm.ui.exceptions.*; //*import for javadoc link
import org.framed.iorm.ui.wizards.RoleModelWizardPage; //*import for javadoc link
import org.framed.iorm.ui.wizards.RoleModelWizard; //*import for javadoc link
import org.eclipse.ui.PartInitException; //*import for javadoc link
import org.framed.iorm.ui.multipage.MultipageEditor; //*import for javadoc link
import org.framed.iorm.ui.pattern.shapes.NaturalTypePattern; //*import for javadoc link
import org.framed.iorm.ui.wizards.EditRelationshipDialog; //*import for javadoc link

/**
 * This class saves severals static Strings used as messages for the user.
 * @author Kevin Kassin
 */
public class TextLiterals {

	/**
	 * messages used as direct editing tips
	 */
	public static final String DIRECTEDITING_ATTRIBUTES = "An attributes name has the form <name>:<type>.",
							   NAME_ALREADY_USED_ATTRIBUTES = "Another attribute already has the same name!",
							   DIRECTEDITING_OPERATIONS = "An operations name has the form <name>(<parameters>):<type>.",
							   NAME_ALREADY_USED_OPERATIONS = "Another operation already has the same name!",
							   DIRECTEDITING_DATATYPE = "A data types name cant be empty and cant contains spaces. Numbers are allowed but not as first symbol.",
							   NAME_ALREADY_USED_DATATYPE = "Another data type already has the same name!",
							   DIRECTEDITING_NATURALTYPE = "A natural types name cant be empty and cant contains spaces. Numbers are allowed but not as first symbol.",
							   NAME_ALREADY_USED_NATURALTYPE = "Another natural type already has the same name!",
							   DIRECTEDITING_GROUP = "A groups name cant be empty and cant contains spaces. Numbers are allowed but not as first symbol.",
							   NAME_ALREADY_USED_GROUP = "Another group already has the same name!",
							   DIRECTEDITING_COMPARTMENTTYPE = "A compartment types name cant be empty and cant contains spaces. Numbers are allowed but not as first symbol.",
							   NAME_ALREADY_USED_COMPARTMENTTYPE = "Another compartment type already has the same name!",
							   DIRECTEDITING_ROLETYPE = "A role types name cant be empty and cant contains spaces. Numbers are allowed but not as first symbol.",
							   NAME_ALREADY_USED_ROLETYPE = "Another role type in this compartment type already has the same name!",
							   DIRECTEDITING_OCCURRENCE_CONSTRAINT = "The Occurrence Constraint has to be in the form <0-9/*> or <0-9>..<0-9/*>!";
	
	/**
	 * messages and titles used in the {@link EditRelationshipDialog} as tips when invalid inputs happen
	 */
	public static final String EDITING_RELATIONSHIPS_NAME_INVALID_TITLE = "Relationships name is invalid!",
							   EDITING_RELATIONSHIPS_NAME_INVALID = "A relationships name cant be empty and cant contains spaces. Numbers are allowed but as first symbol!",
							   EDITING_RELATIONSHIPS_NAME_ALREADY_USED_TITLE = "Relationships name is already used!",
							   EDITING_RELATIONSHIPS_NAME_ALREADY_USED = "Another relationship already in this compartment type already has the same name!",
							   EDITING_RELATIONSHIPS_SOURCE_CARDINALITY_TITLE = "Relationships source cardinality is invalid!",
							   EDITING_RELATIONSHIPS_SOURCE_CARDINALITY = "The source cardinality has to be in the form <0-9/*> or <0-9>..<0-9/*>!",
							   EDITING_RELATIONSHIPS_TARGET_CARDINALITY_TITLE = "Relationships target cardinality is invalid!",
							   EDITING_RELATIONSHIPS_TARGET_CARDINALITY = "The target cardinality has to be in the form <0-9/*> or <0-9>..<0-9/*>!";
			
	/**
	 * reason messages used in the <em>updateNeeded</em> operations of the shape pattern
	 * <p>
	 * see {@link NaturalTypePattern#updateNeeded} for example
	 */
	public static final String REASON_NAME_NULL = "Name is null.",
							   REASON_NAME_OUT_OF_DATE = "Name is out of date.",
							   REASON_AMOUNT_ATTRIBUTES = "Different amount of attributes.",
							   REASON_AMOUNT_OPERATION = "Different amount of operations.",
							   REASON_NAMES_ATTRIBUTES = "Different names of attributes.",
							   REASON_NAMES_OPERATIONS = "Different names of operations.",
							   REASON_AMOUNT_ELEMENTS = "Different amount of elements.",
							   REASON_NAMES_ELEMENTS = "Different names of elements.",
							   REASON_OCCURRENCE_CONSTRAINTS = "Occurrence Constraint is out of date.";
	
	/**
	 * messages used in the feature sub editor
	 * <p>
	 * the message for the {@link FeatureModelNotReadableException}
	 */
	public static final String FEATUREMODEL_NOT_READABLE_MESSAGE = "The feature model could not be read!";
	
	/**
	 * the error message for the {@link NoDiagramFoundException}
	 */
	public static final String ERROR_NO_DIAGRAM_FOUND = "A diagram could not be found!";
		
	/**
	 * the error message for the {@link NoModelFoundException}
	 */
	public static final String ERROR_NO_MODEL_FOUND = "A model could not be found!";
	
	/**
	 * the message for the {@link FeatureHasNoPaletteDescriptorException}
	 */
	public static final String FEATURE_HAS_NO_DESCRIPTOR_MESSAGE = "A Feature has no palette descriptor: ";
	
	/**
	 * the message for the {@link TransformationFailedException}
	 */
	public static final String ERROR_TRANSFORMATION_FAILED = "The transformation of the IORM to the CROM failed!";
	
	/**
	 * messages used in the Eclipse wizards
	 * <p>
	 * can be:<br>
	 * (1) the label of the {@link RoleModelWizardPage} for the diagram name or<br>
	 * (2) the description message for the {@link RoleModelWizardPage} or<br>
	 * (3) the message for the user if his input for the diagrams name is invalid or<br>
	 * (4) the title of the error message if no project is selected at role model creation or<br>
	 * (5) the error message if no project is selected at role model creation or<br>
	 * (6) the warning for a risk of deadlock when creating a role model in {@link RoleModelWizard} or<br>
	 * (7) the message if saving the file of a new role model failed in {@link RoleModelWizard} 
	 */
	public static final String WIZARD_PAGE_LABEL = "Diagram Name",
							   WIZARD_PAGE_DESC = "Enter the name of the Role Model",
							   WIZARD_MESSAGE_INVALID_INPUT = "A diagrams name cant be empty and cant contains spaces. Numbers are allowed but as first symbol.",
							   WIZARD_ERROR_NO_PROJECT_TITLE = "No Project Selected",
							   WIZARD_ERROR_NO_PROJECT_TEXT = "Please choose a CROM project to create the role model in!",
							   WIZARD_ERROR_DEADLOCK_DANGER = "Saving called from within a command (likely produces a deadlock)",
							   WIZARD_ERROR_SAVING_FAILED = "Saving failed";			  
	
	/**
	 * messages used for the multipage editor
	 * <p>
	 * can be:<br>
	 * (1) the error message if the editor input can not be used for the {@link MultipageEditor} or<br>
	 * (2) the error message if the {@link MultipageEditor} could not gather a the file imput to refresh a file or<br>
	 * (3) the message of the workbench status line if there are unsaved changes or<br>
	 * (4) the title for the message dialog if there are unsaved changes in a different multipage editor than the active one or<br>
	 * (5) the text for the message dialog described in (5) or<br>
	 * (6) the message for {@link PartInitException} if the file editor input for a source could not be created
	 */
	public static final String MULTIPAGE_EDITOR_ERROR_NO_VALID_EDITOR_INPUT = "The editor input of the multipage editor is not of a valid type!",
							   MUTLIPAGE_EDITOR_ERROR_NULLPOINTER_ON_FILE_EDITOR_INPUT = "The file editor input used to refresh the file is null!",
							   STATUS_MESSAGE_UNSAVED_CHANGES = "Unsaved changes - the pages are out of sync!",
							   MESSAGE_UNSAVED_CHANGES_IN_OTHER_MULTIPAGE_EDITORS_TITLE = "Unsaved changes in other multipage editors!",
							   MESSAGE_UNSAVED_CHANGES_IN_OTHER_MULTIPAGE_EDITORS_TEXT = "There are unsaved changes in other opened mutlipage editors. "
									   + "Save these editors first to ensure no changes to the model get lost!",
							   MESSAGE_FILE_EDITOR_INPUT_FOR_RESOURCE_IS_NULL = "No file editor input could be created for a given resource!";
}
