package org.kie.internal.command;

import org.kie.api.command.Command;
import org.kie.api.command.KieCommands;
import org.kie.api.pmml.PMMLRequestData;

public interface ExtendedKieCommands extends KieCommands {

    Command newEnableAuditLog( String directory, String filename );

    Command newEnableAuditLog( String filename );

    Command newClearActivationGroup(String name);

    Command newClearAgenda();

    Command newClearAgendaGroup(String name);

    Command newClearRuleFlowGroup(String name);
    
    Command newApplyPmmlModel(PMMLRequestData request);
}
