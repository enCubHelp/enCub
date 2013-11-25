// Generated from grammar\PLSQL.g4 by ANTLR 4.1

package enCub.PLSQL.Parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PLSQLParser}.
 */
public interface PLSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xml_encoding_spec}.
	 * @param ctx the parse tree
	 */
	void enterXml_encoding_spec(@NotNull PLSQLParser.Xml_encoding_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xml_encoding_spec}.
	 * @param ctx the parse tree
	 */
	void exitXml_encoding_spec(@NotNull PLSQLParser.Xml_encoding_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#simple_case_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_case_expression(@NotNull PLSQLParser.Simple_case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#simple_case_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_case_expression(@NotNull PLSQLParser.Simple_case_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(@NotNull PLSQLParser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(@NotNull PLSQLParser.Schema_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#partition_name_old}.
	 * @param ctx the parse tree
	 */
	void enterPartition_name_old(@NotNull PLSQLParser.Partition_name_oldContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#partition_name_old}.
	 * @param ctx the parse tree
	 */
	void exitPartition_name_old(@NotNull PLSQLParser.Partition_name_oldContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#bestn}.
	 * @param ctx the parse tree
	 */
	void enterBestn(@NotNull PLSQLParser.BestnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#bestn}.
	 * @param ctx the parse tree
	 */
	void exitBestn(@NotNull PLSQLParser.BestnContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#defaultname}.
	 * @param ctx the parse tree
	 */
	void enterDefaultname(@NotNull PLSQLParser.DefaultnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#defaultname}.
	 * @param ctx the parse tree
	 */
	void exitDefaultname(@NotNull PLSQLParser.DefaultnameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#new_values_clause}.
	 * @param ctx the parse tree
	 */
	void enterNew_values_clause(@NotNull PLSQLParser.New_values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#new_values_clause}.
	 * @param ctx the parse tree
	 */
	void exitNew_values_clause(@NotNull PLSQLParser.New_values_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#character_types}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_types(@NotNull PLSQLParser.Character_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#character_types}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_types(@NotNull PLSQLParser.Character_typesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_ntile}.
	 * @param ctx the parse tree
	 */
	void enterFunction_ntile(@NotNull PLSQLParser.Function_ntileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_ntile}.
	 * @param ctx the parse tree
	 */
	void exitFunction_ntile(@NotNull PLSQLParser.Function_ntileContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#row_type}.
	 * @param ctx the parse tree
	 */
	void enterRow_type(@NotNull PLSQLParser.Row_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#row_type}.
	 * @param ctx the parse tree
	 */
	void exitRow_type(@NotNull PLSQLParser.Row_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_rank_aggregate}.
	 * @param ctx the parse tree
	 */
	void enterFunction_rank_aggregate(@NotNull PLSQLParser.Function_rank_aggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_rank_aggregate}.
	 * @param ctx the parse tree
	 */
	void exitFunction_rank_aggregate(@NotNull PLSQLParser.Function_rank_aggregateContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#open_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_statement(@NotNull PLSQLParser.Open_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#open_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_statement(@NotNull PLSQLParser.Open_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xmltable_options}.
	 * @param ctx the parse tree
	 */
	void enterXmltable_options(@NotNull PLSQLParser.Xmltable_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xmltable_options}.
	 * @param ctx the parse tree
	 */
	void exitXmltable_options(@NotNull PLSQLParser.Xmltable_optionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#levels}.
	 * @param ctx the parse tree
	 */
	void enterLevels(@NotNull PLSQLParser.LevelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#levels}.
	 * @param ctx the parse tree
	 */
	void exitLevels(@NotNull PLSQLParser.LevelsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xmltype}.
	 * @param ctx the parse tree
	 */
	void enterXmltype(@NotNull PLSQLParser.XmltypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xmltype}.
	 * @param ctx the parse tree
	 */
	void exitXmltype(@NotNull PLSQLParser.XmltypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#compiler_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void enterCompiler_parameters_clause(@NotNull PLSQLParser.Compiler_parameters_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#compiler_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void exitCompiler_parameters_clause(@NotNull PLSQLParser.Compiler_parameters_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_exp}.
	 * @param ctx the parse tree
	 */
	void enterFunction_exp(@NotNull PLSQLParser.Function_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_exp}.
	 * @param ctx the parse tree
	 */
	void exitFunction_exp(@NotNull PLSQLParser.Function_expContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#role}.
	 * @param ctx the parse tree
	 */
	void enterRole(@NotNull PLSQLParser.RoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#role}.
	 * @param ctx the parse tree
	 */
	void exitRole(@NotNull PLSQLParser.RoleContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#datetime_expr}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_expr(@NotNull PLSQLParser.Datetime_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#datetime_expr}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_expr(@NotNull PLSQLParser.Datetime_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#full_database_recovery}.
	 * @param ctx the parse tree
	 */
	void enterFull_database_recovery(@NotNull PLSQLParser.Full_database_recoveryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#full_database_recovery}.
	 * @param ctx the parse tree
	 */
	void exitFull_database_recovery(@NotNull PLSQLParser.Full_database_recoveryContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#interval_expr}.
	 * @param ctx the parse tree
	 */
	void enterInterval_expr(@NotNull PLSQLParser.Interval_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#interval_expr}.
	 * @param ctx the parse tree
	 */
	void exitInterval_expr(@NotNull PLSQLParser.Interval_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xmltype_document}.
	 * @param ctx the parse tree
	 */
	void enterXmltype_document(@NotNull PLSQLParser.Xmltype_documentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xmltype_document}.
	 * @param ctx the parse tree
	 */
	void exitXmltype_document(@NotNull PLSQLParser.Xmltype_documentContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(@NotNull PLSQLParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(@NotNull PLSQLParser.Function_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#supplemental_db_logging}.
	 * @param ctx the parse tree
	 */
	void enterSupplemental_db_logging(@NotNull PLSQLParser.Supplemental_db_loggingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#supplemental_db_logging}.
	 * @param ctx the parse tree
	 */
	void exitSupplemental_db_logging(@NotNull PLSQLParser.Supplemental_db_loggingContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_sys_context}.
	 * @param ctx the parse tree
	 */
	void enterFunction_sys_context(@NotNull PLSQLParser.Function_sys_contextContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_sys_context}.
	 * @param ctx the parse tree
	 */
	void exitFunction_sys_context(@NotNull PLSQLParser.Function_sys_contextContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_lag}.
	 * @param ctx the parse tree
	 */
	void enterFunction_lag(@NotNull PLSQLParser.Function_lagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_lag}.
	 * @param ctx the parse tree
	 */
	void exitFunction_lag(@NotNull PLSQLParser.Function_lagContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#modify_lob_parameters}.
	 * @param ctx the parse tree
	 */
	void enterModify_lob_parameters(@NotNull PLSQLParser.Modify_lob_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#modify_lob_parameters}.
	 * @param ctx the parse tree
	 */
	void exitModify_lob_parameters(@NotNull PLSQLParser.Modify_lob_parametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#class_value}.
	 * @param ctx the parse tree
	 */
	void enterClass_value(@NotNull PLSQLParser.Class_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#class_value}.
	 * @param ctx the parse tree
	 */
	void exitClass_value(@NotNull PLSQLParser.Class_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#proxy_clause}.
	 * @param ctx the parse tree
	 */
	void enterProxy_clause(@NotNull PLSQLParser.Proxy_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#proxy_clause}.
	 * @param ctx the parse tree
	 */
	void exitProxy_clause(@NotNull PLSQLParser.Proxy_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(@NotNull PLSQLParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(@NotNull PLSQLParser.Return_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#datafile_tempfile_spec}.
	 * @param ctx the parse tree
	 */
	void enterDatafile_tempfile_spec(@NotNull PLSQLParser.Datafile_tempfile_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#datafile_tempfile_spec}.
	 * @param ctx the parse tree
	 */
	void exitDatafile_tempfile_spec(@NotNull PLSQLParser.Datafile_tempfile_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#record_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterRecord_type_definition(@NotNull PLSQLParser.Record_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#record_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitRecord_type_definition(@NotNull PLSQLParser.Record_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#modify_col_substitutable}.
	 * @param ctx the parse tree
	 */
	void enterModify_col_substitutable(@NotNull PLSQLParser.Modify_col_substitutableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#modify_col_substitutable}.
	 * @param ctx the parse tree
	 */
	void exitModify_col_substitutable(@NotNull PLSQLParser.Modify_col_substitutableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#oracle_built_in_datatypes}.
	 * @param ctx the parse tree
	 */
	void enterOracle_built_in_datatypes(@NotNull PLSQLParser.Oracle_built_in_datatypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#oracle_built_in_datatypes}.
	 * @param ctx the parse tree
	 */
	void exitOracle_built_in_datatypes(@NotNull PLSQLParser.Oracle_built_in_datatypesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_ln}.
	 * @param ctx the parse tree
	 */
	void enterFunction_ln(@NotNull PLSQLParser.Function_lnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_ln}.
	 * @param ctx the parse tree
	 */
	void exitFunction_ln(@NotNull PLSQLParser.Function_lnContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#lob_segname}.
	 * @param ctx the parse tree
	 */
	void enterLob_segname(@NotNull PLSQLParser.Lob_segnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#lob_segname}.
	 * @param ctx the parse tree
	 */
	void exitLob_segname(@NotNull PLSQLParser.Lob_segnameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sqlcode_function}.
	 * @param ctx the parse tree
	 */
	void enterSqlcode_function(@NotNull PLSQLParser.Sqlcode_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sqlcode_function}.
	 * @param ctx the parse tree
	 */
	void exitSqlcode_function(@NotNull PLSQLParser.Sqlcode_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#drop_logfile_clauses}.
	 * @param ctx the parse tree
	 */
	void enterDrop_logfile_clauses(@NotNull PLSQLParser.Drop_logfile_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#drop_logfile_clauses}.
	 * @param ctx the parse tree
	 */
	void exitDrop_logfile_clauses(@NotNull PLSQLParser.Drop_logfile_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#like_condition}.
	 * @param ctx the parse tree
	 */
	void enterLike_condition(@NotNull PLSQLParser.Like_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#like_condition}.
	 * @param ctx the parse tree
	 */
	void exitLike_condition(@NotNull PLSQLParser.Like_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#char_name}.
	 * @param ctx the parse tree
	 */
	void enterChar_name(@NotNull PLSQLParser.Char_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#char_name}.
	 * @param ctx the parse tree
	 */
	void exitChar_name(@NotNull PLSQLParser.Char_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#large_object_datatypes}.
	 * @param ctx the parse tree
	 */
	void enterLarge_object_datatypes(@NotNull PLSQLParser.Large_object_datatypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#large_object_datatypes}.
	 * @param ctx the parse tree
	 */
	void exitLarge_object_datatypes(@NotNull PLSQLParser.Large_object_datatypesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#subpartition_template}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition_template(@NotNull PLSQLParser.Subpartition_templateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#subpartition_template}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition_template(@NotNull PLSQLParser.Subpartition_templateContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_cume_dist_analytic}.
	 * @param ctx the parse tree
	 */
	void enterFunction_cume_dist_analytic(@NotNull PLSQLParser.Function_cume_dist_analyticContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_cume_dist_analytic}.
	 * @param ctx the parse tree
	 */
	void exitFunction_cume_dist_analytic(@NotNull PLSQLParser.Function_cume_dist_analyticContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#environment_id_function}.
	 * @param ctx the parse tree
	 */
	void enterEnvironment_id_function(@NotNull PLSQLParser.Environment_id_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#environment_id_function}.
	 * @param ctx the parse tree
	 */
	void exitEnvironment_id_function(@NotNull PLSQLParser.Environment_id_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_numtodsinterval}.
	 * @param ctx the parse tree
	 */
	void enterFunction_numtodsinterval(@NotNull PLSQLParser.Function_numtodsintervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_numtodsinterval}.
	 * @param ctx the parse tree
	 */
	void exitFunction_numtodsinterval(@NotNull PLSQLParser.Function_numtodsintervalContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#numeric_subexpression}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_subexpression(@NotNull PLSQLParser.Numeric_subexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#numeric_subexpression}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_subexpression(@NotNull PLSQLParser.Numeric_subexpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#path_id_clause}.
	 * @param ctx the parse tree
	 */
	void enterPath_id_clause(@NotNull PLSQLParser.Path_id_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#path_id_clause}.
	 * @param ctx the parse tree
	 */
	void exitPath_id_clause(@NotNull PLSQLParser.Path_id_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#database_file_clauses}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_file_clauses(@NotNull PLSQLParser.Database_file_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#database_file_clauses}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_file_clauses(@NotNull PLSQLParser.Database_file_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#correlation_integer}.
	 * @param ctx the parse tree
	 */
	void enterCorrelation_integer(@NotNull PLSQLParser.Correlation_integerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#correlation_integer}.
	 * @param ctx the parse tree
	 */
	void exitCorrelation_integer(@NotNull PLSQLParser.Correlation_integerContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#replace_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterReplace_type_clause(@NotNull PLSQLParser.Replace_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#replace_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitReplace_type_clause(@NotNull PLSQLParser.Replace_type_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_timestamp_value}.
	 * @param ctx the parse tree
	 */
	void enterFunction_timestamp_value(@NotNull PLSQLParser.Function_timestamp_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_timestamp_value}.
	 * @param ctx the parse tree
	 */
	void exitFunction_timestamp_value(@NotNull PLSQLParser.Function_timestamp_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_months_between}.
	 * @param ctx the parse tree
	 */
	void enterFunction_months_between(@NotNull PLSQLParser.Function_months_betweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_months_between}.
	 * @param ctx the parse tree
	 */
	void exitFunction_months_between(@NotNull PLSQLParser.Function_months_betweenContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_collections_clauses}.
	 * @param ctx the parse tree
	 */
	void enterAlter_collections_clauses(@NotNull PLSQLParser.Alter_collections_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_collections_clauses}.
	 * @param ctx the parse tree
	 */
	void exitAlter_collections_clauses(@NotNull PLSQLParser.Alter_collections_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#packagename}.
	 * @param ctx the parse tree
	 */
	void enterPackagename(@NotNull PLSQLParser.PackagenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#packagename}.
	 * @param ctx the parse tree
	 */
	void exitPackagename(@NotNull PLSQLParser.PackagenameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#simple_comparison_condition}.
	 * @param ctx the parse tree
	 */
	void enterSimple_comparison_condition(@NotNull PLSQLParser.Simple_comparison_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#simple_comparison_condition}.
	 * @param ctx the parse tree
	 */
	void exitSimple_comparison_condition(@NotNull PLSQLParser.Simple_comparison_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xml_namespaces_clause}.
	 * @param ctx the parse tree
	 */
	void enterXml_namespaces_clause(@NotNull PLSQLParser.Xml_namespaces_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xml_namespaces_clause}.
	 * @param ctx the parse tree
	 */
	void exitXml_namespaces_clause(@NotNull PLSQLParser.Xml_namespaces_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#field_definition}.
	 * @param ctx the parse tree
	 */
	void enterField_definition(@NotNull PLSQLParser.Field_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#field_definition}.
	 * @param ctx the parse tree
	 */
	void exitField_definition(@NotNull PLSQLParser.Field_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#interval_year_to_month}.
	 * @param ctx the parse tree
	 */
	void enterInterval_year_to_month(@NotNull PLSQLParser.Interval_year_to_monthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#interval_year_to_month}.
	 * @param ctx the parse tree
	 */
	void exitInterval_year_to_month(@NotNull PLSQLParser.Interval_year_to_monthContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_chr}.
	 * @param ctx the parse tree
	 */
	void enterFunction_chr(@NotNull PLSQLParser.Function_chrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_chr}.
	 * @param ctx the parse tree
	 */
	void exitFunction_chr(@NotNull PLSQLParser.Function_chrContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(@NotNull PLSQLParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(@NotNull PLSQLParser.Assignment_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_clause(@NotNull PLSQLParser.Using_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_clause(@NotNull PLSQLParser.Using_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#flashback_mode_clause}.
	 * @param ctx the parse tree
	 */
	void enterFlashback_mode_clause(@NotNull PLSQLParser.Flashback_mode_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#flashback_mode_clause}.
	 * @param ctx the parse tree
	 */
	void exitFlashback_mode_clause(@NotNull PLSQLParser.Flashback_mode_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 */
	void enterInvoker_rights_clause(@NotNull PLSQLParser.Invoker_rights_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 */
	void exitInvoker_rights_clause(@NotNull PLSQLParser.Invoker_rights_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#using_statistics_type}.
	 * @param ctx the parse tree
	 */
	void enterUsing_statistics_type(@NotNull PLSQLParser.Using_statistics_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#using_statistics_type}.
	 * @param ctx the parse tree
	 */
	void exitUsing_statistics_type(@NotNull PLSQLParser.Using_statistics_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#return_opt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_opt(@NotNull PLSQLParser.Return_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#return_opt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_opt(@NotNull PLSQLParser.Return_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(@NotNull PLSQLParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(@NotNull PLSQLParser.SequenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_insertxmlafter}.
	 * @param ctx the parse tree
	 */
	void enterFunction_insertxmlafter(@NotNull PLSQLParser.Function_insertxmlafterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_insertxmlafter}.
	 * @param ctx the parse tree
	 */
	void exitFunction_insertxmlafter(@NotNull PLSQLParser.Function_insertxmlafterContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_heading}.
	 * @param ctx the parse tree
	 */
	void enterFunction_heading(@NotNull PLSQLParser.Function_headingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_heading}.
	 * @param ctx the parse tree
	 */
	void exitFunction_heading(@NotNull PLSQLParser.Function_headingContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_listagg}.
	 * @param ctx the parse tree
	 */
	void enterFunction_listagg(@NotNull PLSQLParser.Function_listaggContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_listagg}.
	 * @param ctx the parse tree
	 */
	void exitFunction_listagg(@NotNull PLSQLParser.Function_listaggContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#restore_point}.
	 * @param ctx the parse tree
	 */
	void enterRestore_point(@NotNull PLSQLParser.Restore_pointContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#restore_point}.
	 * @param ctx the parse tree
	 */
	void exitRestore_point(@NotNull PLSQLParser.Restore_pointContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#coalesce_table_subpartition}.
	 * @param ctx the parse tree
	 */
	void enterCoalesce_table_subpartition(@NotNull PLSQLParser.Coalesce_table_subpartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#coalesce_table_subpartition}.
	 * @param ctx the parse tree
	 */
	void exitCoalesce_table_subpartition(@NotNull PLSQLParser.Coalesce_table_subpartitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#plsql_block}.
	 * @param ctx the parse tree
	 */
	void enterPlsql_block(@NotNull PLSQLParser.Plsql_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#plsql_block}.
	 * @param ctx the parse tree
	 */
	void exitPlsql_block(@NotNull PLSQLParser.Plsql_blockContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#index_partition_description}.
	 * @param ctx the parse tree
	 */
	void enterIndex_partition_description(@NotNull PLSQLParser.Index_partition_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#index_partition_description}.
	 * @param ctx the parse tree
	 */
	void exitIndex_partition_description(@NotNull PLSQLParser.Index_partition_descriptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#database_logging_clauses}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_logging_clauses(@NotNull PLSQLParser.Database_logging_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#database_logging_clauses}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_logging_clauses(@NotNull PLSQLParser.Database_logging_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#field_name}.
	 * @param ctx the parse tree
	 */
	void enterField_name(@NotNull PLSQLParser.Field_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#field_name}.
	 * @param ctx the parse tree
	 */
	void exitField_name(@NotNull PLSQLParser.Field_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#encoding_decoding_function}.
	 * @param ctx the parse tree
	 */
	void enterEncoding_decoding_function(@NotNull PLSQLParser.Encoding_decoding_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#encoding_decoding_function}.
	 * @param ctx the parse tree
	 */
	void exitEncoding_decoding_function(@NotNull PLSQLParser.Encoding_decoding_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#datetime_datatypes}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_datatypes(@NotNull PLSQLParser.Datetime_datatypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#datetime_datatypes}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_datatypes(@NotNull PLSQLParser.Datetime_datatypesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#primary_name}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_name(@NotNull PLSQLParser.Primary_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#primary_name}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_name(@NotNull PLSQLParser.Primary_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#modify_col_properties}.
	 * @param ctx the parse tree
	 */
	void enterModify_col_properties(@NotNull PLSQLParser.Modify_col_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#modify_col_properties}.
	 * @param ctx the parse tree
	 */
	void exitModify_col_properties(@NotNull PLSQLParser.Modify_col_propertiesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#modify_column_clauses}.
	 * @param ctx the parse tree
	 */
	void enterModify_column_clauses(@NotNull PLSQLParser.Modify_column_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#modify_column_clauses}.
	 * @param ctx the parse tree
	 */
	void exitModify_column_clauses(@NotNull PLSQLParser.Modify_column_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sql_commit}.
	 * @param ctx the parse tree
	 */
	void enterSql_commit(@NotNull PLSQLParser.Sql_commitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sql_commit}.
	 * @param ctx the parse tree
	 */
	void exitSql_commit(@NotNull PLSQLParser.Sql_commitContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_var_pop}.
	 * @param ctx the parse tree
	 */
	void enterFunction_var_pop(@NotNull PLSQLParser.Function_var_popContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_var_pop}.
	 * @param ctx the parse tree
	 */
	void exitFunction_var_pop(@NotNull PLSQLParser.Function_var_popContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_asciistr}.
	 * @param ctx the parse tree
	 */
	void enterFunction_asciistr(@NotNull PLSQLParser.Function_asciistrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_asciistr}.
	 * @param ctx the parse tree
	 */
	void exitFunction_asciistr(@NotNull PLSQLParser.Function_asciistrContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_appendchildxml}.
	 * @param ctx the parse tree
	 */
	void enterFunction_appendchildxml(@NotNull PLSQLParser.Function_appendchildxmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_appendchildxml}.
	 * @param ctx the parse tree
	 */
	void exitFunction_appendchildxml(@NotNull PLSQLParser.Function_appendchildxmlContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_nullif}.
	 * @param ctx the parse tree
	 */
	void enterFunction_nullif(@NotNull PLSQLParser.Function_nullifContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_nullif}.
	 * @param ctx the parse tree
	 */
	void exitFunction_nullif(@NotNull PLSQLParser.Function_nullifContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_xmltransform}.
	 * @param ctx the parse tree
	 */
	void enterFunction_xmltransform(@NotNull PLSQLParser.Function_xmltransformContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_xmltransform}.
	 * @param ctx the parse tree
	 */
	void exitFunction_xmltransform(@NotNull PLSQLParser.Function_xmltransformContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declaration(@NotNull PLSQLParser.Constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declaration(@NotNull PLSQLParser.Constant_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#stop_standby_clause}.
	 * @param ctx the parse tree
	 */
	void enterStop_standby_clause(@NotNull PLSQLParser.Stop_standby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#stop_standby_clause}.
	 * @param ctx the parse tree
	 */
	void exitStop_standby_clause(@NotNull PLSQLParser.Stop_standby_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#actual_cursor_parameter}.
	 * @param ctx the parse tree
	 */
	void enterActual_cursor_parameter(@NotNull PLSQLParser.Actual_cursor_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#actual_cursor_parameter}.
	 * @param ctx the parse tree
	 */
	void exitActual_cursor_parameter(@NotNull PLSQLParser.Actual_cursor_parameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#supplemental_logging_props}.
	 * @param ctx the parse tree
	 */
	void enterSupplemental_logging_props(@NotNull PLSQLParser.Supplemental_logging_propsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#supplemental_logging_props}.
	 * @param ctx the parse tree
	 */
	void exitSupplemental_logging_props(@NotNull PLSQLParser.Supplemental_logging_propsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#parallel_enable_clause}.
	 * @param ctx the parse tree
	 */
	void enterParallel_enable_clause(@NotNull PLSQLParser.Parallel_enable_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#parallel_enable_clause}.
	 * @param ctx the parse tree
	 */
	void exitParallel_enable_clause(@NotNull PLSQLParser.Parallel_enable_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#local_domain_index_clause}.
	 * @param ctx the parse tree
	 */
	void enterLocal_domain_index_clause(@NotNull PLSQLParser.Local_domain_index_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#local_domain_index_clause}.
	 * @param ctx the parse tree
	 */
	void exitLocal_domain_index_clause(@NotNull PLSQLParser.Local_domain_index_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_instr}.
	 * @param ctx the parse tree
	 */
	void enterFunction_instr(@NotNull PLSQLParser.Function_instrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_instr}.
	 * @param ctx the parse tree
	 */
	void exitFunction_instr(@NotNull PLSQLParser.Function_instrContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#revoke_system_privileges}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_system_privileges(@NotNull PLSQLParser.Revoke_system_privilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#revoke_system_privileges}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_system_privileges(@NotNull PLSQLParser.Revoke_system_privilegesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#item_list_1}.
	 * @param ctx the parse tree
	 */
	void enterItem_list_1(@NotNull PLSQLParser.Item_list_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#item_list_1}.
	 * @param ctx the parse tree
	 */
	void exitItem_list_1(@NotNull PLSQLParser.Item_list_1Context ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#item_list_2}.
	 * @param ctx the parse tree
	 */
	void enterItem_list_2(@NotNull PLSQLParser.Item_list_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#item_list_2}.
	 * @param ctx the parse tree
	 */
	void exitItem_list_2(@NotNull PLSQLParser.Item_list_2Context ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#item_list_3}.
	 * @param ctx the parse tree
	 */
	void enterItem_list_3(@NotNull PLSQLParser.Item_list_3Context ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#item_list_3}.
	 * @param ctx the parse tree
	 */
	void exitItem_list_3(@NotNull PLSQLParser.Item_list_3Context ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#item_list_4}.
	 * @param ctx the parse tree
	 */
	void enterItem_list_4(@NotNull PLSQLParser.Item_list_4Context ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#item_list_4}.
	 * @param ctx the parse tree
	 */
	void exitItem_list_4(@NotNull PLSQLParser.Item_list_4Context ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_stats_mw_test}.
	 * @param ctx the parse tree
	 */
	void enterFunction_stats_mw_test(@NotNull PLSQLParser.Function_stats_mw_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_stats_mw_test}.
	 * @param ctx the parse tree
	 */
	void exitFunction_stats_mw_test(@NotNull PLSQLParser.Function_stats_mw_testContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#topn}.
	 * @param ctx the parse tree
	 */
	void enterTopn(@NotNull PLSQLParser.TopnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#topn}.
	 * @param ctx the parse tree
	 */
	void exitTopn(@NotNull PLSQLParser.TopnContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_insertchildxml}.
	 * @param ctx the parse tree
	 */
	void enterFunction_insertchildxml(@NotNull PLSQLParser.Function_insertchildxmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_insertchildxml}.
	 * @param ctx the parse tree
	 */
	void exitFunction_insertchildxml(@NotNull PLSQLParser.Function_insertchildxmlContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#user_defined_operator}.
	 * @param ctx the parse tree
	 */
	void enterUser_defined_operator(@NotNull PLSQLParser.User_defined_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#user_defined_operator}.
	 * @param ctx the parse tree
	 */
	void exitUser_defined_operator(@NotNull PLSQLParser.User_defined_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#namespace_string}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_string(@NotNull PLSQLParser.Namespace_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#namespace_string}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_string(@NotNull PLSQLParser.Namespace_stringContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#end_session_clauses}.
	 * @param ctx the parse tree
	 */
	void enterEnd_session_clauses(@NotNull PLSQLParser.End_session_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#end_session_clauses}.
	 * @param ctx the parse tree
	 */
	void exitEnd_session_clauses(@NotNull PLSQLParser.End_session_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_greatest}.
	 * @param ctx the parse tree
	 */
	void enterFunction_greatest(@NotNull PLSQLParser.Function_greatestContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_greatest}.
	 * @param ctx the parse tree
	 */
	void exitFunction_greatest(@NotNull PLSQLParser.Function_greatestContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#global_partitioned_index}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_partitioned_index(@NotNull PLSQLParser.Global_partitioned_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#global_partitioned_index}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_partitioned_index(@NotNull PLSQLParser.Global_partitioned_indexContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#modify_table_partition}.
	 * @param ctx the parse tree
	 */
	void enterModify_table_partition(@NotNull PLSQLParser.Modify_table_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#modify_table_partition}.
	 * @param ctx the parse tree
	 */
	void exitModify_table_partition(@NotNull PLSQLParser.Modify_table_partitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#update_all_indexes_clause}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_all_indexes_clause(@NotNull PLSQLParser.Update_all_indexes_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#update_all_indexes_clause}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_all_indexes_clause(@NotNull PLSQLParser.Update_all_indexes_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#add_column_options}.
	 * @param ctx the parse tree
	 */
	void enterAdd_column_options(@NotNull PLSQLParser.Add_column_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#add_column_options}.
	 * @param ctx the parse tree
	 */
	void exitAdd_column_options(@NotNull PLSQLParser.Add_column_optionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursor_variable}.
	 * @param ctx the parse tree
	 */
	void enterCursor_variable(@NotNull PLSQLParser.Cursor_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursor_variable}.
	 * @param ctx the parse tree
	 */
	void exitCursor_variable(@NotNull PLSQLParser.Cursor_variableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(@NotNull PLSQLParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(@NotNull PLSQLParser.LabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#select_into_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_into_statement(@NotNull PLSQLParser.Select_into_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#select_into_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_into_statement(@NotNull PLSQLParser.Select_into_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cycle_value}.
	 * @param ctx the parse tree
	 */
	void enterCycle_value(@NotNull PLSQLParser.Cycle_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cycle_value}.
	 * @param ctx the parse tree
	 */
	void exitCycle_value(@NotNull PLSQLParser.Cycle_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#index_properties}.
	 * @param ctx the parse tree
	 */
	void enterIndex_properties(@NotNull PLSQLParser.Index_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#index_properties}.
	 * @param ctx the parse tree
	 */
	void exitIndex_properties(@NotNull PLSQLParser.Index_propertiesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#qualified_template_clause}.
	 * @param ctx the parse tree
	 */
	void enterQualified_template_clause(@NotNull PLSQLParser.Qualified_template_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#qualified_template_clause}.
	 * @param ctx the parse tree
	 */
	void exitQualified_template_clause(@NotNull PLSQLParser.Qualified_template_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_nls_charset_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_nls_charset_name(@NotNull PLSQLParser.Function_nls_charset_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_nls_charset_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_nls_charset_name(@NotNull PLSQLParser.Function_nls_charset_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void enterValues_clause(@NotNull PLSQLParser.Values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void exitValues_clause(@NotNull PLSQLParser.Values_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#null_related_function}.
	 * @param ctx the parse tree
	 */
	void enterNull_related_function(@NotNull PLSQLParser.Null_related_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#null_related_function}.
	 * @param ctx the parse tree
	 */
	void exitNull_related_function(@NotNull PLSQLParser.Null_related_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#relational_properties}.
	 * @param ctx the parse tree
	 */
	void enterRelational_properties(@NotNull PLSQLParser.Relational_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#relational_properties}.
	 * @param ctx the parse tree
	 */
	void exitRelational_properties(@NotNull PLSQLParser.Relational_propertiesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(@NotNull PLSQLParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(@NotNull PLSQLParser.ColumnContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_ds_iso_format}.
	 * @param ctx the parse tree
	 */
	void enterFunction_ds_iso_format(@NotNull PLSQLParser.Function_ds_iso_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_ds_iso_format}.
	 * @param ctx the parse tree
	 */
	void exitFunction_ds_iso_format(@NotNull PLSQLParser.Function_ds_iso_formatContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_xmlelement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_xmlelement(@NotNull PLSQLParser.Function_xmlelementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_xmlelement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_xmlelement(@NotNull PLSQLParser.Function_xmlelementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#subpartition_by_hash}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition_by_hash(@NotNull PLSQLParser.Subpartition_by_hashContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#subpartition_by_hash}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition_by_hash(@NotNull PLSQLParser.Subpartition_by_hashContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#table_reference}.
	 * @param ctx the parse tree
	 */
	void enterTable_reference(@NotNull PLSQLParser.Table_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#table_reference}.
	 * @param ctx the parse tree
	 */
	void exitTable_reference(@NotNull PLSQLParser.Table_referenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#modify_index_default_attrs}.
	 * @param ctx the parse tree
	 */
	void enterModify_index_default_attrs(@NotNull PLSQLParser.Modify_index_default_attrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#modify_index_default_attrs}.
	 * @param ctx the parse tree
	 */
	void exitModify_index_default_attrs(@NotNull PLSQLParser.Modify_index_default_attrsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#ref_attribute}.
	 * @param ctx the parse tree
	 */
	void enterRef_attribute(@NotNull PLSQLParser.Ref_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#ref_attribute}.
	 * @param ctx the parse tree
	 */
	void exitRef_attribute(@NotNull PLSQLParser.Ref_attributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 */
	void enterFlashback_query_clause(@NotNull PLSQLParser.Flashback_query_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 */
	void exitFlashback_query_clause(@NotNull PLSQLParser.Flashback_query_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#encrypt_algorithm}.
	 * @param ctx the parse tree
	 */
	void enterEncrypt_algorithm(@NotNull PLSQLParser.Encrypt_algorithmContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#encrypt_algorithm}.
	 * @param ctx the parse tree
	 */
	void exitEncrypt_algorithm(@NotNull PLSQLParser.Encrypt_algorithmContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#set_subpartition_template}.
	 * @param ctx the parse tree
	 */
	void enterSet_subpartition_template(@NotNull PLSQLParser.Set_subpartition_templateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#set_subpartition_template}.
	 * @param ctx the parse tree
	 */
	void exitSet_subpartition_template(@NotNull PLSQLParser.Set_subpartition_templateContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#timing_point}.
	 * @param ctx the parse tree
	 */
	void enterTiming_point(@NotNull PLSQLParser.Timing_pointContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#timing_point}.
	 * @param ctx the parse tree
	 */
	void exitTiming_point(@NotNull PLSQLParser.Timing_pointContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_percent_rank_aggregate}.
	 * @param ctx the parse tree
	 */
	void enterFunction_percent_rank_aggregate(@NotNull PLSQLParser.Function_percent_rank_aggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_percent_rank_aggregate}.
	 * @param ctx the parse tree
	 */
	void exitFunction_percent_rank_aggregate(@NotNull PLSQLParser.Function_percent_rank_aggregateContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#model_expression}.
	 * @param ctx the parse tree
	 */
	void enterModel_expression(@NotNull PLSQLParser.Model_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#model_expression}.
	 * @param ctx the parse tree
	 */
	void exitModel_expression(@NotNull PLSQLParser.Model_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_sql_format}.
	 * @param ctx the parse tree
	 */
	void enterFunction_sql_format(@NotNull PLSQLParser.Function_sql_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_sql_format}.
	 * @param ctx the parse tree
	 */
	void exitFunction_sql_format(@NotNull PLSQLParser.Function_sql_formatContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull PLSQLParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull PLSQLParser.NameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#offset}.
	 * @param ctx the parse tree
	 */
	void enterOffset(@NotNull PLSQLParser.OffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#offset}.
	 * @param ctx the parse tree
	 */
	void exitOffset(@NotNull PLSQLParser.OffsetContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#redo_logfile_spec}.
	 * @param ctx the parse tree
	 */
	void enterRedo_logfile_spec(@NotNull PLSQLParser.Redo_logfile_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#redo_logfile_spec}.
	 * @param ctx the parse tree
	 */
	void exitRedo_logfile_spec(@NotNull PLSQLParser.Redo_logfile_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#is_a_set_condition}.
	 * @param ctx the parse tree
	 */
	void enterIs_a_set_condition(@NotNull PLSQLParser.Is_a_set_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#is_a_set_condition}.
	 * @param ctx the parse tree
	 */
	void exitIs_a_set_condition(@NotNull PLSQLParser.Is_a_set_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#add_mv_log_column_clause}.
	 * @param ctx the parse tree
	 */
	void enterAdd_mv_log_column_clause(@NotNull PLSQLParser.Add_mv_log_column_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#add_mv_log_column_clause}.
	 * @param ctx the parse tree
	 */
	void exitAdd_mv_log_column_clause(@NotNull PLSQLParser.Add_mv_log_column_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull PLSQLParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull PLSQLParser.ConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#precision}.
	 * @param ctx the parse tree
	 */
	void enterPrecision(@NotNull PLSQLParser.PrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#precision}.
	 * @param ctx the parse tree
	 */
	void exitPrecision(@NotNull PLSQLParser.PrecisionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void enterNull_statement(@NotNull PLSQLParser.Null_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void exitNull_statement(@NotNull PLSQLParser.Null_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#resize_disk_clause}.
	 * @param ctx the parse tree
	 */
	void enterResize_disk_clause(@NotNull PLSQLParser.Resize_disk_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#resize_disk_clause}.
	 * @param ctx the parse tree
	 */
	void exitResize_disk_clause(@NotNull PLSQLParser.Resize_disk_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterStorage_clause(@NotNull PLSQLParser.Storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitStorage_clause(@NotNull PLSQLParser.Storage_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(@NotNull PLSQLParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(@NotNull PLSQLParser.Where_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#statistics_type}.
	 * @param ctx the parse tree
	 */
	void enterStatistics_type(@NotNull PLSQLParser.Statistics_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#statistics_type}.
	 * @param ctx the parse tree
	 */
	void exitStatistics_type(@NotNull PLSQLParser.Statistics_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#trigger_edition_clause}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_edition_clause(@NotNull PLSQLParser.Trigger_edition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#trigger_edition_clause}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_edition_clause(@NotNull PLSQLParser.Trigger_edition_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 */
	void enterConditional_insert_clause(@NotNull PLSQLParser.Conditional_insert_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 */
	void exitConditional_insert_clause(@NotNull PLSQLParser.Conditional_insert_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#varray_type}.
	 * @param ctx the parse tree
	 */
	void enterVarray_type(@NotNull PLSQLParser.Varray_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#varray_type}.
	 * @param ctx the parse tree
	 */
	void exitVarray_type(@NotNull PLSQLParser.Varray_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#olap_function}.
	 * @param ctx the parse tree
	 */
	void enterOlap_function(@NotNull PLSQLParser.Olap_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#olap_function}.
	 * @param ctx the parse tree
	 */
	void exitOlap_function(@NotNull PLSQLParser.Olap_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#interval_day_to_second}.
	 * @param ctx the parse tree
	 */
	void enterInterval_day_to_second(@NotNull PLSQLParser.Interval_day_to_secondContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#interval_day_to_second}.
	 * @param ctx the parse tree
	 */
	void exitInterval_day_to_second(@NotNull PLSQLParser.Interval_day_to_secondContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#nested_table_column}.
	 * @param ctx the parse tree
	 */
	void enterNested_table_column(@NotNull PLSQLParser.Nested_table_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#nested_table_column}.
	 * @param ctx the parse tree
	 */
	void exitNested_table_column(@NotNull PLSQLParser.Nested_table_columnContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_dump}.
	 * @param ctx the parse tree
	 */
	void enterFunction_dump(@NotNull PLSQLParser.Function_dumpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_dump}.
	 * @param ctx the parse tree
	 */
	void exitFunction_dump(@NotNull PLSQLParser.Function_dumpContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#parameter_types}.
	 * @param ctx the parse tree
	 */
	void enterParameter_types(@NotNull PLSQLParser.Parameter_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#parameter_types}.
	 * @param ctx the parse tree
	 */
	void exitParameter_types(@NotNull PLSQLParser.Parameter_typesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_stats_t_test_one}.
	 * @param ctx the parse tree
	 */
	void enterFunction_stats_t_test_one(@NotNull PLSQLParser.Function_stats_t_test_oneContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_stats_t_test_one}.
	 * @param ctx the parse tree
	 */
	void exitFunction_stats_t_test_one(@NotNull PLSQLParser.Function_stats_t_test_oneContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#subpartition}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition(@NotNull PLSQLParser.SubpartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#subpartition}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition(@NotNull PLSQLParser.SubpartitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_method_spec}.
	 * @param ctx the parse tree
	 */
	void enterAlter_method_spec(@NotNull PLSQLParser.Alter_method_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_method_spec}.
	 * @param ctx the parse tree
	 */
	void exitAlter_method_spec(@NotNull PLSQLParser.Alter_method_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#searched_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterSearched_case_statement(@NotNull PLSQLParser.Searched_case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#searched_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitSearched_case_statement(@NotNull PLSQLParser.Searched_case_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#segment_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void enterSegment_attributes_clause(@NotNull PLSQLParser.Segment_attributes_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#segment_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void exitSegment_attributes_clause(@NotNull PLSQLParser.Segment_attributes_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_index_partitioning}.
	 * @param ctx the parse tree
	 */
	void enterAlter_index_partitioning(@NotNull PLSQLParser.Alter_index_partitioningContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_index_partitioning}.
	 * @param ctx the parse tree
	 */
	void exitAlter_index_partitioning(@NotNull PLSQLParser.Alter_index_partitioningContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#exchange_partition_subpart}.
	 * @param ctx the parse tree
	 */
	void enterExchange_partition_subpart(@NotNull PLSQLParser.Exchange_partition_subpartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#exchange_partition_subpart}.
	 * @param ctx the parse tree
	 */
	void exitExchange_partition_subpart(@NotNull PLSQLParser.Exchange_partition_subpartContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xmlschema_url}.
	 * @param ctx the parse tree
	 */
	void enterXmlschema_url(@NotNull PLSQLParser.Xmlschema_urlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xmlschema_url}.
	 * @param ctx the parse tree
	 */
	void exitXmlschema_url(@NotNull PLSQLParser.Xmlschema_urlContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_set}.
	 * @param ctx the parse tree
	 */
	void enterFunction_set(@NotNull PLSQLParser.Function_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_set}.
	 * @param ctx the parse tree
	 */
	void exitFunction_set(@NotNull PLSQLParser.Function_setContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#procedure_heading}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_heading(@NotNull PLSQLParser.Procedure_headingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#procedure_heading}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_heading(@NotNull PLSQLParser.Procedure_headingContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_cardinality}.
	 * @param ctx the parse tree
	 */
	void enterFunction_cardinality(@NotNull PLSQLParser.Function_cardinalityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_cardinality}.
	 * @param ctx the parse tree
	 */
	void exitFunction_cardinality(@NotNull PLSQLParser.Function_cardinalityContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#distributed_recov_clauses}.
	 * @param ctx the parse tree
	 */
	void enterDistributed_recov_clauses(@NotNull PLSQLParser.Distributed_recov_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#distributed_recov_clauses}.
	 * @param ctx the parse tree
	 */
	void exitDistributed_recov_clauses(@NotNull PLSQLParser.Distributed_recov_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#row_value}.
	 * @param ctx the parse tree
	 */
	void enterRow_value(@NotNull PLSQLParser.Row_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#row_value}.
	 * @param ctx the parse tree
	 */
	void exitRow_value(@NotNull PLSQLParser.Row_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(@NotNull PLSQLParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(@NotNull PLSQLParser.ElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#map_order_func_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMap_order_func_declaration(@NotNull PLSQLParser.Map_order_func_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#map_order_func_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMap_order_func_declaration(@NotNull PLSQLParser.Map_order_func_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#day_precision}.
	 * @param ctx the parse tree
	 */
	void enterDay_precision(@NotNull PLSQLParser.Day_precisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#day_precision}.
	 * @param ctx the parse tree
	 */
	void exitDay_precision(@NotNull PLSQLParser.Day_precisionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#split_index_partition}.
	 * @param ctx the parse tree
	 */
	void enterSplit_index_partition(@NotNull PLSQLParser.Split_index_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#split_index_partition}.
	 * @param ctx the parse tree
	 */
	void exitSplit_index_partition(@NotNull PLSQLParser.Split_index_partitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#exceptions_clause}.
	 * @param ctx the parse tree
	 */
	void enterExceptions_clause(@NotNull PLSQLParser.Exceptions_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#exceptions_clause}.
	 * @param ctx the parse tree
	 */
	void exitExceptions_clause(@NotNull PLSQLParser.Exceptions_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#update_index_clauses}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_index_clauses(@NotNull PLSQLParser.Update_index_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#update_index_clauses}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_index_clauses(@NotNull PLSQLParser.Update_index_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#windowing_clause}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_clause(@NotNull PLSQLParser.Windowing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#windowing_clause}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_clause(@NotNull PLSQLParser.Windowing_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(@NotNull PLSQLParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(@NotNull PLSQLParser.RowContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#category}.
	 * @param ctx the parse tree
	 */
	void enterCategory(@NotNull PLSQLParser.CategoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#category}.
	 * @param ctx the parse tree
	 */
	void exitCategory(@NotNull PLSQLParser.CategoryContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#materialized_view}.
	 * @param ctx the parse tree
	 */
	void enterMaterialized_view(@NotNull PLSQLParser.Materialized_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#materialized_view}.
	 * @param ctx the parse tree
	 */
	void exitMaterialized_view(@NotNull PLSQLParser.Materialized_viewContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#target_db_name}.
	 * @param ctx the parse tree
	 */
	void enterTarget_db_name(@NotNull PLSQLParser.Target_db_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#target_db_name}.
	 * @param ctx the parse tree
	 */
	void exitTarget_db_name(@NotNull PLSQLParser.Target_db_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#primary_operator}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_operator(@NotNull PLSQLParser.Primary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#primary_operator}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_operator(@NotNull PLSQLParser.Primary_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_xmlparse}.
	 * @param ctx the parse tree
	 */
	void enterFunction_xmlparse(@NotNull PLSQLParser.Function_xmlparseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_xmlparse}.
	 * @param ctx the parse tree
	 */
	void exitFunction_xmlparse(@NotNull PLSQLParser.Function_xmlparseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#indicator_variable}.
	 * @param ctx the parse tree
	 */
	void enterIndicator_variable(@NotNull PLSQLParser.Indicator_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#indicator_variable}.
	 * @param ctx the parse tree
	 */
	void exitIndicator_variable(@NotNull PLSQLParser.Indicator_variableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#disk_offline_clause}.
	 * @param ctx the parse tree
	 */
	void enterDisk_offline_clause(@NotNull PLSQLParser.Disk_offline_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#disk_offline_clause}.
	 * @param ctx the parse tree
	 */
	void exitDisk_offline_clause(@NotNull PLSQLParser.Disk_offline_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#edition_name}.
	 * @param ctx the parse tree
	 */
	void enterEdition_name(@NotNull PLSQLParser.Edition_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#edition_name}.
	 * @param ctx the parse tree
	 */
	void exitEdition_name(@NotNull PLSQLParser.Edition_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#using_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_type_clause(@NotNull PLSQLParser.Using_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#using_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_type_clause(@NotNull PLSQLParser.Using_type_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cycle_mark_c_alias}.
	 * @param ctx the parse tree
	 */
	void enterCycle_mark_c_alias(@NotNull PLSQLParser.Cycle_mark_c_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cycle_mark_c_alias}.
	 * @param ctx the parse tree
	 */
	void exitCycle_mark_c_alias(@NotNull PLSQLParser.Cycle_mark_c_aliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#reference_model_name}.
	 * @param ctx the parse tree
	 */
	void enterReference_model_name(@NotNull PLSQLParser.Reference_model_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#reference_model_name}.
	 * @param ctx the parse tree
	 */
	void exitReference_model_name(@NotNull PLSQLParser.Reference_model_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_rank}.
	 * @param ctx the parse tree
	 */
	void enterFunction_rank(@NotNull PLSQLParser.Function_rankContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_rank}.
	 * @param ctx the parse tree
	 */
	void exitFunction_rank(@NotNull PLSQLParser.Function_rankContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#diskgroup_attributes}.
	 * @param ctx the parse tree
	 */
	void enterDiskgroup_attributes(@NotNull PLSQLParser.Diskgroup_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#diskgroup_attributes}.
	 * @param ctx the parse tree
	 */
	void exitDiskgroup_attributes(@NotNull PLSQLParser.Diskgroup_attributesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#partitioning_storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterPartitioning_storage_clause(@NotNull PLSQLParser.Partitioning_storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#partitioning_storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitPartitioning_storage_clause(@NotNull PLSQLParser.Partitioning_storage_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_soundex}.
	 * @param ctx the parse tree
	 */
	void enterFunction_soundex(@NotNull PLSQLParser.Function_soundexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_soundex}.
	 * @param ctx the parse tree
	 */
	void exitFunction_soundex(@NotNull PLSQLParser.Function_soundexContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_cv}.
	 * @param ctx the parse tree
	 */
	void enterFunction_cv(@NotNull PLSQLParser.Function_cvContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_cv}.
	 * @param ctx the parse tree
	 */
	void exitFunction_cv(@NotNull PLSQLParser.Function_cvContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(@NotNull PLSQLParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(@NotNull PLSQLParser.Variable_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#compound_expression}.
	 * @param ctx the parse tree
	 */
	void enterCompound_expression(@NotNull PLSQLParser.Compound_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#compound_expression}.
	 * @param ctx the parse tree
	 */
	void exitCompound_expression(@NotNull PLSQLParser.Compound_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_dataobj_to_partition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_dataobj_to_partition(@NotNull PLSQLParser.Function_dataobj_to_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_dataobj_to_partition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_dataobj_to_partition(@NotNull PLSQLParser.Function_dataobj_to_partitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#child_expr}.
	 * @param ctx the parse tree
	 */
	void enterChild_expr(@NotNull PLSQLParser.Child_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#child_expr}.
	 * @param ctx the parse tree
	 */
	void exitChild_expr(@NotNull PLSQLParser.Child_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_decode}.
	 * @param ctx the parse tree
	 */
	void enterFunction_decode(@NotNull PLSQLParser.Function_decodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_decode}.
	 * @param ctx the parse tree
	 */
	void exitFunction_decode(@NotNull PLSQLParser.Function_decodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#record_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterRecord_variable_declaration(@NotNull PLSQLParser.Record_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#record_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitRecord_variable_declaration(@NotNull PLSQLParser.Record_variable_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#nested_table_col_properties}.
	 * @param ctx the parse tree
	 */
	void enterNested_table_col_properties(@NotNull PLSQLParser.Nested_table_col_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#nested_table_col_properties}.
	 * @param ctx the parse tree
	 */
	void exitNested_table_col_properties(@NotNull PLSQLParser.Nested_table_col_propertiesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#hierarchy}.
	 * @param ctx the parse tree
	 */
	void enterHierarchy(@NotNull PLSQLParser.HierarchyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#hierarchy}.
	 * @param ctx the parse tree
	 */
	void exitHierarchy(@NotNull PLSQLParser.HierarchyContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#coalesce_table_partition}.
	 * @param ctx the parse tree
	 */
	void enterCoalesce_table_partition(@NotNull PLSQLParser.Coalesce_table_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#coalesce_table_partition}.
	 * @param ctx the parse tree
	 */
	void exitCoalesce_table_partition(@NotNull PLSQLParser.Coalesce_table_partitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_make_ref}.
	 * @param ctx the parse tree
	 */
	void enterFunction_make_ref(@NotNull PLSQLParser.Function_make_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_make_ref}.
	 * @param ctx the parse tree
	 */
	void exitFunction_make_ref(@NotNull PLSQLParser.Function_make_refContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#check_diskgroup_clause}.
	 * @param ctx the parse tree
	 */
	void enterCheck_diskgroup_clause(@NotNull PLSQLParser.Check_diskgroup_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#check_diskgroup_clause}.
	 * @param ctx the parse tree
	 */
	void exitCheck_diskgroup_clause(@NotNull PLSQLParser.Check_diskgroup_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#spatial_types}.
	 * @param ctx the parse tree
	 */
	void enterSpatial_types(@NotNull PLSQLParser.Spatial_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#spatial_types}.
	 * @param ctx the parse tree
	 */
	void exitSpatial_types(@NotNull PLSQLParser.Spatial_typesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#insert_into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInsert_into_clause(@NotNull PLSQLParser.Insert_into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#insert_into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInsert_into_clause(@NotNull PLSQLParser.Insert_into_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#lob_parameters}.
	 * @param ctx the parse tree
	 */
	void enterLob_parameters(@NotNull PLSQLParser.Lob_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#lob_parameters}.
	 * @param ctx the parse tree
	 */
	void exitLob_parameters(@NotNull PLSQLParser.Lob_parametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#extent_management_clause}.
	 * @param ctx the parse tree
	 */
	void enterExtent_management_clause(@NotNull PLSQLParser.Extent_management_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#extent_management_clause}.
	 * @param ctx the parse tree
	 */
	void exitExtent_management_clause(@NotNull PLSQLParser.Extent_management_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#records_per_block_clause}.
	 * @param ctx the parse tree
	 */
	void enterRecords_per_block_clause(@NotNull PLSQLParser.Records_per_block_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#records_per_block_clause}.
	 * @param ctx the parse tree
	 */
	void exitRecords_per_block_clause(@NotNull PLSQLParser.Records_per_block_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#hsm_credentials}.
	 * @param ctx the parse tree
	 */
	void enterHsm_credentials(@NotNull PLSQLParser.Hsm_credentialsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#hsm_credentials}.
	 * @param ctx the parse tree
	 */
	void exitHsm_credentials(@NotNull PLSQLParser.Hsm_credentialsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#modify_table_default_attrs}.
	 * @param ctx the parse tree
	 */
	void enterModify_table_default_attrs(@NotNull PLSQLParser.Modify_table_default_attrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#modify_table_default_attrs}.
	 * @param ctx the parse tree
	 */
	void exitModify_table_default_attrs(@NotNull PLSQLParser.Modify_table_default_attrsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_round_date}.
	 * @param ctx the parse tree
	 */
	void enterFunction_round_date(@NotNull PLSQLParser.Function_round_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_round_date}.
	 * @param ctx the parse tree
	 */
	void exitFunction_round_date(@NotNull PLSQLParser.Function_round_dateContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_to_char}.
	 * @param ctx the parse tree
	 */
	void enterFunction_to_char(@NotNull PLSQLParser.Function_to_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_to_char}.
	 * @param ctx the parse tree
	 */
	void exitFunction_to_char(@NotNull PLSQLParser.Function_to_charContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#numeric_function}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_function(@NotNull PLSQLParser.Numeric_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#numeric_function}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_function(@NotNull PLSQLParser.Numeric_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_stats_t_test}.
	 * @param ctx the parse tree
	 */
	void enterFunction_stats_t_test(@NotNull PLSQLParser.Function_stats_t_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_stats_t_test}.
	 * @param ctx the parse tree
	 */
	void exitFunction_stats_t_test(@NotNull PLSQLParser.Function_stats_t_testContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#rename_partition_subpart}.
	 * @param ctx the parse tree
	 */
	void enterRename_partition_subpart(@NotNull PLSQLParser.Rename_partition_subpartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#rename_partition_subpart}.
	 * @param ctx the parse tree
	 */
	void exitRename_partition_subpart(@NotNull PLSQLParser.Rename_partition_subpartContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(@NotNull PLSQLParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(@NotNull PLSQLParser.MethodContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#group_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_clause(@NotNull PLSQLParser.Group_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#group_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_clause(@NotNull PLSQLParser.Group_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(@NotNull PLSQLParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(@NotNull PLSQLParser.DatatypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#varray_col_properties}.
	 * @param ctx the parse tree
	 */
	void enterVarray_col_properties(@NotNull PLSQLParser.Varray_col_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#varray_col_properties}.
	 * @param ctx the parse tree
	 */
	void exitVarray_col_properties(@NotNull PLSQLParser.Varray_col_propertiesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#noneditioning_view}.
	 * @param ctx the parse tree
	 */
	void enterNoneditioning_view(@NotNull PLSQLParser.Noneditioning_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#noneditioning_view}.
	 * @param ctx the parse tree
	 */
	void exitNoneditioning_view(@NotNull PLSQLParser.Noneditioning_viewContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_replace}.
	 * @param ctx the parse tree
	 */
	void enterFunction_replace(@NotNull PLSQLParser.Function_replaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_replace}.
	 * @param ctx the parse tree
	 */
	void exitFunction_replace(@NotNull PLSQLParser.Function_replaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#striping_clause}.
	 * @param ctx the parse tree
	 */
	void enterStriping_clause(@NotNull PLSQLParser.Striping_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#striping_clause}.
	 * @param ctx the parse tree
	 */
	void exitStriping_clause(@NotNull PLSQLParser.Striping_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#simple_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_case_statement(@NotNull PLSQLParser.Simple_case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#simple_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_case_statement(@NotNull PLSQLParser.Simple_case_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_nanvl}.
	 * @param ctx the parse tree
	 */
	void enterFunction_nanvl(@NotNull PLSQLParser.Function_nanvlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_nanvl}.
	 * @param ctx the parse tree
	 */
	void exitFunction_nanvl(@NotNull PLSQLParser.Function_nanvlContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#db_name}.
	 * @param ctx the parse tree
	 */
	void enterDb_name(@NotNull PLSQLParser.Db_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#db_name}.
	 * @param ctx the parse tree
	 */
	void exitDb_name(@NotNull PLSQLParser.Db_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#procedure_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_declaration(@NotNull PLSQLParser.Procedure_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#procedure_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_declaration(@NotNull PLSQLParser.Procedure_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_to_single_byte}.
	 * @param ctx the parse tree
	 */
	void enterFunction_to_single_byte(@NotNull PLSQLParser.Function_to_single_byteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_to_single_byte}.
	 * @param ctx the parse tree
	 */
	void exitFunction_to_single_byte(@NotNull PLSQLParser.Function_to_single_byteContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#measure_expr}.
	 * @param ctx the parse tree
	 */
	void enterMeasure_expr(@NotNull PLSQLParser.Measure_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#measure_expr}.
	 * @param ctx the parse tree
	 */
	void exitMeasure_expr(@NotNull PLSQLParser.Measure_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#add_binding_clause}.
	 * @param ctx the parse tree
	 */
	void enterAdd_binding_clause(@NotNull PLSQLParser.Add_binding_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#add_binding_clause}.
	 * @param ctx the parse tree
	 */
	void exitAdd_binding_clause(@NotNull PLSQLParser.Add_binding_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull PLSQLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull PLSQLParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_substr}.
	 * @param ctx the parse tree
	 */
	void enterFunction_substr(@NotNull PLSQLParser.Function_substrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_substr}.
	 * @param ctx the parse tree
	 */
	void exitFunction_substr(@NotNull PLSQLParser.Function_substrContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_nvl2}.
	 * @param ctx the parse tree
	 */
	void enterFunction_nvl2(@NotNull PLSQLParser.Function_nvl2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_nvl2}.
	 * @param ctx the parse tree
	 */
	void exitFunction_nvl2(@NotNull PLSQLParser.Function_nvl2Context ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_feature_id}.
	 * @param ctx the parse tree
	 */
	void enterFunction_feature_id(@NotNull PLSQLParser.Function_feature_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_feature_id}.
	 * @param ctx the parse tree
	 */
	void exitFunction_feature_id(@NotNull PLSQLParser.Function_feature_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#inheritance_clauses}.
	 * @param ctx the parse tree
	 */
	void enterInheritance_clauses(@NotNull PLSQLParser.Inheritance_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#inheritance_clauses}.
	 * @param ctx the parse tree
	 */
	void exitInheritance_clauses(@NotNull PLSQLParser.Inheritance_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_abs}.
	 * @param ctx the parse tree
	 */
	void enterFunction_abs(@NotNull PLSQLParser.Function_absContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_abs}.
	 * @param ctx the parse tree
	 */
	void exitFunction_abs(@NotNull PLSQLParser.Function_absContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#modify_hash_partition}.
	 * @param ctx the parse tree
	 */
	void enterModify_hash_partition(@NotNull PLSQLParser.Modify_hash_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#modify_hash_partition}.
	 * @param ctx the parse tree
	 */
	void exitModify_hash_partition(@NotNull PLSQLParser.Modify_hash_partitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_chartorowid}.
	 * @param ctx the parse tree
	 */
	void enterFunction_chartorowid(@NotNull PLSQLParser.Function_chartorowidContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_chartorowid}.
	 * @param ctx the parse tree
	 */
	void exitFunction_chartorowid(@NotNull PLSQLParser.Function_chartorowidContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_powermultiset_by_cardinality}.
	 * @param ctx the parse tree
	 */
	void enterFunction_powermultiset_by_cardinality(@NotNull PLSQLParser.Function_powermultiset_by_cardinalityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_powermultiset_by_cardinality}.
	 * @param ctx the parse tree
	 */
	void exitFunction_powermultiset_by_cardinality(@NotNull PLSQLParser.Function_powermultiset_by_cardinalityContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#between_condition}.
	 * @param ctx the parse tree
	 */
	void enterBetween_condition(@NotNull PLSQLParser.Between_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#between_condition}.
	 * @param ctx the parse tree
	 */
	void exitBetween_condition(@NotNull PLSQLParser.Between_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#ref_cursor_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterRef_cursor_type_definition(@NotNull PLSQLParser.Ref_cursor_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#ref_cursor_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitRef_cursor_type_definition(@NotNull PLSQLParser.Ref_cursor_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#oid_clause}.
	 * @param ctx the parse tree
	 */
	void enterOid_clause(@NotNull PLSQLParser.Oid_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#oid_clause}.
	 * @param ctx the parse tree
	 */
	void exitOid_clause(@NotNull PLSQLParser.Oid_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#expression_filter_type}.
	 * @param ctx the parse tree
	 */
	void enterExpression_filter_type(@NotNull PLSQLParser.Expression_filter_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#expression_filter_type}.
	 * @param ctx the parse tree
	 */
	void exitExpression_filter_type(@NotNull PLSQLParser.Expression_filter_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_uid}.
	 * @param ctx the parse tree
	 */
	void enterFunction_uid(@NotNull PLSQLParser.Function_uidContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_uid}.
	 * @param ctx the parse tree
	 */
	void exitFunction_uid(@NotNull PLSQLParser.Function_uidContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_sin}.
	 * @param ctx the parse tree
	 */
	void enterFunction_sin(@NotNull PLSQLParser.Function_sinContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_sin}.
	 * @param ctx the parse tree
	 */
	void exitFunction_sin(@NotNull PLSQLParser.Function_sinContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#merge_table_partitions}.
	 * @param ctx the parse tree
	 */
	void enterMerge_table_partitions(@NotNull PLSQLParser.Merge_table_partitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#merge_table_partitions}.
	 * @param ctx the parse tree
	 */
	void exitMerge_table_partitions(@NotNull PLSQLParser.Merge_table_partitionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#undo_tablespace}.
	 * @param ctx the parse tree
	 */
	void enterUndo_tablespace(@NotNull PLSQLParser.Undo_tablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#undo_tablespace}.
	 * @param ctx the parse tree
	 */
	void exitUndo_tablespace(@NotNull PLSQLParser.Undo_tablespaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#logging_clause}.
	 * @param ctx the parse tree
	 */
	void enterLogging_clause(@NotNull PLSQLParser.Logging_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#logging_clause}.
	 * @param ctx the parse tree
	 */
	void exitLogging_clause(@NotNull PLSQLParser.Logging_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(@NotNull PLSQLParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(@NotNull PLSQLParser.ArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#implementation_type}.
	 * @param ctx the parse tree
	 */
	void enterImplementation_type(@NotNull PLSQLParser.Implementation_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#implementation_type}.
	 * @param ctx the parse tree
	 */
	void exitImplementation_type(@NotNull PLSQLParser.Implementation_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_attribute_definition}.
	 * @param ctx the parse tree
	 */
	void enterAlter_attribute_definition(@NotNull PLSQLParser.Alter_attribute_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_attribute_definition}.
	 * @param ctx the parse tree
	 */
	void exitAlter_attribute_definition(@NotNull PLSQLParser.Alter_attribute_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_prediction_bounds}.
	 * @param ctx the parse tree
	 */
	void enterFunction_prediction_bounds(@NotNull PLSQLParser.Function_prediction_boundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_prediction_bounds}.
	 * @param ctx the parse tree
	 */
	void exitFunction_prediction_bounds(@NotNull PLSQLParser.Function_prediction_boundsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_system_reset_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_system_reset_clause(@NotNull PLSQLParser.Alter_system_reset_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_system_reset_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_system_reset_clause(@NotNull PLSQLParser.Alter_system_reset_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sys_refcursor_instance}.
	 * @param ctx the parse tree
	 */
	void enterSys_refcursor_instance(@NotNull PLSQLParser.Sys_refcursor_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sys_refcursor_instance}.
	 * @param ctx the parse tree
	 */
	void exitSys_refcursor_instance(@NotNull PLSQLParser.Sys_refcursor_instanceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#oid_index_clause}.
	 * @param ctx the parse tree
	 */
	void enterOid_index_clause(@NotNull PLSQLParser.Oid_index_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#oid_index_clause}.
	 * @param ctx the parse tree
	 */
	void exitOid_index_clause(@NotNull PLSQLParser.Oid_index_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_bin_to_num}.
	 * @param ctx the parse tree
	 */
	void enterFunction_bin_to_num(@NotNull PLSQLParser.Function_bin_to_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_bin_to_num}.
	 * @param ctx the parse tree
	 */
	void exitFunction_bin_to_num(@NotNull PLSQLParser.Function_bin_to_numContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_bitand}.
	 * @param ctx the parse tree
	 */
	void enterFunction_bitand(@NotNull PLSQLParser.Function_bitandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_bitand}.
	 * @param ctx the parse tree
	 */
	void exitFunction_bitand(@NotNull PLSQLParser.Function_bitandContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alias_name}.
	 * @param ctx the parse tree
	 */
	void enterAlias_name(@NotNull PLSQLParser.Alias_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alias_name}.
	 * @param ctx the parse tree
	 */
	void exitAlias_name(@NotNull PLSQLParser.Alias_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_factoring_clause(@NotNull PLSQLParser.Subquery_factoring_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_factoring_clause(@NotNull PLSQLParser.Subquery_factoring_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_statement(@NotNull PLSQLParser.Function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_statement(@NotNull PLSQLParser.Function_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#category_name}.
	 * @param ctx the parse tree
	 */
	void enterCategory_name(@NotNull PLSQLParser.Category_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#category_name}.
	 * @param ctx the parse tree
	 */
	void exitCategory_name(@NotNull PLSQLParser.Category_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#autonomous_trans_pragma}.
	 * @param ctx the parse tree
	 */
	void enterAutonomous_trans_pragma(@NotNull PLSQLParser.Autonomous_trans_pragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#autonomous_trans_pragma}.
	 * @param ctx the parse tree
	 */
	void exitAutonomous_trans_pragma(@NotNull PLSQLParser.Autonomous_trans_pragmaContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#user_clauses}.
	 * @param ctx the parse tree
	 */
	void enterUser_clauses(@NotNull PLSQLParser.User_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#user_clauses}.
	 * @param ctx the parse tree
	 */
	void exitUser_clauses(@NotNull PLSQLParser.User_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_timestamp_to_scn}.
	 * @param ctx the parse tree
	 */
	void enterFunction_timestamp_to_scn(@NotNull PLSQLParser.Function_timestamp_to_scnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_timestamp_to_scn}.
	 * @param ctx the parse tree
	 */
	void exitFunction_timestamp_to_scn(@NotNull PLSQLParser.Function_timestamp_to_scnContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#drop_binding_clause}.
	 * @param ctx the parse tree
	 */
	void enterDrop_binding_clause(@NotNull PLSQLParser.Drop_binding_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#drop_binding_clause}.
	 * @param ctx the parse tree
	 */
	void exitDrop_binding_clause(@NotNull PLSQLParser.Drop_binding_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void enterRaise_statement(@NotNull PLSQLParser.Raise_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void exitRaise_statement(@NotNull PLSQLParser.Raise_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#set_encryption_key}.
	 * @param ctx the parse tree
	 */
	void enterSet_encryption_key(@NotNull PLSQLParser.Set_encryption_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#set_encryption_key}.
	 * @param ctx the parse tree
	 */
	void exitSet_encryption_key(@NotNull PLSQLParser.Set_encryption_keyContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#scale}.
	 * @param ctx the parse tree
	 */
	void enterScale(@NotNull PLSQLParser.ScaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#scale}.
	 * @param ctx the parse tree
	 */
	void exitScale(@NotNull PLSQLParser.ScaleContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_translate}.
	 * @param ctx the parse tree
	 */
	void enterFunction_translate(@NotNull PLSQLParser.Function_translateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_translate}.
	 * @param ctx the parse tree
	 */
	void exitFunction_translate(@NotNull PLSQLParser.Function_translateContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#subpartition_key_value}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition_key_value(@NotNull PLSQLParser.Subpartition_key_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#subpartition_key_value}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition_key_value(@NotNull PLSQLParser.Subpartition_key_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#no_cycle_value}.
	 * @param ctx the parse tree
	 */
	void enterNo_cycle_value(@NotNull PLSQLParser.No_cycle_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#no_cycle_value}.
	 * @param ctx the parse tree
	 */
	void exitNo_cycle_value(@NotNull PLSQLParser.No_cycle_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_sys_typeid}.
	 * @param ctx the parse tree
	 */
	void enterFunction_sys_typeid(@NotNull PLSQLParser.Function_sys_typeidContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_sys_typeid}.
	 * @param ctx the parse tree
	 */
	void exitFunction_sys_typeid(@NotNull PLSQLParser.Function_sys_typeidContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#rename_column_clause}.
	 * @param ctx the parse tree
	 */
	void enterRename_column_clause(@NotNull PLSQLParser.Rename_column_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#rename_column_clause}.
	 * @param ctx the parse tree
	 */
	void exitRename_column_clause(@NotNull PLSQLParser.Rename_column_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#start_position}.
	 * @param ctx the parse tree
	 */
	void enterStart_position(@NotNull PLSQLParser.Start_positionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#start_position}.
	 * @param ctx the parse tree
	 */
	void exitStart_position(@NotNull PLSQLParser.Start_positionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#variable_expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable_expression(@NotNull PLSQLParser.Variable_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#variable_expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable_expression(@NotNull PLSQLParser.Variable_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#nested_table_type_def}.
	 * @param ctx the parse tree
	 */
	void enterNested_table_type_def(@NotNull PLSQLParser.Nested_table_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#nested_table_type_def}.
	 * @param ctx the parse tree
	 */
	void exitNested_table_type_def(@NotNull PLSQLParser.Nested_table_type_defContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#lob_partitioning_storage}.
	 * @param ctx the parse tree
	 */
	void enterLob_partitioning_storage(@NotNull PLSQLParser.Lob_partitioning_storageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#lob_partitioning_storage}.
	 * @param ctx the parse tree
	 */
	void exitLob_partitioning_storage(@NotNull PLSQLParser.Lob_partitioning_storageContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cutoff}.
	 * @param ctx the parse tree
	 */
	void enterCutoff(@NotNull PLSQLParser.CutoffContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cutoff}.
	 * @param ctx the parse tree
	 */
	void exitCutoff(@NotNull PLSQLParser.CutoffContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_stddev_samp}.
	 * @param ctx the parse tree
	 */
	void enterFunction_stddev_samp(@NotNull PLSQLParser.Function_stddev_sampContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_stddev_samp}.
	 * @param ctx the parse tree
	 */
	void exitFunction_stddev_samp(@NotNull PLSQLParser.Function_stddev_sampContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#kerberos_principal_name}.
	 * @param ctx the parse tree
	 */
	void enterKerberos_principal_name(@NotNull PLSQLParser.Kerberos_principal_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#kerberos_principal_name}.
	 * @param ctx the parse tree
	 */
	void exitKerberos_principal_name(@NotNull PLSQLParser.Kerberos_principal_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cost_value}.
	 * @param ctx the parse tree
	 */
	void enterCost_value(@NotNull PLSQLParser.Cost_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cost_value}.
	 * @param ctx the parse tree
	 */
	void exitCost_value(@NotNull PLSQLParser.Cost_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#partition_key_value}.
	 * @param ctx the parse tree
	 */
	void enterPartition_key_value(@NotNull PLSQLParser.Partition_key_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#partition_key_value}.
	 * @param ctx the parse tree
	 */
	void exitPartition_key_value(@NotNull PLSQLParser.Partition_key_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#return_rows_clause}.
	 * @param ctx the parse tree
	 */
	void enterReturn_rows_clause(@NotNull PLSQLParser.Return_rows_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#return_rows_clause}.
	 * @param ctx the parse tree
	 */
	void exitReturn_rows_clause(@NotNull PLSQLParser.Return_rows_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#search_clause}.
	 * @param ctx the parse tree
	 */
	void enterSearch_clause(@NotNull PLSQLParser.Search_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#search_clause}.
	 * @param ctx the parse tree
	 */
	void exitSearch_clause(@NotNull PLSQLParser.Search_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#audit_operation_clause}.
	 * @param ctx the parse tree
	 */
	void enterAudit_operation_clause(@NotNull PLSQLParser.Audit_operation_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#audit_operation_clause}.
	 * @param ctx the parse tree
	 */
	void exitAudit_operation_clause(@NotNull PLSQLParser.Audit_operation_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_lower}.
	 * @param ctx the parse tree
	 */
	void enterFunction_lower(@NotNull PLSQLParser.Function_lowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_lower}.
	 * @param ctx the parse tree
	 */
	void exitFunction_lower(@NotNull PLSQLParser.Function_lowerContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_nvl}.
	 * @param ctx the parse tree
	 */
	void enterFunction_nvl(@NotNull PLSQLParser.Function_nvlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_nvl}.
	 * @param ctx the parse tree
	 */
	void exitFunction_nvl(@NotNull PLSQLParser.Function_nvlContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#ref_column}.
	 * @param ctx the parse tree
	 */
	void enterRef_column(@NotNull PLSQLParser.Ref_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#ref_column}.
	 * @param ctx the parse tree
	 */
	void exitRef_column(@NotNull PLSQLParser.Ref_columnContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(@NotNull PLSQLParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(@NotNull PLSQLParser.AliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#rowtype}.
	 * @param ctx the parse tree
	 */
	void enterRowtype(@NotNull PLSQLParser.RowtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#rowtype}.
	 * @param ctx the parse tree
	 */
	void exitRowtype(@NotNull PLSQLParser.RowtypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#lob_storage_parameters}.
	 * @param ctx the parse tree
	 */
	void enterLob_storage_parameters(@NotNull PLSQLParser.Lob_storage_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#lob_storage_parameters}.
	 * @param ctx the parse tree
	 */
	void exitLob_storage_parameters(@NotNull PLSQLParser.Lob_storage_parametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_datetime_with_timezone}.
	 * @param ctx the parse tree
	 */
	void enterFunction_datetime_with_timezone(@NotNull PLSQLParser.Function_datetime_with_timezoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_datetime_with_timezone}.
	 * @param ctx the parse tree
	 */
	void exitFunction_datetime_with_timezone(@NotNull PLSQLParser.Function_datetime_with_timezoneContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#update_global_index_clause}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_global_index_clause(@NotNull PLSQLParser.Update_global_index_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#update_global_index_clause}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_global_index_clause(@NotNull PLSQLParser.Update_global_index_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#year_precision}.
	 * @param ctx the parse tree
	 */
	void enterYear_precision(@NotNull PLSQLParser.Year_precisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#year_precision}.
	 * @param ctx the parse tree
	 */
	void exitYear_precision(@NotNull PLSQLParser.Year_precisionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#host_variable}.
	 * @param ctx the parse tree
	 */
	void enterHost_variable(@NotNull PLSQLParser.Host_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#host_variable}.
	 * @param ctx the parse tree
	 */
	void exitHost_variable(@NotNull PLSQLParser.Host_variableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#hint}.
	 * @param ctx the parse tree
	 */
	void enterHint(@NotNull PLSQLParser.HintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#hint}.
	 * @param ctx the parse tree
	 */
	void exitHint(@NotNull PLSQLParser.HintContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#storage_table}.
	 * @param ctx the parse tree
	 */
	void enterStorage_table(@NotNull PLSQLParser.Storage_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#storage_table}.
	 * @param ctx the parse tree
	 */
	void exitStorage_table(@NotNull PLSQLParser.Storage_tableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#varray_item}.
	 * @param ctx the parse tree
	 */
	void enterVarray_item(@NotNull PLSQLParser.Varray_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#varray_item}.
	 * @param ctx the parse tree
	 */
	void exitVarray_item(@NotNull PLSQLParser.Varray_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#database}.
	 * @param ctx the parse tree
	 */
	void enterDatabase(@NotNull PLSQLParser.DatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#database}.
	 * @param ctx the parse tree
	 */
	void exitDatabase(@NotNull PLSQLParser.DatabaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#data_item}.
	 * @param ctx the parse tree
	 */
	void enterData_item(@NotNull PLSQLParser.Data_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#data_item}.
	 * @param ctx the parse tree
	 */
	void exitData_item(@NotNull PLSQLParser.Data_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_decompose}.
	 * @param ctx the parse tree
	 */
	void enterFunction_decompose(@NotNull PLSQLParser.Function_decomposeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_decompose}.
	 * @param ctx the parse tree
	 */
	void exitFunction_decompose(@NotNull PLSQLParser.Function_decomposeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#outline_name}.
	 * @param ctx the parse tree
	 */
	void enterOutline_name(@NotNull PLSQLParser.Outline_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#outline_name}.
	 * @param ctx the parse tree
	 */
	void exitOutline_name(@NotNull PLSQLParser.Outline_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#namespace_mapping_clause}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_mapping_clause(@NotNull PLSQLParser.Namespace_mapping_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#namespace_mapping_clause}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_mapping_clause(@NotNull PLSQLParser.Namespace_mapping_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_regexp_substr}.
	 * @param ctx the parse tree
	 */
	void enterFunction_regexp_substr(@NotNull PLSQLParser.Function_regexp_substrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_regexp_substr}.
	 * @param ctx the parse tree
	 */
	void exitFunction_regexp_substr(@NotNull PLSQLParser.Function_regexp_substrContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#create_function}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function(@NotNull PLSQLParser.Create_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#create_function}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function(@NotNull PLSQLParser.Create_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#split_nested_table_part}.
	 * @param ctx the parse tree
	 */
	void enterSplit_nested_table_part(@NotNull PLSQLParser.Split_nested_table_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#split_nested_table_part}.
	 * @param ctx the parse tree
	 */
	void exitSplit_nested_table_part(@NotNull PLSQLParser.Split_nested_table_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(@NotNull PLSQLParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(@NotNull PLSQLParser.Expression_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_concat}.
	 * @param ctx the parse tree
	 */
	void enterFunction_concat(@NotNull PLSQLParser.Function_concatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_concat}.
	 * @param ctx the parse tree
	 */
	void exitFunction_concat(@NotNull PLSQLParser.Function_concatContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_compose}.
	 * @param ctx the parse tree
	 */
	void enterFunction_compose(@NotNull PLSQLParser.Function_composeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_compose}.
	 * @param ctx the parse tree
	 */
	void exitFunction_compose(@NotNull PLSQLParser.Function_composeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#varray}.
	 * @param ctx the parse tree
	 */
	void enterVarray(@NotNull PLSQLParser.VarrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#varray}.
	 * @param ctx the parse tree
	 */
	void exitVarray(@NotNull PLSQLParser.VarrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_row_number}.
	 * @param ctx the parse tree
	 */
	void enterFunction_row_number(@NotNull PLSQLParser.Function_row_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_row_number}.
	 * @param ctx the parse tree
	 */
	void exitFunction_row_number(@NotNull PLSQLParser.Function_row_numberContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterMulti_column_for_loop(@NotNull PLSQLParser.Multi_column_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitMulti_column_for_loop(@NotNull PLSQLParser.Multi_column_for_loopContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#modify_list_partition}.
	 * @param ctx the parse tree
	 */
	void enterModify_list_partition(@NotNull PLSQLParser.Modify_list_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#modify_list_partition}.
	 * @param ctx the parse tree
	 */
	void exitModify_list_partition(@NotNull PLSQLParser.Modify_list_partitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#old_name}.
	 * @param ctx the parse tree
	 */
	void enterOld_name(@NotNull PLSQLParser.Old_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#old_name}.
	 * @param ctx the parse tree
	 */
	void exitOld_name(@NotNull PLSQLParser.Old_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#list_values_clause}.
	 * @param ctx the parse tree
	 */
	void enterList_values_clause(@NotNull PLSQLParser.List_values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#list_values_clause}.
	 * @param ctx the parse tree
	 */
	void exitList_values_clause(@NotNull PLSQLParser.List_values_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#parameter_value}.
	 * @param ctx the parse tree
	 */
	void enterParameter_value(@NotNull PLSQLParser.Parameter_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#parameter_value}.
	 * @param ctx the parse tree
	 */
	void exitParameter_value(@NotNull PLSQLParser.Parameter_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#file_specification}.
	 * @param ctx the parse tree
	 */
	void enterFile_specification(@NotNull PLSQLParser.File_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#file_specification}.
	 * @param ctx the parse tree
	 */
	void exitFile_specification(@NotNull PLSQLParser.File_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#hash_subpartition_desc}.
	 * @param ctx the parse tree
	 */
	void enterHash_subpartition_desc(@NotNull PLSQLParser.Hash_subpartition_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#hash_subpartition_desc}.
	 * @param ctx the parse tree
	 */
	void exitHash_subpartition_desc(@NotNull PLSQLParser.Hash_subpartition_descContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#substring}.
	 * @param ctx the parse tree
	 */
	void enterSubstring(@NotNull PLSQLParser.SubstringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#substring}.
	 * @param ctx the parse tree
	 */
	void exitSubstring(@NotNull PLSQLParser.SubstringContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sql_update}.
	 * @param ctx the parse tree
	 */
	void enterSql_update(@NotNull PLSQLParser.Sql_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sql_update}.
	 * @param ctx the parse tree
	 */
	void exitSql_update(@NotNull PLSQLParser.Sql_updateContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_stddev}.
	 * @param ctx the parse tree
	 */
	void enterFunction_stddev(@NotNull PLSQLParser.Function_stddevContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_stddev}.
	 * @param ctx the parse tree
	 */
	void exitFunction_stddev(@NotNull PLSQLParser.Function_stddevContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#redundancy_clause}.
	 * @param ctx the parse tree
	 */
	void enterRedundancy_clause(@NotNull PLSQLParser.Redundancy_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#redundancy_clause}.
	 * @param ctx the parse tree
	 */
	void exitRedundancy_clause(@NotNull PLSQLParser.Redundancy_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#object_reference_function}.
	 * @param ctx the parse tree
	 */
	void enterObject_reference_function(@NotNull PLSQLParser.Object_reference_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#object_reference_function}.
	 * @param ctx the parse tree
	 */
	void exitObject_reference_function(@NotNull PLSQLParser.Object_reference_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#query_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterQuery_table_expression(@NotNull PLSQLParser.Query_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#query_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitQuery_table_expression(@NotNull PLSQLParser.Query_table_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_extract_datetime}.
	 * @param ctx the parse tree
	 */
	void enterFunction_extract_datetime(@NotNull PLSQLParser.Function_extract_datetimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_extract_datetime}.
	 * @param ctx the parse tree
	 */
	void exitFunction_extract_datetime(@NotNull PLSQLParser.Function_extract_datetimeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_interval_partitioning}.
	 * @param ctx the parse tree
	 */
	void enterAlter_interval_partitioning(@NotNull PLSQLParser.Alter_interval_partitioningContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_interval_partitioning}.
	 * @param ctx the parse tree
	 */
	void exitAlter_interval_partitioning(@NotNull PLSQLParser.Alter_interval_partitioningContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#list_partition_desc}.
	 * @param ctx the parse tree
	 */
	void enterList_partition_desc(@NotNull PLSQLParser.List_partition_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#list_partition_desc}.
	 * @param ctx the parse tree
	 */
	void exitList_partition_desc(@NotNull PLSQLParser.List_partition_descContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xmltype_virtual_columns}.
	 * @param ctx the parse tree
	 */
	void enterXmltype_virtual_columns(@NotNull PLSQLParser.Xmltype_virtual_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xmltype_virtual_columns}.
	 * @param ctx the parse tree
	 */
	void exitXmltype_virtual_columns(@NotNull PLSQLParser.Xmltype_virtual_columnsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_add_months}.
	 * @param ctx the parse tree
	 */
	void enterFunction_add_months(@NotNull PLSQLParser.Function_add_monthsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_add_months}.
	 * @param ctx the parse tree
	 */
	void exitFunction_add_months(@NotNull PLSQLParser.Function_add_monthsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#object_table_alias}.
	 * @param ctx the parse tree
	 */
	void enterObject_table_alias(@NotNull PLSQLParser.Object_table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#object_table_alias}.
	 * @param ctx the parse tree
	 */
	void exitObject_table_alias(@NotNull PLSQLParser.Object_table_aliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#range_values_clause}.
	 * @param ctx the parse tree
	 */
	void enterRange_values_clause(@NotNull PLSQLParser.Range_values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#range_values_clause}.
	 * @param ctx the parse tree
	 */
	void exitRange_values_clause(@NotNull PLSQLParser.Range_values_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#inner_cross_join_clause}.
	 * @param ctx the parse tree
	 */
	void enterInner_cross_join_clause(@NotNull PLSQLParser.Inner_cross_join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#inner_cross_join_clause}.
	 * @param ctx the parse tree
	 */
	void exitInner_cross_join_clause(@NotNull PLSQLParser.Inner_cross_join_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#modify_range_partition}.
	 * @param ctx the parse tree
	 */
	void enterModify_range_partition(@NotNull PLSQLParser.Modify_range_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#modify_range_partition}.
	 * @param ctx the parse tree
	 */
	void exitModify_range_partition(@NotNull PLSQLParser.Modify_range_partitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#positive_number}.
	 * @param ctx the parse tree
	 */
	void enterPositive_number(@NotNull PLSQLParser.Positive_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#positive_number}.
	 * @param ctx the parse tree
	 */
	void exitPositive_number(@NotNull PLSQLParser.Positive_numberContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#constraint_state}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_state(@NotNull PLSQLParser.Constraint_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#constraint_state}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_state(@NotNull PLSQLParser.Constraint_stateContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sql_rollback}.
	 * @param ctx the parse tree
	 */
	void enterSql_rollback(@NotNull PLSQLParser.Sql_rollbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sql_rollback}.
	 * @param ctx the parse tree
	 */
	void exitSql_rollback(@NotNull PLSQLParser.Sql_rollbackContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_overflow_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_overflow_clause(@NotNull PLSQLParser.Alter_overflow_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_overflow_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_overflow_clause(@NotNull PLSQLParser.Alter_overflow_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#static_returning_clause}.
	 * @param ctx the parse tree
	 */
	void enterStatic_returning_clause(@NotNull PLSQLParser.Static_returning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#static_returning_clause}.
	 * @param ctx the parse tree
	 */
	void exitStatic_returning_clause(@NotNull PLSQLParser.Static_returning_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_next_day}.
	 * @param ctx the parse tree
	 */
	void enterFunction_next_day(@NotNull PLSQLParser.Function_next_dayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_next_day}.
	 * @param ctx the parse tree
	 */
	void exitFunction_next_day(@NotNull PLSQLParser.Function_next_dayContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#using_function_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_function_clause(@NotNull PLSQLParser.Using_function_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#using_function_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_function_clause(@NotNull PLSQLParser.Using_function_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cycle_clause}.
	 * @param ctx the parse tree
	 */
	void enterCycle_clause(@NotNull PLSQLParser.Cycle_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cycle_clause}.
	 * @param ctx the parse tree
	 */
	void exitCycle_clause(@NotNull PLSQLParser.Cycle_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#logfile_descriptor}.
	 * @param ctx the parse tree
	 */
	void enterLogfile_descriptor(@NotNull PLSQLParser.Logfile_descriptorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#logfile_descriptor}.
	 * @param ctx the parse tree
	 */
	void exitLogfile_descriptor(@NotNull PLSQLParser.Logfile_descriptorContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#modify_table_subpartition}.
	 * @param ctx the parse tree
	 */
	void enterModify_table_subpartition(@NotNull PLSQLParser.Modify_table_subpartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#modify_table_subpartition}.
	 * @param ctx the parse tree
	 */
	void exitModify_table_subpartition(@NotNull PLSQLParser.Modify_table_subpartitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#exception_init_pragma}.
	 * @param ctx the parse tree
	 */
	void enterException_init_pragma(@NotNull PLSQLParser.Exception_init_pragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#exception_init_pragma}.
	 * @param ctx the parse tree
	 */
	void exitException_init_pragma(@NotNull PLSQLParser.Exception_init_pragmaContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#analytic_clause}.
	 * @param ctx the parse tree
	 */
	void enterAnalytic_clause(@NotNull PLSQLParser.Analytic_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#analytic_clause}.
	 * @param ctx the parse tree
	 */
	void exitAnalytic_clause(@NotNull PLSQLParser.Analytic_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_lpad}.
	 * @param ctx the parse tree
	 */
	void enterFunction_lpad(@NotNull PLSQLParser.Function_lpadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_lpad}.
	 * @param ctx the parse tree
	 */
	void exitFunction_lpad(@NotNull PLSQLParser.Function_lpadContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#default_selectivity_clause}.
	 * @param ctx the parse tree
	 */
	void enterDefault_selectivity_clause(@NotNull PLSQLParser.Default_selectivity_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#default_selectivity_clause}.
	 * @param ctx the parse tree
	 */
	void exitDefault_selectivity_clause(@NotNull PLSQLParser.Default_selectivity_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_percent_rank_analytic}.
	 * @param ctx the parse tree
	 */
	void enterFunction_percent_rank_analytic(@NotNull PLSQLParser.Function_percent_rank_analyticContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_percent_rank_analytic}.
	 * @param ctx the parse tree
	 */
	void exitFunction_percent_rank_analytic(@NotNull PLSQLParser.Function_percent_rank_analyticContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#other_boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterOther_boolean_expression(@NotNull PLSQLParser.Other_boolean_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#other_boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitOther_boolean_expression(@NotNull PLSQLParser.Other_boolean_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#subpartition_by_list}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition_by_list(@NotNull PLSQLParser.Subpartition_by_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#subpartition_by_list}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition_by_list(@NotNull PLSQLParser.Subpartition_by_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_type_clauses}.
	 * @param ctx the parse tree
	 */
	void enterAlter_type_clauses(@NotNull PLSQLParser.Alter_type_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_type_clauses}.
	 * @param ctx the parse tree
	 */
	void exitAlter_type_clauses(@NotNull PLSQLParser.Alter_type_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#esc_char}.
	 * @param ctx the parse tree
	 */
	void enterEsc_char(@NotNull PLSQLParser.Esc_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#esc_char}.
	 * @param ctx the parse tree
	 */
	void exitEsc_char(@NotNull PLSQLParser.Esc_charContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#model_rules_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_clause(@NotNull PLSQLParser.Model_rules_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#model_rules_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_clause(@NotNull PLSQLParser.Model_rules_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_xmlconcat}.
	 * @param ctx the parse tree
	 */
	void enterFunction_xmlconcat(@NotNull PLSQLParser.Function_xmlconcatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_xmlconcat}.
	 * @param ctx the parse tree
	 */
	void exitFunction_xmlconcat(@NotNull PLSQLParser.Function_xmlconcatContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#mapping_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterMapping_table_clause(@NotNull PLSQLParser.Mapping_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#mapping_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitMapping_table_clause(@NotNull PLSQLParser.Mapping_table_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#is_of_type_condition}.
	 * @param ctx the parse tree
	 */
	void enterIs_of_type_condition(@NotNull PLSQLParser.Is_of_type_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#is_of_type_condition}.
	 * @param ctx the parse tree
	 */
	void exitIs_of_type_condition(@NotNull PLSQLParser.Is_of_type_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#rebalance_diskgroup_clause}.
	 * @param ctx the parse tree
	 */
	void enterRebalance_diskgroup_clause(@NotNull PLSQLParser.Rebalance_diskgroup_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#rebalance_diskgroup_clause}.
	 * @param ctx the parse tree
	 */
	void exitRebalance_diskgroup_clause(@NotNull PLSQLParser.Rebalance_diskgroup_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#tablespace_state_clauses}.
	 * @param ctx the parse tree
	 */
	void enterTablespace_state_clauses(@NotNull PLSQLParser.Tablespace_state_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#tablespace_state_clauses}.
	 * @param ctx the parse tree
	 */
	void exitTablespace_state_clauses(@NotNull PLSQLParser.Tablespace_state_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_rpad}.
	 * @param ctx the parse tree
	 */
	void enterFunction_rpad(@NotNull PLSQLParser.Function_rpadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_rpad}.
	 * @param ctx the parse tree
	 */
	void exitFunction_rpad(@NotNull PLSQLParser.Function_rpadContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#proxy}.
	 * @param ctx the parse tree
	 */
	void enterProxy(@NotNull PLSQLParser.ProxyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#proxy}.
	 * @param ctx the parse tree
	 */
	void exitProxy(@NotNull PLSQLParser.ProxyContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#diskgroup_template_clauses}.
	 * @param ctx the parse tree
	 */
	void enterDiskgroup_template_clauses(@NotNull PLSQLParser.Diskgroup_template_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#diskgroup_template_clauses}.
	 * @param ctx the parse tree
	 */
	void exitDiskgroup_template_clauses(@NotNull PLSQLParser.Diskgroup_template_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(@NotNull PLSQLParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(@NotNull PLSQLParser.ProcedureContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#structured_clause}.
	 * @param ctx the parse tree
	 */
	void enterStructured_clause(@NotNull PLSQLParser.Structured_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#structured_clause}.
	 * @param ctx the parse tree
	 */
	void exitStructured_clause(@NotNull PLSQLParser.Structured_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#relies_on_clause}.
	 * @param ctx the parse tree
	 */
	void enterRelies_on_clause(@NotNull PLSQLParser.Relies_on_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#relies_on_clause}.
	 * @param ctx the parse tree
	 */
	void exitRelies_on_clause(@NotNull PLSQLParser.Relies_on_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#interval_expression}.
	 * @param ctx the parse tree
	 */
	void enterInterval_expression(@NotNull PLSQLParser.Interval_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#interval_expression}.
	 * @param ctx the parse tree
	 */
	void exitInterval_expression(@NotNull PLSQLParser.Interval_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#package_name}.
	 * @param ctx the parse tree
	 */
	void enterPackage_name(@NotNull PLSQLParser.Package_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#package_name}.
	 * @param ctx the parse tree
	 */
	void exitPackage_name(@NotNull PLSQLParser.Package_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sql_operation}.
	 * @param ctx the parse tree
	 */
	void enterSql_operation(@NotNull PLSQLParser.Sql_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sql_operation}.
	 * @param ctx the parse tree
	 */
	void exitSql_operation(@NotNull PLSQLParser.Sql_operationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#pragma_clause}.
	 * @param ctx the parse tree
	 */
	void enterPragma_clause(@NotNull PLSQLParser.Pragma_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#pragma_clause}.
	 * @param ctx the parse tree
	 */
	void exitPragma_clause(@NotNull PLSQLParser.Pragma_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#restrict_references_pragma}.
	 * @param ctx the parse tree
	 */
	void enterRestrict_references_pragma(@NotNull PLSQLParser.Restrict_references_pragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#restrict_references_pragma}.
	 * @param ctx the parse tree
	 */
	void exitRestrict_references_pragma(@NotNull PLSQLParser.Restrict_references_pragmaContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#select_item}.
	 * @param ctx the parse tree
	 */
	void enterSelect_item(@NotNull PLSQLParser.Select_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#select_item}.
	 * @param ctx the parse tree
	 */
	void exitSelect_item(@NotNull PLSQLParser.Select_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#directory_name}.
	 * @param ctx the parse tree
	 */
	void enterDirectory_name(@NotNull PLSQLParser.Directory_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#directory_name}.
	 * @param ctx the parse tree
	 */
	void exitDirectory_name(@NotNull PLSQLParser.Directory_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#physical_properties}.
	 * @param ctx the parse tree
	 */
	void enterPhysical_properties(@NotNull PLSQLParser.Physical_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#physical_properties}.
	 * @param ctx the parse tree
	 */
	void exitPhysical_properties(@NotNull PLSQLParser.Physical_propertiesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#mv_log_purge_clause}.
	 * @param ctx the parse tree
	 */
	void enterMv_log_purge_clause(@NotNull PLSQLParser.Mv_log_purge_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#mv_log_purge_clause}.
	 * @param ctx the parse tree
	 */
	void exitMv_log_purge_clause(@NotNull PLSQLParser.Mv_log_purge_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_clause(@NotNull PLSQLParser.Unpivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_clause(@NotNull PLSQLParser.Unpivot_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_ora_hash}.
	 * @param ctx the parse tree
	 */
	void enterFunction_ora_hash(@NotNull PLSQLParser.Function_ora_hashContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_ora_hash}.
	 * @param ctx the parse tree
	 */
	void exitFunction_ora_hash(@NotNull PLSQLParser.Function_ora_hashContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#implicit_cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void enterImplicit_cursor_attribute(@NotNull PLSQLParser.Implicit_cursor_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#implicit_cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void exitImplicit_cursor_attribute(@NotNull PLSQLParser.Implicit_cursor_attributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull PLSQLParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull PLSQLParser.ArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#table_properties}.
	 * @param ctx the parse tree
	 */
	void enterTable_properties(@NotNull PLSQLParser.Table_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#table_properties}.
	 * @param ctx the parse tree
	 */
	void exitTable_properties(@NotNull PLSQLParser.Table_propertiesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(@NotNull PLSQLParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(@NotNull PLSQLParser.Select_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#composite_list_partitions}.
	 * @param ctx the parse tree
	 */
	void enterComposite_list_partitions(@NotNull PLSQLParser.Composite_list_partitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#composite_list_partitions}.
	 * @param ctx the parse tree
	 */
	void exitComposite_list_partitions(@NotNull PLSQLParser.Composite_list_partitionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#new_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_name(@NotNull PLSQLParser.New_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#new_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_name(@NotNull PLSQLParser.New_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#source_char}.
	 * @param ctx the parse tree
	 */
	void enterSource_char(@NotNull PLSQLParser.Source_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#source_char}.
	 * @param ctx the parse tree
	 */
	void exitSource_char(@NotNull PLSQLParser.Source_charContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#scope_table}.
	 * @param ctx the parse tree
	 */
	void enterScope_table(@NotNull PLSQLParser.Scope_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#scope_table}.
	 * @param ctx the parse tree
	 */
	void exitScope_table(@NotNull PLSQLParser.Scope_tableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#log_segname}.
	 * @param ctx the parse tree
	 */
	void enterLog_segname(@NotNull PLSQLParser.Log_segnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#log_segname}.
	 * @param ctx the parse tree
	 */
	void exitLog_segname(@NotNull PLSQLParser.Log_segnameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#index_expr}.
	 * @param ctx the parse tree
	 */
	void enterIndex_expr(@NotNull PLSQLParser.Index_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#index_expr}.
	 * @param ctx the parse tree
	 */
	void exitIndex_expr(@NotNull PLSQLParser.Index_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_stats_t_test_paired}.
	 * @param ctx the parse tree
	 */
	void enterFunction_stats_t_test_paired(@NotNull PLSQLParser.Function_stats_t_test_pairedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_stats_t_test_paired}.
	 * @param ctx the parse tree
	 */
	void exitFunction_stats_t_test_paired(@NotNull PLSQLParser.Function_stats_t_test_pairedContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#synonym}.
	 * @param ctx the parse tree
	 */
	void enterSynonym(@NotNull PLSQLParser.SynonymContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#synonym}.
	 * @param ctx the parse tree
	 */
	void exitSynonym(@NotNull PLSQLParser.SynonymContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#grouping_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_expression_list(@NotNull PLSQLParser.Grouping_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#grouping_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_expression_list(@NotNull PLSQLParser.Grouping_expression_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#register_logfile_clause}.
	 * @param ctx the parse tree
	 */
	void enterRegister_logfile_clause(@NotNull PLSQLParser.Register_logfile_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#register_logfile_clause}.
	 * @param ctx the parse tree
	 */
	void exitRegister_logfile_clause(@NotNull PLSQLParser.Register_logfile_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#level_table}.
	 * @param ctx the parse tree
	 */
	void enterLevel_table(@NotNull PLSQLParser.Level_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#level_table}.
	 * @param ctx the parse tree
	 */
	void exitLevel_table(@NotNull PLSQLParser.Level_tableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#asm_volume}.
	 * @param ctx the parse tree
	 */
	void enterAsm_volume(@NotNull PLSQLParser.Asm_volumeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#asm_volume}.
	 * @param ctx the parse tree
	 */
	void exitAsm_volume(@NotNull PLSQLParser.Asm_volumeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_prediction_cost}.
	 * @param ctx the parse tree
	 */
	void enterFunction_prediction_cost(@NotNull PLSQLParser.Function_prediction_costContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_prediction_cost}.
	 * @param ctx the parse tree
	 */
	void exitFunction_prediction_cost(@NotNull PLSQLParser.Function_prediction_costContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#object_properties}.
	 * @param ctx the parse tree
	 */
	void enterObject_properties(@NotNull PLSQLParser.Object_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#object_properties}.
	 * @param ctx the parse tree
	 */
	void exitObject_properties(@NotNull PLSQLParser.Object_propertiesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#timezone}.
	 * @param ctx the parse tree
	 */
	void enterTimezone(@NotNull PLSQLParser.TimezoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#timezone}.
	 * @param ctx the parse tree
	 */
	void exitTimezone(@NotNull PLSQLParser.TimezoneContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#tablespace_group_name}.
	 * @param ctx the parse tree
	 */
	void enterTablespace_group_name(@NotNull PLSQLParser.Tablespace_group_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#tablespace_group_name}.
	 * @param ctx the parse tree
	 */
	void exitTablespace_group_name(@NotNull PLSQLParser.Tablespace_group_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_trim}.
	 * @param ctx the parse tree
	 */
	void enterFunction_trim(@NotNull PLSQLParser.Function_trimContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_trim}.
	 * @param ctx the parse tree
	 */
	void exitFunction_trim(@NotNull PLSQLParser.Function_trimContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#connection_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterConnection_qualifier(@NotNull PLSQLParser.Connection_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#connection_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitConnection_qualifier(@NotNull PLSQLParser.Connection_qualifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#c_declaration}.
	 * @param ctx the parse tree
	 */
	void enterC_declaration(@NotNull PLSQLParser.C_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#c_declaration}.
	 * @param ctx the parse tree
	 */
	void exitC_declaration(@NotNull PLSQLParser.C_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_nls_initcap}.
	 * @param ctx the parse tree
	 */
	void enterFunction_nls_initcap(@NotNull PLSQLParser.Function_nls_initcapContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_nls_initcap}.
	 * @param ctx the parse tree
	 */
	void exitFunction_nls_initcap(@NotNull PLSQLParser.Function_nls_initcapContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#large_object_function}.
	 * @param ctx the parse tree
	 */
	void enterLarge_object_function(@NotNull PLSQLParser.Large_object_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#large_object_function}.
	 * @param ctx the parse tree
	 */
	void exitLarge_object_function(@NotNull PLSQLParser.Large_object_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull PLSQLParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull PLSQLParser.ConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#materialized_view_props}.
	 * @param ctx the parse tree
	 */
	void enterMaterialized_view_props(@NotNull PLSQLParser.Materialized_view_propsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#materialized_view_props}.
	 * @param ctx the parse tree
	 */
	void exitMaterialized_view_props(@NotNull PLSQLParser.Materialized_view_propsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#drop_column_options}.
	 * @param ctx the parse tree
	 */
	void enterDrop_column_options(@NotNull PLSQLParser.Drop_column_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#drop_column_options}.
	 * @param ctx the parse tree
	 */
	void exitDrop_column_options(@NotNull PLSQLParser.Drop_column_optionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#move_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterMove_table_clause(@NotNull PLSQLParser.Move_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#move_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitMove_table_clause(@NotNull PLSQLParser.Move_table_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_regr_linear}.
	 * @param ctx the parse tree
	 */
	void enterFunction_regr_linear(@NotNull PLSQLParser.Function_regr_linearContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_regr_linear}.
	 * @param ctx the parse tree
	 */
	void exitFunction_regr_linear(@NotNull PLSQLParser.Function_regr_linearContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#create_index_paths_clause}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_paths_clause(@NotNull PLSQLParser.Create_index_paths_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#create_index_paths_clause}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_paths_clause(@NotNull PLSQLParser.Create_index_paths_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#tablespec}.
	 * @param ctx the parse tree
	 */
	void enterTablespec(@NotNull PLSQLParser.TablespecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#tablespec}.
	 * @param ctx the parse tree
	 */
	void exitTablespec(@NotNull PLSQLParser.TablespecContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#default_settings_clauses}.
	 * @param ctx the parse tree
	 */
	void enterDefault_settings_clauses(@NotNull PLSQLParser.Default_settings_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#default_settings_clauses}.
	 * @param ctx the parse tree
	 */
	void exitDefault_settings_clauses(@NotNull PLSQLParser.Default_settings_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_length}.
	 * @param ctx the parse tree
	 */
	void enterFunction_length(@NotNull PLSQLParser.Function_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_length}.
	 * @param ctx the parse tree
	 */
	void exitFunction_length(@NotNull PLSQLParser.Function_lengthContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursor_parameter_dec}.
	 * @param ctx the parse tree
	 */
	void enterCursor_parameter_dec(@NotNull PLSQLParser.Cursor_parameter_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursor_parameter_dec}.
	 * @param ctx the parse tree
	 */
	void exitCursor_parameter_dec(@NotNull PLSQLParser.Cursor_parameter_decContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#query_partition_clause}.
	 * @param ctx the parse tree
	 */
	void enterQuery_partition_clause(@NotNull PLSQLParser.Query_partition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#query_partition_clause}.
	 * @param ctx the parse tree
	 */
	void exitQuery_partition_clause(@NotNull PLSQLParser.Query_partition_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#character_function}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_function(@NotNull PLSQLParser.Character_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#character_function}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_function(@NotNull PLSQLParser.Character_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_existsnode}.
	 * @param ctx the parse tree
	 */
	void enterFunction_existsnode(@NotNull PLSQLParser.Function_existsnodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_existsnode}.
	 * @param ctx the parse tree
	 */
	void exitFunction_existsnode(@NotNull PLSQLParser.Function_existsnodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull PLSQLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull PLSQLParser.IdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#scope_table_name}.
	 * @param ctx the parse tree
	 */
	void enterScope_table_name(@NotNull PLSQLParser.Scope_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#scope_table_name}.
	 * @param ctx the parse tree
	 */
	void exitScope_table_name(@NotNull PLSQLParser.Scope_table_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_stddev_pop}.
	 * @param ctx the parse tree
	 */
	void enterFunction_stddev_pop(@NotNull PLSQLParser.Function_stddev_popContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_stddev_pop}.
	 * @param ctx the parse tree
	 */
	void exitFunction_stddev_pop(@NotNull PLSQLParser.Function_stddev_popContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#db_user_proxy}.
	 * @param ctx the parse tree
	 */
	void enterDb_user_proxy(@NotNull PLSQLParser.Db_user_proxyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#db_user_proxy}.
	 * @param ctx the parse tree
	 */
	void exitDb_user_proxy(@NotNull PLSQLParser.Db_user_proxyContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_time_zone_value}.
	 * @param ctx the parse tree
	 */
	void enterFunction_time_zone_value(@NotNull PLSQLParser.Function_time_zone_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_time_zone_value}.
	 * @param ctx the parse tree
	 */
	void exitFunction_time_zone_value(@NotNull PLSQLParser.Function_time_zone_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sql_select}.
	 * @param ctx the parse tree
	 */
	void enterSql_select(@NotNull PLSQLParser.Sql_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sql_select}.
	 * @param ctx the parse tree
	 */
	void exitSql_select(@NotNull PLSQLParser.Sql_selectContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_stats_binomial_test}.
	 * @param ctx the parse tree
	 */
	void enterFunction_stats_binomial_test(@NotNull PLSQLParser.Function_stats_binomial_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_stats_binomial_test}.
	 * @param ctx the parse tree
	 */
	void exitFunction_stats_binomial_test(@NotNull PLSQLParser.Function_stats_binomial_testContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#groups_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroups_clause(@NotNull PLSQLParser.Groups_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#groups_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroups_clause(@NotNull PLSQLParser.Groups_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#is_any_condition}.
	 * @param ctx the parse tree
	 */
	void enterIs_any_condition(@NotNull PLSQLParser.Is_any_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#is_any_condition}.
	 * @param ctx the parse tree
	 */
	void exitIs_any_condition(@NotNull PLSQLParser.Is_any_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#for_update_clause}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_clause(@NotNull PLSQLParser.For_update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#for_update_clause}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_clause(@NotNull PLSQLParser.For_update_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#tablespace_clauses}.
	 * @param ctx the parse tree
	 */
	void enterTablespace_clauses(@NotNull PLSQLParser.Tablespace_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#tablespace_clauses}.
	 * @param ctx the parse tree
	 */
	void exitTablespace_clauses(@NotNull PLSQLParser.Tablespace_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_previous}.
	 * @param ctx the parse tree
	 */
	void enterFunction_previous(@NotNull PLSQLParser.Function_previousContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_previous}.
	 * @param ctx the parse tree
	 */
	void exitFunction_previous(@NotNull PLSQLParser.Function_previousContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#character_expression}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_expression(@NotNull PLSQLParser.Character_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#character_expression}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_expression(@NotNull PLSQLParser.Character_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_hextoraw}.
	 * @param ctx the parse tree
	 */
	void enterFunction_hextoraw(@NotNull PLSQLParser.Function_hextorawContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_hextoraw}.
	 * @param ctx the parse tree
	 */
	void exitFunction_hextoraw(@NotNull PLSQLParser.Function_hextorawContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sql_comment}.
	 * @param ctx the parse tree
	 */
	void enterSql_comment(@NotNull PLSQLParser.Sql_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sql_comment}.
	 * @param ctx the parse tree
	 */
	void exitSql_comment(@NotNull PLSQLParser.Sql_commentContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#flashback_archive_clause}.
	 * @param ctx the parse tree
	 */
	void enterFlashback_archive_clause(@NotNull PLSQLParser.Flashback_archive_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#flashback_archive_clause}.
	 * @param ctx the parse tree
	 */
	void exitFlashback_archive_clause(@NotNull PLSQLParser.Flashback_archive_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#diskgroup_volume_clauses}.
	 * @param ctx the parse tree
	 */
	void enterDiskgroup_volume_clauses(@NotNull PLSQLParser.Diskgroup_volume_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#diskgroup_volume_clauses}.
	 * @param ctx the parse tree
	 */
	void exitDiskgroup_volume_clauses(@NotNull PLSQLParser.Diskgroup_volume_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#fully_qualified_file_name}.
	 * @param ctx the parse tree
	 */
	void enterFully_qualified_file_name(@NotNull PLSQLParser.Fully_qualified_file_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#fully_qualified_file_name}.
	 * @param ctx the parse tree
	 */
	void exitFully_qualified_file_name(@NotNull PLSQLParser.Fully_qualified_file_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#supplemental_table_logging}.
	 * @param ctx the parse tree
	 */
	void enterSupplemental_table_logging(@NotNull PLSQLParser.Supplemental_table_loggingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#supplemental_table_logging}.
	 * @param ctx the parse tree
	 */
	void exitSupplemental_table_logging(@NotNull PLSQLParser.Supplemental_table_loggingContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#subpartition_extended_name}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition_extended_name(@NotNull PLSQLParser.Subpartition_extended_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#subpartition_extended_name}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition_extended_name(@NotNull PLSQLParser.Subpartition_extended_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#datatypes}.
	 * @param ctx the parse tree
	 */
	void enterDatatypes(@NotNull PLSQLParser.DatatypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#datatypes}.
	 * @param ctx the parse tree
	 */
	void exitDatatypes(@NotNull PLSQLParser.DatatypesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#element_spec}.
	 * @param ctx the parse tree
	 */
	void enterElement_spec(@NotNull PLSQLParser.Element_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#element_spec}.
	 * @param ctx the parse tree
	 */
	void exitElement_spec(@NotNull PLSQLParser.Element_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#drop_index_partition}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index_partition(@NotNull PLSQLParser.Drop_index_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#drop_index_partition}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index_partition(@NotNull PLSQLParser.Drop_index_partitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#profile}.
	 * @param ctx the parse tree
	 */
	void enterProfile(@NotNull PLSQLParser.ProfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#profile}.
	 * @param ctx the parse tree
	 */
	void exitProfile(@NotNull PLSQLParser.ProfileContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#pipe_row_statement}.
	 * @param ctx the parse tree
	 */
	void enterPipe_row_statement(@NotNull PLSQLParser.Pipe_row_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#pipe_row_statement}.
	 * @param ctx the parse tree
	 */
	void exitPipe_row_statement(@NotNull PLSQLParser.Pipe_row_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#multiset_condition}.
	 * @param ctx the parse tree
	 */
	void enterMultiset_condition(@NotNull PLSQLParser.Multiset_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#multiset_condition}.
	 * @param ctx the parse tree
	 */
	void exitMultiset_condition(@NotNull PLSQLParser.Multiset_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#modify_lob_storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterModify_lob_storage_clause(@NotNull PLSQLParser.Modify_lob_storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#modify_lob_storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitModify_lob_storage_clause(@NotNull PLSQLParser.Modify_lob_storage_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#referencing_clause}.
	 * @param ctx the parse tree
	 */
	void enterReferencing_clause(@NotNull PLSQLParser.Referencing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#referencing_clause}.
	 * @param ctx the parse tree
	 */
	void exitReferencing_clause(@NotNull PLSQLParser.Referencing_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_percentile_disc}.
	 * @param ctx the parse tree
	 */
	void enterFunction_percentile_disc(@NotNull PLSQLParser.Function_percentile_discContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_percentile_disc}.
	 * @param ctx the parse tree
	 */
	void exitFunction_percentile_disc(@NotNull PLSQLParser.Function_percentile_discContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#io_cost}.
	 * @param ctx the parse tree
	 */
	void enterIo_cost(@NotNull PLSQLParser.Io_costContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#io_cost}.
	 * @param ctx the parse tree
	 */
	void exitIo_cost(@NotNull PLSQLParser.Io_costContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_value}.
	 * @param ctx the parse tree
	 */
	void enterFunction_value(@NotNull PLSQLParser.Function_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_value}.
	 * @param ctx the parse tree
	 */
	void exitFunction_value(@NotNull PLSQLParser.Function_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#mountpath_name}.
	 * @param ctx the parse tree
	 */
	void enterMountpath_name(@NotNull PLSQLParser.Mountpath_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#mountpath_name}.
	 * @param ctx the parse tree
	 */
	void exitMountpath_name(@NotNull PLSQLParser.Mountpath_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_round_number}.
	 * @param ctx the parse tree
	 */
	void enterFunction_round_number(@NotNull PLSQLParser.Function_round_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_round_number}.
	 * @param ctx the parse tree
	 */
	void exitFunction_round_number(@NotNull PLSQLParser.Function_round_numberContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#object_type_value}.
	 * @param ctx the parse tree
	 */
	void enterObject_type_value(@NotNull PLSQLParser.Object_type_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#object_type_value}.
	 * @param ctx the parse tree
	 */
	void exitObject_type_value(@NotNull PLSQLParser.Object_type_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#default_cost_clause}.
	 * @param ctx the parse tree
	 */
	void enterDefault_cost_clause(@NotNull PLSQLParser.Default_cost_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#default_cost_clause}.
	 * @param ctx the parse tree
	 */
	void exitDefault_cost_clause(@NotNull PLSQLParser.Default_cost_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#match_param}.
	 * @param ctx the parse tree
	 */
	void enterMatch_param(@NotNull PLSQLParser.Match_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#match_param}.
	 * @param ctx the parse tree
	 */
	void exitMatch_param(@NotNull PLSQLParser.Match_paramContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_to_clob}.
	 * @param ctx the parse tree
	 */
	void enterFunction_to_clob(@NotNull PLSQLParser.Function_to_clobContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_to_clob}.
	 * @param ctx the parse tree
	 */
	void exitFunction_to_clob(@NotNull PLSQLParser.Function_to_clobContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#move_table_subpartition}.
	 * @param ctx the parse tree
	 */
	void enterMove_table_subpartition(@NotNull PLSQLParser.Move_table_subpartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#move_table_subpartition}.
	 * @param ctx the parse tree
	 */
	void exitMove_table_subpartition(@NotNull PLSQLParser.Move_table_subpartitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_nls_upper}.
	 * @param ctx the parse tree
	 */
	void enterFunction_nls_upper(@NotNull PLSQLParser.Function_nls_upperContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_nls_upper}.
	 * @param ctx the parse tree
	 */
	void exitFunction_nls_upper(@NotNull PLSQLParser.Function_nls_upperContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_xmlroot}.
	 * @param ctx the parse tree
	 */
	void enterFunction_xmlroot(@NotNull PLSQLParser.Function_xmlrootContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_xmlroot}.
	 * @param ctx the parse tree
	 */
	void exitFunction_xmlroot(@NotNull PLSQLParser.Function_xmlrootContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#column_clauses}.
	 * @param ctx the parse tree
	 */
	void enterColumn_clauses(@NotNull PLSQLParser.Column_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#column_clauses}.
	 * @param ctx the parse tree
	 */
	void exitColumn_clauses(@NotNull PLSQLParser.Column_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#rebuild_clause}.
	 * @param ctx the parse tree
	 */
	void enterRebuild_clause(@NotNull PLSQLParser.Rebuild_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#rebuild_clause}.
	 * @param ctx the parse tree
	 */
	void exitRebuild_clause(@NotNull PLSQLParser.Rebuild_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#role_name}.
	 * @param ctx the parse tree
	 */
	void enterRole_name(@NotNull PLSQLParser.Role_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#role_name}.
	 * @param ctx the parse tree
	 */
	void exitRole_name(@NotNull PLSQLParser.Role_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_log}.
	 * @param ctx the parse tree
	 */
	void enterFunction_log(@NotNull PLSQLParser.Function_logContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_log}.
	 * @param ctx the parse tree
	 */
	void exitFunction_log(@NotNull PLSQLParser.Function_logContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#directory_object_name}.
	 * @param ctx the parse tree
	 */
	void enterDirectory_object_name(@NotNull PLSQLParser.Directory_object_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#directory_object_name}.
	 * @param ctx the parse tree
	 */
	void exitDirectory_object_name(@NotNull PLSQLParser.Directory_object_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_empty_clob}.
	 * @param ctx the parse tree
	 */
	void enterFunction_empty_clob(@NotNull PLSQLParser.Function_empty_clobContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_empty_clob}.
	 * @param ctx the parse tree
	 */
	void exitFunction_empty_clob(@NotNull PLSQLParser.Function_empty_clobContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCursor_declaration(@NotNull PLSQLParser.Cursor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCursor_declaration(@NotNull PLSQLParser.Cursor_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#add_volume_clause}.
	 * @param ctx the parse tree
	 */
	void enterAdd_volume_clause(@NotNull PLSQLParser.Add_volume_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#add_volume_clause}.
	 * @param ctx the parse tree
	 */
	void exitAdd_volume_clause(@NotNull PLSQLParser.Add_volume_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_stats_one_way_anova}.
	 * @param ctx the parse tree
	 */
	void enterFunction_stats_one_way_anova(@NotNull PLSQLParser.Function_stats_one_way_anovaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_stats_one_way_anova}.
	 * @param ctx the parse tree
	 */
	void exitFunction_stats_one_way_anova(@NotNull PLSQLParser.Function_stats_one_way_anovaContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_count}.
	 * @param ctx the parse tree
	 */
	void enterFunction_count(@NotNull PLSQLParser.Function_countContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_count}.
	 * @param ctx the parse tree
	 */
	void exitFunction_count(@NotNull PLSQLParser.Function_countContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_xmlserialize}.
	 * @param ctx the parse tree
	 */
	void enterFunction_xmlserialize(@NotNull PLSQLParser.Function_xmlserializeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_xmlserialize}.
	 * @param ctx the parse tree
	 */
	void exitFunction_xmlserialize(@NotNull PLSQLParser.Function_xmlserializeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_ora_dst_error}.
	 * @param ctx the parse tree
	 */
	void enterFunction_ora_dst_error(@NotNull PLSQLParser.Function_ora_dst_errorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_ora_dst_error}.
	 * @param ctx the parse tree
	 */
	void exitFunction_ora_dst_error(@NotNull PLSQLParser.Function_ora_dst_errorContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#logminer_session_name}.
	 * @param ctx the parse tree
	 */
	void enterLogminer_session_name(@NotNull PLSQLParser.Logminer_session_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#logminer_session_name}.
	 * @param ctx the parse tree
	 */
	void exitLogminer_session_name(@NotNull PLSQLParser.Logminer_session_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#grantee_clause}.
	 * @param ctx the parse tree
	 */
	void enterGrantee_clause(@NotNull PLSQLParser.Grantee_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#grantee_clause}.
	 * @param ctx the parse tree
	 */
	void exitGrantee_clause(@NotNull PLSQLParser.Grantee_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_xmlagg}.
	 * @param ctx the parse tree
	 */
	void enterFunction_xmlagg(@NotNull PLSQLParser.Function_xmlaggContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_xmlagg}.
	 * @param ctx the parse tree
	 */
	void exitFunction_xmlagg(@NotNull PLSQLParser.Function_xmlaggContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#constructor_spec}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_spec(@NotNull PLSQLParser.Constructor_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#constructor_spec}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_spec(@NotNull PLSQLParser.Constructor_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_corr_s}.
	 * @param ctx the parse tree
	 */
	void enterFunction_corr_s(@NotNull PLSQLParser.Function_corr_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_corr_s}.
	 * @param ctx the parse tree
	 */
	void exitFunction_corr_s(@NotNull PLSQLParser.Function_corr_sContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#convert_database_clause}.
	 * @param ctx the parse tree
	 */
	void enterConvert_database_clause(@NotNull PLSQLParser.Convert_database_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#convert_database_clause}.
	 * @param ctx the parse tree
	 */
	void exitConvert_database_clause(@NotNull PLSQLParser.Convert_database_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dependent_handling_clause}.
	 * @param ctx the parse tree
	 */
	void enterDependent_handling_clause(@NotNull PLSQLParser.Dependent_handling_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dependent_handling_clause}.
	 * @param ctx the parse tree
	 */
	void exitDependent_handling_clause(@NotNull PLSQLParser.Dependent_handling_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#collection_variable_dec}.
	 * @param ctx the parse tree
	 */
	void enterCollection_variable_dec(@NotNull PLSQLParser.Collection_variable_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#collection_variable_dec}.
	 * @param ctx the parse tree
	 */
	void exitCollection_variable_dec(@NotNull PLSQLParser.Collection_variable_decContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dispatcher_name}.
	 * @param ctx the parse tree
	 */
	void enterDispatcher_name(@NotNull PLSQLParser.Dispatcher_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dispatcher_name}.
	 * @param ctx the parse tree
	 */
	void exitDispatcher_name(@NotNull PLSQLParser.Dispatcher_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_statement(@NotNull PLSQLParser.Sql_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_statement(@NotNull PLSQLParser.Sql_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#procedure_spec}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_spec(@NotNull PLSQLParser.Procedure_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#procedure_spec}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_spec(@NotNull PLSQLParser.Procedure_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_nls_charset_decl_len}.
	 * @param ctx the parse tree
	 */
	void enterFunction_nls_charset_decl_len(@NotNull PLSQLParser.Function_nls_charset_decl_lenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_nls_charset_decl_len}.
	 * @param ctx the parse tree
	 */
	void exitFunction_nls_charset_decl_len(@NotNull PLSQLParser.Function_nls_charset_decl_lenContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#table_partition_description}.
	 * @param ctx the parse tree
	 */
	void enterTable_partition_description(@NotNull PLSQLParser.Table_partition_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#table_partition_description}.
	 * @param ctx the parse tree
	 */
	void exitTable_partition_description(@NotNull PLSQLParser.Table_partition_descriptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sample_percent}.
	 * @param ctx the parse tree
	 */
	void enterSample_percent(@NotNull PLSQLParser.Sample_percentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sample_percent}.
	 * @param ctx the parse tree
	 */
	void exitSample_percent(@NotNull PLSQLParser.Sample_percentContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#index_subpartition_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_subpartition_clause(@NotNull PLSQLParser.Index_subpartition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#index_subpartition_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_subpartition_clause(@NotNull PLSQLParser.Index_subpartition_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#composite_range_partitions}.
	 * @param ctx the parse tree
	 */
	void enterComposite_range_partitions(@NotNull PLSQLParser.Composite_range_partitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#composite_range_partitions}.
	 * @param ctx the parse tree
	 */
	void exitComposite_range_partitions(@NotNull PLSQLParser.Composite_range_partitionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_varray_col_properties}.
	 * @param ctx the parse tree
	 */
	void enterAlter_varray_col_properties(@NotNull PLSQLParser.Alter_varray_col_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_varray_col_properties}.
	 * @param ctx the parse tree
	 */
	void exitAlter_varray_col_properties(@NotNull PLSQLParser.Alter_varray_col_propertiesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#ref_attr}.
	 * @param ctx the parse tree
	 */
	void enterRef_attr(@NotNull PLSQLParser.Ref_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#ref_attr}.
	 * @param ctx the parse tree
	 */
	void exitRef_attr(@NotNull PLSQLParser.Ref_attrContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_corr_k}.
	 * @param ctx the parse tree
	 */
	void enterFunction_corr_k(@NotNull PLSQLParser.Function_corr_kContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_corr_k}.
	 * @param ctx the parse tree
	 */
	void exitFunction_corr_k(@NotNull PLSQLParser.Function_corr_kContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursor_definition}.
	 * @param ctx the parse tree
	 */
	void enterCursor_definition(@NotNull PLSQLParser.Cursor_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursor_definition}.
	 * @param ctx the parse tree
	 */
	void exitCursor_definition(@NotNull PLSQLParser.Cursor_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#lob_partition_storage}.
	 * @param ctx the parse tree
	 */
	void enterLob_partition_storage(@NotNull PLSQLParser.Lob_partition_storageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#lob_partition_storage}.
	 * @param ctx the parse tree
	 */
	void exitLob_partition_storage(@NotNull PLSQLParser.Lob_partition_storageContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#select_into_item}.
	 * @param ctx the parse tree
	 */
	void enterSelect_into_item(@NotNull PLSQLParser.Select_into_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#select_into_item}.
	 * @param ctx the parse tree
	 */
	void exitSelect_into_item(@NotNull PLSQLParser.Select_into_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#add_logfile_clauses}.
	 * @param ctx the parse tree
	 */
	void enterAdd_logfile_clauses(@NotNull PLSQLParser.Add_logfile_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#add_logfile_clauses}.
	 * @param ctx the parse tree
	 */
	void exitAdd_logfile_clauses(@NotNull PLSQLParser.Add_logfile_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#modify_collection_retrieval}.
	 * @param ctx the parse tree
	 */
	void enterModify_collection_retrieval(@NotNull PLSQLParser.Modify_collection_retrievalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#modify_collection_retrieval}.
	 * @param ctx the parse tree
	 */
	void exitModify_collection_retrieval(@NotNull PLSQLParser.Modify_collection_retrievalContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#named_cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void enterNamed_cursor_attribute(@NotNull PLSQLParser.Named_cursor_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#named_cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void exitNamed_cursor_attribute(@NotNull PLSQLParser.Named_cursor_attributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull PLSQLParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull PLSQLParser.StartContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_iteration_number}.
	 * @param ctx the parse tree
	 */
	void enterFunction_iteration_number(@NotNull PLSQLParser.Function_iteration_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_iteration_number}.
	 * @param ctx the parse tree
	 */
	void exitFunction_iteration_number(@NotNull PLSQLParser.Function_iteration_numberContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#supplemental_plsql_clause}.
	 * @param ctx the parse tree
	 */
	void enterSupplemental_plsql_clause(@NotNull PLSQLParser.Supplemental_plsql_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#supplemental_plsql_clause}.
	 * @param ctx the parse tree
	 */
	void exitSupplemental_plsql_clause(@NotNull PLSQLParser.Supplemental_plsql_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#mining_model_name}.
	 * @param ctx the parse tree
	 */
	void enterMining_model_name(@NotNull PLSQLParser.Mining_model_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#mining_model_name}.
	 * @param ctx the parse tree
	 */
	void exitMining_model_name(@NotNull PLSQLParser.Mining_model_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#size_clause}.
	 * @param ctx the parse tree
	 */
	void enterSize_clause(@NotNull PLSQLParser.Size_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#size_clause}.
	 * @param ctx the parse tree
	 */
	void exitSize_clause(@NotNull PLSQLParser.Size_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_to_binary_float}.
	 * @param ctx the parse tree
	 */
	void enterFunction_to_binary_float(@NotNull PLSQLParser.Function_to_binary_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_to_binary_float}.
	 * @param ctx the parse tree
	 */
	void exitFunction_to_binary_float(@NotNull PLSQLParser.Function_to_binary_floatContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xquery_string}.
	 * @param ctx the parse tree
	 */
	void enterXquery_string(@NotNull PLSQLParser.Xquery_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xquery_string}.
	 * @param ctx the parse tree
	 */
	void exitXquery_string(@NotNull PLSQLParser.Xquery_stringContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_association}.
	 * @param ctx the parse tree
	 */
	void enterFunction_association(@NotNull PLSQLParser.Function_associationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_association}.
	 * @param ctx the parse tree
	 */
	void exitFunction_association(@NotNull PLSQLParser.Function_associationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_clause(@NotNull PLSQLParser.Pivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_clause(@NotNull PLSQLParser.Pivot_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#outline}.
	 * @param ctx the parse tree
	 */
	void enterOutline(@NotNull PLSQLParser.OutlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#outline}.
	 * @param ctx the parse tree
	 */
	void exitOutline(@NotNull PLSQLParser.OutlineContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#number_datatypes}.
	 * @param ctx the parse tree
	 */
	void enterNumber_datatypes(@NotNull PLSQLParser.Number_datatypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#number_datatypes}.
	 * @param ctx the parse tree
	 */
	void exitNumber_datatypes(@NotNull PLSQLParser.Number_datatypesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#pikey_clause}.
	 * @param ctx the parse tree
	 */
	void enterPikey_clause(@NotNull PLSQLParser.Pikey_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#pikey_clause}.
	 * @param ctx the parse tree
	 */
	void exitPikey_clause(@NotNull PLSQLParser.Pikey_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#binding_clause}.
	 * @param ctx the parse tree
	 */
	void enterBinding_clause(@NotNull PLSQLParser.Binding_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#binding_clause}.
	 * @param ctx the parse tree
	 */
	void exitBinding_clause(@NotNull PLSQLParser.Binding_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#create_package_body}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_body(@NotNull PLSQLParser.Create_package_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#create_package_body}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_body(@NotNull PLSQLParser.Create_package_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_power}.
	 * @param ctx the parse tree
	 */
	void enterFunction_power(@NotNull PLSQLParser.Function_powerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_power}.
	 * @param ctx the parse tree
	 */
	void exitFunction_power(@NotNull PLSQLParser.Function_powerContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#modify_volume_clause}.
	 * @param ctx the parse tree
	 */
	void enterModify_volume_clause(@NotNull PLSQLParser.Modify_volume_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#modify_volume_clause}.
	 * @param ctx the parse tree
	 */
	void exitModify_volume_clause(@NotNull PLSQLParser.Modify_volume_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#max_bucket}.
	 * @param ctx the parse tree
	 */
	void enterMax_bucket(@NotNull PLSQLParser.Max_bucketContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#max_bucket}.
	 * @param ctx the parse tree
	 */
	void exitMax_bucket(@NotNull PLSQLParser.Max_bucketContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#basic_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterBasic_loop_statement(@NotNull PLSQLParser.Basic_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#basic_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitBasic_loop_statement(@NotNull PLSQLParser.Basic_loop_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#user_function}.
	 * @param ctx the parse tree
	 */
	void enterUser_function(@NotNull PLSQLParser.User_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#user_function}.
	 * @param ctx the parse tree
	 */
	void exitUser_function(@NotNull PLSQLParser.User_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#instance_clauses}.
	 * @param ctx the parse tree
	 */
	void enterInstance_clauses(@NotNull PLSQLParser.Instance_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#instance_clauses}.
	 * @param ctx the parse tree
	 */
	void exitInstance_clauses(@NotNull PLSQLParser.Instance_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursor_expression}.
	 * @param ctx the parse tree
	 */
	void enterCursor_expression(@NotNull PLSQLParser.Cursor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursor_expression}.
	 * @param ctx the parse tree
	 */
	void exitCursor_expression(@NotNull PLSQLParser.Cursor_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#security_clauses}.
	 * @param ctx the parse tree
	 */
	void enterSecurity_clauses(@NotNull PLSQLParser.Security_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#security_clauses}.
	 * @param ctx the parse tree
	 */
	void exitSecurity_clauses(@NotNull PLSQLParser.Security_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#replace_string}.
	 * @param ctx the parse tree
	 */
	void enterReplace_string(@NotNull PLSQLParser.Replace_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#replace_string}.
	 * @param ctx the parse tree
	 */
	void exitReplace_string(@NotNull PLSQLParser.Replace_stringContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#placeholder}.
	 * @param ctx the parse tree
	 */
	void enterPlaceholder(@NotNull PLSQLParser.PlaceholderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#placeholder}.
	 * @param ctx the parse tree
	 */
	void exitPlaceholder(@NotNull PLSQLParser.PlaceholderContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sqlerrm_function}.
	 * @param ctx the parse tree
	 */
	void enterSqlerrm_function(@NotNull PLSQLParser.Sqlerrm_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sqlerrm_function}.
	 * @param ctx the parse tree
	 */
	void exitSqlerrm_function(@NotNull PLSQLParser.Sqlerrm_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#start_standby_clause}.
	 * @param ctx the parse tree
	 */
	void enterStart_standby_clause(@NotNull PLSQLParser.Start_standby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#start_standby_clause}.
	 * @param ctx the parse tree
	 */
	void exitStart_standby_clause(@NotNull PLSQLParser.Start_standby_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#child_key_column}.
	 * @param ctx the parse tree
	 */
	void enterChild_key_column(@NotNull PLSQLParser.Child_key_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#child_key_column}.
	 * @param ctx the parse tree
	 */
	void exitChild_key_column(@NotNull PLSQLParser.Child_key_columnContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_to_nclob}.
	 * @param ctx the parse tree
	 */
	void enterFunction_to_nclob(@NotNull PLSQLParser.Function_to_nclobContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_to_nclob}.
	 * @param ctx the parse tree
	 */
	void exitFunction_to_nclob(@NotNull PLSQLParser.Function_to_nclobContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#select_all}.
	 * @param ctx the parse tree
	 */
	void enterSelect_all(@NotNull PLSQLParser.Select_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#select_all}.
	 * @param ctx the parse tree
	 */
	void exitSelect_all(@NotNull PLSQLParser.Select_allContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#subprogram_spec}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_spec(@NotNull PLSQLParser.Subprogram_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#subprogram_spec}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_spec(@NotNull PLSQLParser.Subprogram_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#spfile_name}.
	 * @param ctx the parse tree
	 */
	void enterSpfile_name(@NotNull PLSQLParser.Spfile_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#spfile_name}.
	 * @param ctx the parse tree
	 */
	void exitSpfile_name(@NotNull PLSQLParser.Spfile_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#default_temp_tablespace}.
	 * @param ctx the parse tree
	 */
	void enterDefault_temp_tablespace(@NotNull PLSQLParser.Default_temp_tablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#default_temp_tablespace}.
	 * @param ctx the parse tree
	 */
	void exitDefault_temp_tablespace(@NotNull PLSQLParser.Default_temp_tablespaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_rowidtochar}.
	 * @param ctx the parse tree
	 */
	void enterFunction_rowidtochar(@NotNull PLSQLParser.Function_rowidtocharContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_rowidtochar}.
	 * @param ctx the parse tree
	 */
	void exitFunction_rowidtochar(@NotNull PLSQLParser.Function_rowidtocharContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void enterExit_statement(@NotNull PLSQLParser.Exit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void exitExit_statement(@NotNull PLSQLParser.Exit_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#database_object_or_part}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_object_or_part(@NotNull PLSQLParser.Database_object_or_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#database_object_or_part}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_object_or_part(@NotNull PLSQLParser.Database_object_or_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#substitutable_column_clause}.
	 * @param ctx the parse tree
	 */
	void enterSubstitutable_column_clause(@NotNull PLSQLParser.Substitutable_column_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#substitutable_column_clause}.
	 * @param ctx the parse tree
	 */
	void exitSubstitutable_column_clause(@NotNull PLSQLParser.Substitutable_column_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#agent_dblink}.
	 * @param ctx the parse tree
	 */
	void enterAgent_dblink(@NotNull PLSQLParser.Agent_dblinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#agent_dblink}.
	 * @param ctx the parse tree
	 */
	void exitAgent_dblink(@NotNull PLSQLParser.Agent_dblinkContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#hierarchy_clause}.
	 * @param ctx the parse tree
	 */
	void enterHierarchy_clause(@NotNull PLSQLParser.Hierarchy_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#hierarchy_clause}.
	 * @param ctx the parse tree
	 */
	void exitHierarchy_clause(@NotNull PLSQLParser.Hierarchy_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#add_hash_partition_clause}.
	 * @param ctx the parse tree
	 */
	void enterAdd_hash_partition_clause(@NotNull PLSQLParser.Add_hash_partition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#add_hash_partition_clause}.
	 * @param ctx the parse tree
	 */
	void exitAdd_hash_partition_clause(@NotNull PLSQLParser.Add_hash_partition_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_datafile_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_datafile_clause(@NotNull PLSQLParser.Alter_datafile_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_datafile_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_datafile_clause(@NotNull PLSQLParser.Alter_datafile_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(@NotNull PLSQLParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(@NotNull PLSQLParser.NamespaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull PLSQLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull PLSQLParser.FunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#tablespace}.
	 * @param ctx the parse tree
	 */
	void enterTablespace(@NotNull PLSQLParser.TablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#tablespace}.
	 * @param ctx the parse tree
	 */
	void exitTablespace(@NotNull PLSQLParser.TablespaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#interval_types}.
	 * @param ctx the parse tree
	 */
	void enterInterval_types(@NotNull PLSQLParser.Interval_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#interval_types}.
	 * @param ctx the parse tree
	 */
	void exitInterval_types(@NotNull PLSQLParser.Interval_typesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#new_alias_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_alias_name(@NotNull PLSQLParser.New_alias_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#new_alias_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_alias_name(@NotNull PLSQLParser.New_alias_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_convert}.
	 * @param ctx the parse tree
	 */
	void enterFunction_convert(@NotNull PLSQLParser.Function_convertContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_convert}.
	 * @param ctx the parse tree
	 */
	void exitFunction_convert(@NotNull PLSQLParser.Function_convertContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void enterType_definition(@NotNull PLSQLParser.Type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void exitType_definition(@NotNull PLSQLParser.Type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause(@NotNull PLSQLParser.Into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause(@NotNull PLSQLParser.Into_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#character_datatypes}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_datatypes(@NotNull PLSQLParser.Character_datatypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#character_datatypes}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_datatypes(@NotNull PLSQLParser.Character_datatypesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#explicit_cursor}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_cursor(@NotNull PLSQLParser.Explicit_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#explicit_cursor}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_cursor(@NotNull PLSQLParser.Explicit_cursorContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_iot_clauses}.
	 * @param ctx the parse tree
	 */
	void enterAlter_iot_clauses(@NotNull PLSQLParser.Alter_iot_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_iot_clauses}.
	 * @param ctx the parse tree
	 */
	void exitAlter_iot_clauses(@NotNull PLSQLParser.Alter_iot_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#object_view_clause}.
	 * @param ctx the parse tree
	 */
	void enterObject_view_clause(@NotNull PLSQLParser.Object_view_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#object_view_clause}.
	 * @param ctx the parse tree
	 */
	void exitObject_view_clause(@NotNull PLSQLParser.Object_view_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#drop_column_clause}.
	 * @param ctx the parse tree
	 */
	void enterDrop_column_clause(@NotNull PLSQLParser.Drop_column_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#drop_column_clause}.
	 * @param ctx the parse tree
	 */
	void exitDrop_column_clause(@NotNull PLSQLParser.Drop_column_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#trigger_compile_clause}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_compile_clause(@NotNull PLSQLParser.Trigger_compile_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#trigger_compile_clause}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_compile_clause(@NotNull PLSQLParser.Trigger_compile_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_bfilename}.
	 * @param ctx the parse tree
	 */
	void enterFunction_bfilename(@NotNull PLSQLParser.Function_bfilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_bfilename}.
	 * @param ctx the parse tree
	 */
	void exitFunction_bfilename(@NotNull PLSQLParser.Function_bfilenameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#floating_point_condition}.
	 * @param ctx the parse tree
	 */
	void enterFloating_point_condition(@NotNull PLSQLParser.Floating_point_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#floating_point_condition}.
	 * @param ctx the parse tree
	 */
	void exitFloating_point_condition(@NotNull PLSQLParser.Floating_point_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#partition_id}.
	 * @param ctx the parse tree
	 */
	void enterPartition_id(@NotNull PLSQLParser.Partition_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#partition_id}.
	 * @param ctx the parse tree
	 */
	void exitPartition_id(@NotNull PLSQLParser.Partition_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alias_file_name}.
	 * @param ctx the parse tree
	 */
	void enterAlias_file_name(@NotNull PLSQLParser.Alias_file_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alias_file_name}.
	 * @param ctx the parse tree
	 */
	void exitAlias_file_name(@NotNull PLSQLParser.Alias_file_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_extract}.
	 * @param ctx the parse tree
	 */
	void enterFunction_extract(@NotNull PLSQLParser.Function_extractContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_extract}.
	 * @param ctx the parse tree
	 */
	void exitFunction_extract(@NotNull PLSQLParser.Function_extractContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#source_char_set}.
	 * @param ctx the parse tree
	 */
	void enterSource_char_set(@NotNull PLSQLParser.Source_char_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#source_char_set}.
	 * @param ctx the parse tree
	 */
	void exitSource_char_set(@NotNull PLSQLParser.Source_char_setContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#split_table_partition}.
	 * @param ctx the parse tree
	 */
	void enterSplit_table_partition(@NotNull PLSQLParser.Split_table_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#split_table_partition}.
	 * @param ctx the parse tree
	 */
	void exitSplit_table_partition(@NotNull PLSQLParser.Split_table_partitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_cume_dist_aggregate}.
	 * @param ctx the parse tree
	 */
	void enterFunction_cume_dist_aggregate(@NotNull PLSQLParser.Function_cume_dist_aggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_cume_dist_aggregate}.
	 * @param ctx the parse tree
	 */
	void exitFunction_cume_dist_aggregate(@NotNull PLSQLParser.Function_cume_dist_aggregateContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#library_name}.
	 * @param ctx the parse tree
	 */
	void enterLibrary_name(@NotNull PLSQLParser.Library_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#library_name}.
	 * @param ctx the parse tree
	 */
	void exitLibrary_name(@NotNull PLSQLParser.Library_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#open_for_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_for_statement(@NotNull PLSQLParser.Open_for_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#open_for_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_for_statement(@NotNull PLSQLParser.Open_for_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#diskgroup_name}.
	 * @param ctx the parse tree
	 */
	void enterDiskgroup_name(@NotNull PLSQLParser.Diskgroup_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#diskgroup_name}.
	 * @param ctx the parse tree
	 */
	void exitDiskgroup_name(@NotNull PLSQLParser.Diskgroup_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_remainder}.
	 * @param ctx the parse tree
	 */
	void enterFunction_remainder(@NotNull PLSQLParser.Function_remainderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_remainder}.
	 * @param ctx the parse tree
	 */
	void exitFunction_remainder(@NotNull PLSQLParser.Function_remainderContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#execute_immediate_statement}.
	 * @param ctx the parse tree
	 */
	void enterExecute_immediate_statement(@NotNull PLSQLParser.Execute_immediate_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#execute_immediate_statement}.
	 * @param ctx the parse tree
	 */
	void exitExecute_immediate_statement(@NotNull PLSQLParser.Execute_immediate_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_name(@NotNull PLSQLParser.Procedure_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_name(@NotNull PLSQLParser.Procedure_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#switch_logfile_clause}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_logfile_clause(@NotNull PLSQLParser.Switch_logfile_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#switch_logfile_clause}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_logfile_clause(@NotNull PLSQLParser.Switch_logfile_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#external_data_properties}.
	 * @param ctx the parse tree
	 */
	void enterExternal_data_properties(@NotNull PLSQLParser.External_data_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#external_data_properties}.
	 * @param ctx the parse tree
	 */
	void exitExternal_data_properties(@NotNull PLSQLParser.External_data_propertiesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#system_privilege}.
	 * @param ctx the parse tree
	 */
	void enterSystem_privilege(@NotNull PLSQLParser.System_privilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#system_privilege}.
	 * @param ctx the parse tree
	 */
	void exitSystem_privilege(@NotNull PLSQLParser.System_privilegeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#partition_name}.
	 * @param ctx the parse tree
	 */
	void enterPartition_name(@NotNull PLSQLParser.Partition_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#partition_name}.
	 * @param ctx the parse tree
	 */
	void exitPartition_name(@NotNull PLSQLParser.Partition_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(@NotNull PLSQLParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(@NotNull PLSQLParser.String_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#compile_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterCompile_type_clause(@NotNull PLSQLParser.Compile_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#compile_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitCompile_type_clause(@NotNull PLSQLParser.Compile_type_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#parent_edition}.
	 * @param ctx the parse tree
	 */
	void enterParent_edition(@NotNull PLSQLParser.Parent_editionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#parent_edition}.
	 * @param ctx the parse tree
	 */
	void exitParent_edition(@NotNull PLSQLParser.Parent_editionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dml_event_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_event_clause(@NotNull PLSQLParser.Dml_event_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dml_event_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_event_clause(@NotNull PLSQLParser.Dml_event_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#model_column_clauses}.
	 * @param ctx the parse tree
	 */
	void enterModel_column_clauses(@NotNull PLSQLParser.Model_column_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#model_column_clauses}.
	 * @param ctx the parse tree
	 */
	void exitModel_column_clauses(@NotNull PLSQLParser.Model_column_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#call_spec}.
	 * @param ctx the parse tree
	 */
	void enterCall_spec(@NotNull PLSQLParser.Call_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#call_spec}.
	 * @param ctx the parse tree
	 */
	void exitCall_spec(@NotNull PLSQLParser.Call_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#comparison_condition}.
	 * @param ctx the parse tree
	 */
	void enterComparison_condition(@NotNull PLSQLParser.Comparison_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#comparison_condition}.
	 * @param ctx the parse tree
	 */
	void exitComparison_condition(@NotNull PLSQLParser.Comparison_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#access_driver_type}.
	 * @param ctx the parse tree
	 */
	void enterAccess_driver_type(@NotNull PLSQLParser.Access_driver_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#access_driver_type}.
	 * @param ctx the parse tree
	 */
	void exitAccess_driver_type(@NotNull PLSQLParser.Access_driver_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#oracle_constraint}.
	 * @param ctx the parse tree
	 */
	void enterOracle_constraint(@NotNull PLSQLParser.Oracle_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#oracle_constraint}.
	 * @param ctx the parse tree
	 */
	void exitOracle_constraint(@NotNull PLSQLParser.Oracle_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#disk_name}.
	 * @param ctx the parse tree
	 */
	void enterDisk_name(@NotNull PLSQLParser.Disk_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#disk_name}.
	 * @param ctx the parse tree
	 */
	void exitDisk_name(@NotNull PLSQLParser.Disk_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull PLSQLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull PLSQLParser.AttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_covar_samp}.
	 * @param ctx the parse tree
	 */
	void enterFunction_covar_samp(@NotNull PLSQLParser.Function_covar_sampContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_covar_samp}.
	 * @param ctx the parse tree
	 */
	void exitFunction_covar_samp(@NotNull PLSQLParser.Function_covar_sampContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#bounds_clause}.
	 * @param ctx the parse tree
	 */
	void enterBounds_clause(@NotNull PLSQLParser.Bounds_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#bounds_clause}.
	 * @param ctx the parse tree
	 */
	void exitBounds_clause(@NotNull PLSQLParser.Bounds_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_nlssort}.
	 * @param ctx the parse tree
	 */
	void enterFunction_nlssort(@NotNull PLSQLParser.Function_nlssortContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_nlssort}.
	 * @param ctx the parse tree
	 */
	void exitFunction_nlssort(@NotNull PLSQLParser.Function_nlssortContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#hash_partitions}.
	 * @param ctx the parse tree
	 */
	void enterHash_partitions(@NotNull PLSQLParser.Hash_partitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#hash_partitions}.
	 * @param ctx the parse tree
	 */
	void exitHash_partitions(@NotNull PLSQLParser.Hash_partitionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#attribute_clause}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_clause(@NotNull PLSQLParser.Attribute_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#attribute_clause}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_clause(@NotNull PLSQLParser.Attribute_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#usage_name}.
	 * @param ctx the parse tree
	 */
	void enterUsage_name(@NotNull PLSQLParser.Usage_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#usage_name}.
	 * @param ctx the parse tree
	 */
	void exitUsage_name(@NotNull PLSQLParser.Usage_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#add_hash_subpartition}.
	 * @param ctx the parse tree
	 */
	void enterAdd_hash_subpartition(@NotNull PLSQLParser.Add_hash_subpartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#add_hash_subpartition}.
	 * @param ctx the parse tree
	 */
	void exitAdd_hash_subpartition(@NotNull PLSQLParser.Add_hash_subpartitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#qualified_disk_clause}.
	 * @param ctx the parse tree
	 */
	void enterQualified_disk_clause(@NotNull PLSQLParser.Qualified_disk_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#qualified_disk_clause}.
	 * @param ctx the parse tree
	 */
	void exitQualified_disk_clause(@NotNull PLSQLParser.Qualified_disk_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#encryption_spec}.
	 * @param ctx the parse tree
	 */
	void enterEncryption_spec(@NotNull PLSQLParser.Encryption_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#encryption_spec}.
	 * @param ctx the parse tree
	 */
	void exitEncryption_spec(@NotNull PLSQLParser.Encryption_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#partition_attributes}.
	 * @param ctx the parse tree
	 */
	void enterPartition_attributes(@NotNull PLSQLParser.Partition_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#partition_attributes}.
	 * @param ctx the parse tree
	 */
	void exitPartition_attributes(@NotNull PLSQLParser.Partition_attributesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#binary_types}.
	 * @param ctx the parse tree
	 */
	void enterBinary_types(@NotNull PLSQLParser.Binary_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#binary_types}.
	 * @param ctx the parse tree
	 */
	void exitBinary_types(@NotNull PLSQLParser.Binary_typesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#add_hash_index_partition}.
	 * @param ctx the parse tree
	 */
	void enterAdd_hash_index_partition(@NotNull PLSQLParser.Add_hash_index_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#add_hash_index_partition}.
	 * @param ctx the parse tree
	 */
	void exitAdd_hash_index_partition(@NotNull PLSQLParser.Add_hash_index_partitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#negative_number}.
	 * @param ctx the parse tree
	 */
	void enterNegative_number(@NotNull PLSQLParser.Negative_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#negative_number}.
	 * @param ctx the parse tree
	 */
	void exitNegative_number(@NotNull PLSQLParser.Negative_numberContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#key_compression}.
	 * @param ctx the parse tree
	 */
	void enterKey_compression(@NotNull PLSQLParser.Key_compressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#key_compression}.
	 * @param ctx the parse tree
	 */
	void exitKey_compression(@NotNull PLSQLParser.Key_compressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_round}.
	 * @param ctx the parse tree
	 */
	void enterFunction_round(@NotNull PLSQLParser.Function_roundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_round}.
	 * @param ctx the parse tree
	 */
	void exitFunction_round(@NotNull PLSQLParser.Function_roundContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#add_column_clause}.
	 * @param ctx the parse tree
	 */
	void enterAdd_column_clause(@NotNull PLSQLParser.Add_column_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#add_column_clause}.
	 * @param ctx the parse tree
	 */
	void exitAdd_column_clause(@NotNull PLSQLParser.Add_column_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_dbtimezone}.
	 * @param ctx the parse tree
	 */
	void enterFunction_dbtimezone(@NotNull PLSQLParser.Function_dbtimezoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_dbtimezone}.
	 * @param ctx the parse tree
	 */
	void exitFunction_dbtimezone(@NotNull PLSQLParser.Function_dbtimezoneContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#usergroup_clauses}.
	 * @param ctx the parse tree
	 */
	void enterUsergroup_clauses(@NotNull PLSQLParser.Usergroup_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#usergroup_clauses}.
	 * @param ctx the parse tree
	 */
	void exitUsergroup_clauses(@NotNull PLSQLParser.Usergroup_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#add_system_partition_clause}.
	 * @param ctx the parse tree
	 */
	void enterAdd_system_partition_clause(@NotNull PLSQLParser.Add_system_partition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#add_system_partition_clause}.
	 * @param ctx the parse tree
	 */
	void exitAdd_system_partition_clause(@NotNull PLSQLParser.Add_system_partition_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xmlindex_xmltable_clause}.
	 * @param ctx the parse tree
	 */
	void enterXmlindex_xmltable_clause(@NotNull PLSQLParser.Xmlindex_xmltable_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xmlindex_xmltable_clause}.
	 * @param ctx the parse tree
	 */
	void exitXmlindex_xmltable_clause(@NotNull PLSQLParser.Xmlindex_xmltable_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#datafile_tempfile_clauses}.
	 * @param ctx the parse tree
	 */
	void enterDatafile_tempfile_clauses(@NotNull PLSQLParser.Datafile_tempfile_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#datafile_tempfile_clauses}.
	 * @param ctx the parse tree
	 */
	void exitDatafile_tempfile_clauses(@NotNull PLSQLParser.Datafile_tempfile_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#other_boolean_form}.
	 * @param ctx the parse tree
	 */
	void enterOther_boolean_form(@NotNull PLSQLParser.Other_boolean_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#other_boolean_form}.
	 * @param ctx the parse tree
	 */
	void exitOther_boolean_form(@NotNull PLSQLParser.Other_boolean_formContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_cluster_id}.
	 * @param ctx the parse tree
	 */
	void enterFunction_cluster_id(@NotNull PLSQLParser.Function_cluster_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_cluster_id}.
	 * @param ctx the parse tree
	 */
	void exitFunction_cluster_id(@NotNull PLSQLParser.Function_cluster_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xml_function}.
	 * @param ctx the parse tree
	 */
	void enterXml_function(@NotNull PLSQLParser.Xml_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xml_function}.
	 * @param ctx the parse tree
	 */
	void exitXml_function(@NotNull PLSQLParser.Xml_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(@NotNull PLSQLParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(@NotNull PLSQLParser.Join_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#partition_spec}.
	 * @param ctx the parse tree
	 */
	void enterPartition_spec(@NotNull PLSQLParser.Partition_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#partition_spec}.
	 * @param ctx the parse tree
	 */
	void exitPartition_spec(@NotNull PLSQLParser.Partition_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xml_condition}.
	 * @param ctx the parse tree
	 */
	void enterXml_condition(@NotNull PLSQLParser.Xml_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xml_condition}.
	 * @param ctx the parse tree
	 */
	void exitXml_condition(@NotNull PLSQLParser.Xml_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#file_permissions_clause}.
	 * @param ctx the parse tree
	 */
	void enterFile_permissions_clause(@NotNull PLSQLParser.File_permissions_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#file_permissions_clause}.
	 * @param ctx the parse tree
	 */
	void exitFile_permissions_clause(@NotNull PLSQLParser.File_permissions_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#startup_clauses}.
	 * @param ctx the parse tree
	 */
	void enterStartup_clauses(@NotNull PLSQLParser.Startup_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#startup_clauses}.
	 * @param ctx the parse tree
	 */
	void exitStartup_clauses(@NotNull PLSQLParser.Startup_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#user}.
	 * @param ctx the parse tree
	 */
	void enterUser(@NotNull PLSQLParser.UserContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#user}.
	 * @param ctx the parse tree
	 */
	void exitUser(@NotNull PLSQLParser.UserContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_least}.
	 * @param ctx the parse tree
	 */
	void enterFunction_least(@NotNull PLSQLParser.Function_leastContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_least}.
	 * @param ctx the parse tree
	 */
	void exitFunction_least(@NotNull PLSQLParser.Function_leastContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#type_constructor_expression}.
	 * @param ctx the parse tree
	 */
	void enterType_constructor_expression(@NotNull PLSQLParser.Type_constructor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#type_constructor_expression}.
	 * @param ctx the parse tree
	 */
	void exitType_constructor_expression(@NotNull PLSQLParser.Type_constructor_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_to_nchar}.
	 * @param ctx the parse tree
	 */
	void enterFunction_to_nchar(@NotNull PLSQLParser.Function_to_ncharContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_to_nchar}.
	 * @param ctx the parse tree
	 */
	void exitFunction_to_nchar(@NotNull PLSQLParser.Function_to_ncharContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void enterFetch_statement(@NotNull PLSQLParser.Fetch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void exitFetch_statement(@NotNull PLSQLParser.Fetch_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#undrop_disk_clause}.
	 * @param ctx the parse tree
	 */
	void enterUndrop_disk_clause(@NotNull PLSQLParser.Undrop_disk_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#undrop_disk_clause}.
	 * @param ctx the parse tree
	 */
	void exitUndrop_disk_clause(@NotNull PLSQLParser.Undrop_disk_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_insertchildxmlafter}.
	 * @param ctx the parse tree
	 */
	void enterFunction_insertchildxmlafter(@NotNull PLSQLParser.Function_insertchildxmlafterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_insertchildxmlafter}.
	 * @param ctx the parse tree
	 */
	void exitFunction_insertchildxmlafter(@NotNull PLSQLParser.Function_insertchildxmlafterContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#ref_col}.
	 * @param ctx the parse tree
	 */
	void enterRef_col(@NotNull PLSQLParser.Ref_colContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#ref_col}.
	 * @param ctx the parse tree
	 */
	void exitRef_col(@NotNull PLSQLParser.Ref_colContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#query_block}.
	 * @param ctx the parse tree
	 */
	void enterQuery_block(@NotNull PLSQLParser.Query_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#query_block}.
	 * @param ctx the parse tree
	 */
	void exitQuery_block(@NotNull PLSQLParser.Query_blockContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#lob_item}.
	 * @param ctx the parse tree
	 */
	void enterLob_item(@NotNull PLSQLParser.Lob_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#lob_item}.
	 * @param ctx the parse tree
	 */
	void exitLob_item(@NotNull PLSQLParser.Lob_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#plsql_trigger_source}.
	 * @param ctx the parse tree
	 */
	void enterPlsql_trigger_source(@NotNull PLSQLParser.Plsql_trigger_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#plsql_trigger_source}.
	 * @param ctx the parse tree
	 */
	void exitPlsql_trigger_source(@NotNull PLSQLParser.Plsql_trigger_sourceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_cluster_set}.
	 * @param ctx the parse tree
	 */
	void enterFunction_cluster_set(@NotNull PLSQLParser.Function_cluster_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_cluster_set}.
	 * @param ctx the parse tree
	 */
	void exitFunction_cluster_set(@NotNull PLSQLParser.Function_cluster_setContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#logfile_clauses}.
	 * @param ctx the parse tree
	 */
	void enterLogfile_clauses(@NotNull PLSQLParser.Logfile_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#logfile_clauses}.
	 * @param ctx the parse tree
	 */
	void exitLogfile_clauses(@NotNull PLSQLParser.Logfile_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#password_parameters}.
	 * @param ctx the parse tree
	 */
	void enterPassword_parameters(@NotNull PLSQLParser.Password_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#password_parameters}.
	 * @param ctx the parse tree
	 */
	void exitPassword_parameters(@NotNull PLSQLParser.Password_parametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_cluster_probability}.
	 * @param ctx the parse tree
	 */
	void enterFunction_cluster_probability(@NotNull PLSQLParser.Function_cluster_probabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_cluster_probability}.
	 * @param ctx the parse tree
	 */
	void exitFunction_cluster_probability(@NotNull PLSQLParser.Function_cluster_probabilityContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#network_cost}.
	 * @param ctx the parse tree
	 */
	void enterNetwork_cost(@NotNull PLSQLParser.Network_costContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#network_cost}.
	 * @param ctx the parse tree
	 */
	void exitNetwork_cost(@NotNull PLSQLParser.Network_costContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#numeric_type}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_type(@NotNull PLSQLParser.Numeric_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#numeric_type}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_type(@NotNull PLSQLParser.Numeric_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#search}.
	 * @param ctx the parse tree
	 */
	void enterSearch(@NotNull PLSQLParser.SearchContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#search}.
	 * @param ctx the parse tree
	 */
	void exitSearch(@NotNull PLSQLParser.SearchContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#temporary_tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void enterTemporary_tablespace_clause(@NotNull PLSQLParser.Temporary_tablespace_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#temporary_tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void exitTemporary_tablespace_clause(@NotNull PLSQLParser.Temporary_tablespace_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#check_datafiles_clause}.
	 * @param ctx the parse tree
	 */
	void enterCheck_datafiles_clause(@NotNull PLSQLParser.Check_datafiles_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#check_datafiles_clause}.
	 * @param ctx the parse tree
	 */
	void exitCheck_datafiles_clause(@NotNull PLSQLParser.Check_datafiles_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#return_clause}.
	 * @param ctx the parse tree
	 */
	void enterReturn_clause(@NotNull PLSQLParser.Return_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#return_clause}.
	 * @param ctx the parse tree
	 */
	void exitReturn_clause(@NotNull PLSQLParser.Return_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#media_types}.
	 * @param ctx the parse tree
	 */
	void enterMedia_types(@NotNull PLSQLParser.Media_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#media_types}.
	 * @param ctx the parse tree
	 */
	void exitMedia_types(@NotNull PLSQLParser.Media_typesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_userenv}.
	 * @param ctx the parse tree
	 */
	void enterFunction_userenv(@NotNull PLSQLParser.Function_userenvContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_userenv}.
	 * @param ctx the parse tree
	 */
	void exitFunction_userenv(@NotNull PLSQLParser.Function_userenvContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#main_model_name}.
	 * @param ctx the parse tree
	 */
	void enterMain_model_name(@NotNull PLSQLParser.Main_model_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#main_model_name}.
	 * @param ctx the parse tree
	 */
	void exitMain_model_name(@NotNull PLSQLParser.Main_model_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#assoc_array_type_def}.
	 * @param ctx the parse tree
	 */
	void enterAssoc_array_type_def(@NotNull PLSQLParser.Assoc_array_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#assoc_array_type_def}.
	 * @param ctx the parse tree
	 */
	void exitAssoc_array_type_def(@NotNull PLSQLParser.Assoc_array_type_defContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#activate_standby_db_clause}.
	 * @param ctx the parse tree
	 */
	void enterActivate_standby_db_clause(@NotNull PLSQLParser.Activate_standby_db_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#activate_standby_db_clause}.
	 * @param ctx the parse tree
	 */
	void exitActivate_standby_db_clause(@NotNull PLSQLParser.Activate_standby_db_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#value_clause}.
	 * @param ctx the parse tree
	 */
	void enterValue_clause(@NotNull PLSQLParser.Value_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#value_clause}.
	 * @param ctx the parse tree
	 */
	void exitValue_clause(@NotNull PLSQLParser.Value_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#savepoint}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint(@NotNull PLSQLParser.SavepointContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#savepoint}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint(@NotNull PLSQLParser.SavepointContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#create_mv_refresh}.
	 * @param ctx the parse tree
	 */
	void enterCreate_mv_refresh(@NotNull PLSQLParser.Create_mv_refreshContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#create_mv_refresh}.
	 * @param ctx the parse tree
	 */
	void exitCreate_mv_refresh(@NotNull PLSQLParser.Create_mv_refreshContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cpu_cost}.
	 * @param ctx the parse tree
	 */
	void enterCpu_cost(@NotNull PLSQLParser.Cpu_costContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cpu_cost}.
	 * @param ctx the parse tree
	 */
	void exitCpu_cost(@NotNull PLSQLParser.Cpu_costContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull PLSQLParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull PLSQLParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#collection_constructor}.
	 * @param ctx the parse tree
	 */
	void enterCollection_constructor(@NotNull PLSQLParser.Collection_constructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#collection_constructor}.
	 * @param ctx the parse tree
	 */
	void exitCollection_constructor(@NotNull PLSQLParser.Collection_constructorContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#java_declaration}.
	 * @param ctx the parse tree
	 */
	void enterJava_declaration(@NotNull PLSQLParser.Java_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#java_declaration}.
	 * @param ctx the parse tree
	 */
	void exitJava_declaration(@NotNull PLSQLParser.Java_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#attribute_value}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_value(@NotNull PLSQLParser.Attribute_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#attribute_value}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_value(@NotNull PLSQLParser.Attribute_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#composite_hash_partitions}.
	 * @param ctx the parse tree
	 */
	void enterComposite_hash_partitions(@NotNull PLSQLParser.Composite_hash_partitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#composite_hash_partitions}.
	 * @param ctx the parse tree
	 */
	void exitComposite_hash_partitions(@NotNull PLSQLParser.Composite_hash_partitionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#column_expression}.
	 * @param ctx the parse tree
	 */
	void enterColumn_expression(@NotNull PLSQLParser.Column_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#column_expression}.
	 * @param ctx the parse tree
	 */
	void exitColumn_expression(@NotNull PLSQLParser.Column_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_last_value}.
	 * @param ctx the parse tree
	 */
	void enterFunction_last_value(@NotNull PLSQLParser.Function_last_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_last_value}.
	 * @param ctx the parse tree
	 */
	void exitFunction_last_value(@NotNull PLSQLParser.Function_last_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(@NotNull PLSQLParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(@NotNull PLSQLParser.Function_callContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_cube_table}.
	 * @param ctx the parse tree
	 */
	void enterFunction_cube_table(@NotNull PLSQLParser.Function_cube_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_cube_table}.
	 * @param ctx the parse tree
	 */
	void exitFunction_cube_table(@NotNull PLSQLParser.Function_cube_tableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_to_timestamp_tz}.
	 * @param ctx the parse tree
	 */
	void enterFunction_to_timestamp_tz(@NotNull PLSQLParser.Function_to_timestamp_tzContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_to_timestamp_tz}.
	 * @param ctx the parse tree
	 */
	void exitFunction_to_timestamp_tz(@NotNull PLSQLParser.Function_to_timestamp_tzContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#view}.
	 * @param ctx the parse tree
	 */
	void enterView(@NotNull PLSQLParser.ViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#view}.
	 * @param ctx the parse tree
	 */
	void exitView(@NotNull PLSQLParser.ViewContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_ref}.
	 * @param ctx the parse tree
	 */
	void enterFunction_ref(@NotNull PLSQLParser.Function_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_ref}.
	 * @param ctx the parse tree
	 */
	void exitFunction_ref(@NotNull PLSQLParser.Function_refContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#model_condition}.
	 * @param ctx the parse tree
	 */
	void enterModel_condition(@NotNull PLSQLParser.Model_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#model_condition}.
	 * @param ctx the parse tree
	 */
	void exitModel_condition(@NotNull PLSQLParser.Model_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_xmlcdata}.
	 * @param ctx the parse tree
	 */
	void enterFunction_xmlcdata(@NotNull PLSQLParser.Function_xmlcdataContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_xmlcdata}.
	 * @param ctx the parse tree
	 */
	void exitFunction_xmlcdata(@NotNull PLSQLParser.Function_xmlcdataContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#controlfile_clauses}.
	 * @param ctx the parse tree
	 */
	void enterControlfile_clauses(@NotNull PLSQLParser.Controlfile_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#controlfile_clauses}.
	 * @param ctx the parse tree
	 */
	void exitControlfile_clauses(@NotNull PLSQLParser.Controlfile_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#index_partitioning_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_partitioning_clause(@NotNull PLSQLParser.Index_partitioning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#index_partitioning_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_partitioning_clause(@NotNull PLSQLParser.Index_partitioning_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sql_statement_shortcut}.
	 * @param ctx the parse tree
	 */
	void enterSql_statement_shortcut(@NotNull PLSQLParser.Sql_statement_shortcutContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sql_statement_shortcut}.
	 * @param ctx the parse tree
	 */
	void exitSql_statement_shortcut(@NotNull PLSQLParser.Sql_statement_shortcutContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#routine_clause}.
	 * @param ctx the parse tree
	 */
	void enterRoutine_clause(@NotNull PLSQLParser.Routine_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#routine_clause}.
	 * @param ctx the parse tree
	 */
	void exitRoutine_clause(@NotNull PLSQLParser.Routine_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#initialize_section}.
	 * @param ctx the parse tree
	 */
	void enterInitialize_section(@NotNull PLSQLParser.Initialize_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#initialize_section}.
	 * @param ctx the parse tree
	 */
	void exitInitialize_section(@NotNull PLSQLParser.Initialize_sectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_from_tz}.
	 * @param ctx the parse tree
	 */
	void enterFunction_from_tz(@NotNull PLSQLParser.Function_from_tzContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_from_tz}.
	 * @param ctx the parse tree
	 */
	void exitFunction_from_tz(@NotNull PLSQLParser.Function_from_tzContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_nth_value}.
	 * @param ctx the parse tree
	 */
	void enterFunction_nth_value(@NotNull PLSQLParser.Function_nth_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_nth_value}.
	 * @param ctx the parse tree
	 */
	void exitFunction_nth_value(@NotNull PLSQLParser.Function_nth_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#modify_mv_column_clause}.
	 * @param ctx the parse tree
	 */
	void enterModify_mv_column_clause(@NotNull PLSQLParser.Modify_mv_column_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#modify_mv_column_clause}.
	 * @param ctx the parse tree
	 */
	void exitModify_mv_column_clause(@NotNull PLSQLParser.Modify_mv_column_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#references_clause}.
	 * @param ctx the parse tree
	 */
	void enterReferences_clause(@NotNull PLSQLParser.References_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#references_clause}.
	 * @param ctx the parse tree
	 */
	void exitReferences_clause(@NotNull PLSQLParser.References_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#domain}.
	 * @param ctx the parse tree
	 */
	void enterDomain(@NotNull PLSQLParser.DomainContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#domain}.
	 * @param ctx the parse tree
	 */
	void exitDomain(@NotNull PLSQLParser.DomainContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_xmlcomment}.
	 * @param ctx the parse tree
	 */
	void enterFunction_xmlcomment(@NotNull PLSQLParser.Function_xmlcommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_xmlcomment}.
	 * @param ctx the parse tree
	 */
	void exitFunction_xmlcomment(@NotNull PLSQLParser.Function_xmlcommentContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#rowtype_attribute}.
	 * @param ctx the parse tree
	 */
	void enterRowtype_attribute(@NotNull PLSQLParser.Rowtype_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#rowtype_attribute}.
	 * @param ctx the parse tree
	 */
	void exitRowtype_attribute(@NotNull PLSQLParser.Rowtype_attributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#on_comp_partitioned_table}.
	 * @param ctx the parse tree
	 */
	void enterOn_comp_partitioned_table(@NotNull PLSQLParser.On_comp_partitioned_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#on_comp_partitioned_table}.
	 * @param ctx the parse tree
	 */
	void exitOn_comp_partitioned_table(@NotNull PLSQLParser.On_comp_partitioned_tableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sid}.
	 * @param ctx the parse tree
	 */
	void enterSid(@NotNull PLSQLParser.SidContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sid}.
	 * @param ctx the parse tree
	 */
	void exitSid(@NotNull PLSQLParser.SidContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_sys_extract_utc}.
	 * @param ctx the parse tree
	 */
	void enterFunction_sys_extract_utc(@NotNull PLSQLParser.Function_sys_extract_utcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_sys_extract_utc}.
	 * @param ctx the parse tree
	 */
	void exitFunction_sys_extract_utc(@NotNull PLSQLParser.Function_sys_extract_utcContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#conversion_function}.
	 * @param ctx the parse tree
	 */
	void enterConversion_function(@NotNull PLSQLParser.Conversion_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#conversion_function}.
	 * @param ctx the parse tree
	 */
	void exitConversion_function(@NotNull PLSQLParser.Conversion_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(@NotNull PLSQLParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(@NotNull PLSQLParser.Function_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(@NotNull PLSQLParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(@NotNull PLSQLParser.IntegerContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#on_hash_partitioned_table}.
	 * @param ctx the parse tree
	 */
	void enterOn_hash_partitioned_table(@NotNull PLSQLParser.On_hash_partitioned_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#on_hash_partitioned_table}.
	 * @param ctx the parse tree
	 */
	void exitOn_hash_partitioned_table(@NotNull PLSQLParser.On_hash_partitioned_tableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#asm_filename}.
	 * @param ctx the parse tree
	 */
	void enterAsm_filename(@NotNull PLSQLParser.Asm_filenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#asm_filename}.
	 * @param ctx the parse tree
	 */
	void exitAsm_filename(@NotNull PLSQLParser.Asm_filenameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#individual_hash_subparts}.
	 * @param ctx the parse tree
	 */
	void enterIndividual_hash_subparts(@NotNull PLSQLParser.Individual_hash_subpartsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#individual_hash_subparts}.
	 * @param ctx the parse tree
	 */
	void exitIndividual_hash_subparts(@NotNull PLSQLParser.Individual_hash_subpartsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_asin}.
	 * @param ctx the parse tree
	 */
	void enterFunction_asin(@NotNull PLSQLParser.Function_asinContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_asin}.
	 * @param ctx the parse tree
	 */
	void exitFunction_asin(@NotNull PLSQLParser.Function_asinContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#local_partitioned_index}.
	 * @param ctx the parse tree
	 */
	void enterLocal_partitioned_index(@NotNull PLSQLParser.Local_partitioned_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#local_partitioned_index}.
	 * @param ctx the parse tree
	 */
	void exitLocal_partitioned_index(@NotNull PLSQLParser.Local_partitioned_indexContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operator(@NotNull PLSQLParser.Relational_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operator(@NotNull PLSQLParser.Relational_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull PLSQLParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull PLSQLParser.OperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#archive_log_clause}.
	 * @param ctx the parse tree
	 */
	void enterArchive_log_clause(@NotNull PLSQLParser.Archive_log_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#archive_log_clause}.
	 * @param ctx the parse tree
	 */
	void exitArchive_log_clause(@NotNull PLSQLParser.Archive_log_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#new_dir_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_dir_name(@NotNull PLSQLParser.New_dir_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#new_dir_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_dir_name(@NotNull PLSQLParser.New_dir_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_name(@NotNull PLSQLParser.Attribute_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_name(@NotNull PLSQLParser.Attribute_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#file_type}.
	 * @param ctx the parse tree
	 */
	void enterFile_type(@NotNull PLSQLParser.File_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#file_type}.
	 * @param ctx the parse tree
	 */
	void exitFile_type(@NotNull PLSQLParser.File_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_last_day}.
	 * @param ctx the parse tree
	 */
	void enterFunction_last_day(@NotNull PLSQLParser.Function_last_dayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_last_day}.
	 * @param ctx the parse tree
	 */
	void exitFunction_last_day(@NotNull PLSQLParser.Function_last_dayContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#shrink_clause}.
	 * @param ctx the parse tree
	 */
	void enterShrink_clause(@NotNull PLSQLParser.Shrink_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#shrink_clause}.
	 * @param ctx the parse tree
	 */
	void exitShrink_clause(@NotNull PLSQLParser.Shrink_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void enterCase_expression(@NotNull PLSQLParser.Case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void exitCase_expression(@NotNull PLSQLParser.Case_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#db_user_proxy_clauses}.
	 * @param ctx the parse tree
	 */
	void enterDb_user_proxy_clauses(@NotNull PLSQLParser.Db_user_proxy_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#db_user_proxy_clauses}.
	 * @param ctx the parse tree
	 */
	void exitDb_user_proxy_clauses(@NotNull PLSQLParser.Db_user_proxy_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#incomplete_file_name}.
	 * @param ctx the parse tree
	 */
	void enterIncomplete_file_name(@NotNull PLSQLParser.Incomplete_file_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#incomplete_file_name}.
	 * @param ctx the parse tree
	 */
	void exitIncomplete_file_name(@NotNull PLSQLParser.Incomplete_file_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#error_logging_clause}.
	 * @param ctx the parse tree
	 */
	void enterError_logging_clause(@NotNull PLSQLParser.Error_logging_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#error_logging_clause}.
	 * @param ctx the parse tree
	 */
	void exitError_logging_clause(@NotNull PLSQLParser.Error_logging_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_unistr}.
	 * @param ctx the parse tree
	 */
	void enterFunction_unistr(@NotNull PLSQLParser.Function_unistrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_unistr}.
	 * @param ctx the parse tree
	 */
	void exitFunction_unistr(@NotNull PLSQLParser.Function_unistrContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#tablespace_retention_clause}.
	 * @param ctx the parse tree
	 */
	void enterTablespace_retention_clause(@NotNull PLSQLParser.Tablespace_retention_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#tablespace_retention_clause}.
	 * @param ctx the parse tree
	 */
	void exitTablespace_retention_clause(@NotNull PLSQLParser.Tablespace_retention_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_extractvalue}.
	 * @param ctx the parse tree
	 */
	void enterFunction_extractvalue(@NotNull PLSQLParser.Function_extractvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_extractvalue}.
	 * @param ctx the parse tree
	 */
	void exitFunction_extractvalue(@NotNull PLSQLParser.Function_extractvalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#func_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl_in_type(@NotNull PLSQLParser.Func_decl_in_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#func_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl_in_type(@NotNull PLSQLParser.Func_decl_in_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_upper}.
	 * @param ctx the parse tree
	 */
	void enterFunction_upper(@NotNull PLSQLParser.Function_upperContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_upper}.
	 * @param ctx the parse tree
	 */
	void exitFunction_upper(@NotNull PLSQLParser.Function_upperContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#individual_hash_partitions}.
	 * @param ctx the parse tree
	 */
	void enterIndividual_hash_partitions(@NotNull PLSQLParser.Individual_hash_partitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#individual_hash_partitions}.
	 * @param ctx the parse tree
	 */
	void exitIndividual_hash_partitions(@NotNull PLSQLParser.Individual_hash_partitionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull PLSQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull PLSQLParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#edition}.
	 * @param ctx the parse tree
	 */
	void enterEdition(@NotNull PLSQLParser.EditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#edition}.
	 * @param ctx the parse tree
	 */
	void exitEdition(@NotNull PLSQLParser.EditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(@NotNull PLSQLParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(@NotNull PLSQLParser.BodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#modify_diskgroup_file}.
	 * @param ctx the parse tree
	 */
	void enterModify_diskgroup_file(@NotNull PLSQLParser.Modify_diskgroup_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#modify_diskgroup_file}.
	 * @param ctx the parse tree
	 */
	void exitModify_diskgroup_file(@NotNull PLSQLParser.Modify_diskgroup_fileContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#time_zone_region}.
	 * @param ctx the parse tree
	 */
	void enterTime_zone_region(@NotNull PLSQLParser.Time_zone_regionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#time_zone_region}.
	 * @param ctx the parse tree
	 */
	void exitTime_zone_region(@NotNull PLSQLParser.Time_zone_regionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#c_alias}.
	 * @param ctx the parse tree
	 */
	void enterC_alias(@NotNull PLSQLParser.C_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#c_alias}.
	 * @param ctx the parse tree
	 */
	void exitC_alias(@NotNull PLSQLParser.C_aliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_xmlforest}.
	 * @param ctx the parse tree
	 */
	void enterFunction_xmlforest(@NotNull PLSQLParser.Function_xmlforestContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_xmlforest}.
	 * @param ctx the parse tree
	 */
	void exitFunction_xmlforest(@NotNull PLSQLParser.Function_xmlforestContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#trigger_ordering_clause}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_ordering_clause(@NotNull PLSQLParser.Trigger_ordering_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#trigger_ordering_clause}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_ordering_clause(@NotNull PLSQLParser.Trigger_ordering_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#asm_version}.
	 * @param ctx the parse tree
	 */
	void enterAsm_version(@NotNull PLSQLParser.Asm_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#asm_version}.
	 * @param ctx the parse tree
	 */
	void exitAsm_version(@NotNull PLSQLParser.Asm_versionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_expression(@NotNull PLSQLParser.Numeric_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_expression(@NotNull PLSQLParser.Numeric_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_tan}.
	 * @param ctx the parse tree
	 */
	void enterFunction_tan(@NotNull PLSQLParser.Function_tanContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_tan}.
	 * @param ctx the parse tree
	 */
	void exitFunction_tan(@NotNull PLSQLParser.Function_tanContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xpaths_list}.
	 * @param ctx the parse tree
	 */
	void enterXpaths_list(@NotNull PLSQLParser.Xpaths_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xpaths_list}.
	 * @param ctx the parse tree
	 */
	void exitXpaths_list(@NotNull PLSQLParser.Xpaths_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#rename_index_partition}.
	 * @param ctx the parse tree
	 */
	void enterRename_index_partition(@NotNull PLSQLParser.Rename_index_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#rename_index_partition}.
	 * @param ctx the parse tree
	 */
	void exitRename_index_partition(@NotNull PLSQLParser.Rename_index_partitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#long_and_raw_datatypes}.
	 * @param ctx the parse tree
	 */
	void enterLong_and_raw_datatypes(@NotNull PLSQLParser.Long_and_raw_datatypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#long_and_raw_datatypes}.
	 * @param ctx the parse tree
	 */
	void exitLong_and_raw_datatypes(@NotNull PLSQLParser.Long_and_raw_datatypesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#out_of_line_part_storage}.
	 * @param ctx the parse tree
	 */
	void enterOut_of_line_part_storage(@NotNull PLSQLParser.Out_of_line_part_storageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#out_of_line_part_storage}.
	 * @param ctx the parse tree
	 */
	void exitOut_of_line_part_storage(@NotNull PLSQLParser.Out_of_line_part_storageContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#feature_id}.
	 * @param ctx the parse tree
	 */
	void enterFeature_id(@NotNull PLSQLParser.Feature_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#feature_id}.
	 * @param ctx the parse tree
	 */
	void exitFeature_id(@NotNull PLSQLParser.Feature_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sqlj_object_type_attr}.
	 * @param ctx the parse tree
	 */
	void enterSqlj_object_type_attr(@NotNull PLSQLParser.Sqlj_object_type_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sqlj_object_type_attr}.
	 * @param ctx the parse tree
	 */
	void exitSqlj_object_type_attr(@NotNull PLSQLParser.Sqlj_object_type_attrContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#tablespace_logging_clauses}.
	 * @param ctx the parse tree
	 */
	void enterTablespace_logging_clauses(@NotNull PLSQLParser.Tablespace_logging_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#tablespace_logging_clauses}.
	 * @param ctx the parse tree
	 */
	void exitTablespace_logging_clauses(@NotNull PLSQLParser.Tablespace_logging_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterParameter_name(@NotNull PLSQLParser.Parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitParameter_name(@NotNull PLSQLParser.Parameter_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#date_expression}.
	 * @param ctx the parse tree
	 */
	void enterDate_expression(@NotNull PLSQLParser.Date_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#date_expression}.
	 * @param ctx the parse tree
	 */
	void exitDate_expression(@NotNull PLSQLParser.Date_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#diskgroup_directory_clauses}.
	 * @param ctx the parse tree
	 */
	void enterDiskgroup_directory_clauses(@NotNull PLSQLParser.Diskgroup_directory_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#diskgroup_directory_clauses}.
	 * @param ctx the parse tree
	 */
	void exitDiskgroup_directory_clauses(@NotNull PLSQLParser.Diskgroup_directory_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#drop_constraint_clause}.
	 * @param ctx the parse tree
	 */
	void enterDrop_constraint_clause(@NotNull PLSQLParser.Drop_constraint_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#drop_constraint_clause}.
	 * @param ctx the parse tree
	 */
	void exitDrop_constraint_clause(@NotNull PLSQLParser.Drop_constraint_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(@NotNull PLSQLParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(@NotNull PLSQLParser.KeyContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sqlj_object_type}.
	 * @param ctx the parse tree
	 */
	void enterSqlj_object_type(@NotNull PLSQLParser.Sqlj_object_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sqlj_object_type}.
	 * @param ctx the parse tree
	 */
	void exitSqlj_object_type(@NotNull PLSQLParser.Sqlj_object_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#compound_condition}.
	 * @param ctx the parse tree
	 */
	void enterCompound_condition(@NotNull PLSQLParser.Compound_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#compound_condition}.
	 * @param ctx the parse tree
	 */
	void exitCompound_condition(@NotNull PLSQLParser.Compound_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#security_clause}.
	 * @param ctx the parse tree
	 */
	void enterSecurity_clause(@NotNull PLSQLParser.Security_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#security_clause}.
	 * @param ctx the parse tree
	 */
	void exitSecurity_clause(@NotNull PLSQLParser.Security_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#scn_value}.
	 * @param ctx the parse tree
	 */
	void enterScn_value(@NotNull PLSQLParser.Scn_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#scn_value}.
	 * @param ctx the parse tree
	 */
	void exitScn_value(@NotNull PLSQLParser.Scn_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#regexp_like_condition}.
	 * @param ctx the parse tree
	 */
	void enterRegexp_like_condition(@NotNull PLSQLParser.Regexp_like_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#regexp_like_condition}.
	 * @param ctx the parse tree
	 */
	void exitRegexp_like_condition(@NotNull PLSQLParser.Regexp_like_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#exception_declaration}.
	 * @param ctx the parse tree
	 */
	void enterException_declaration(@NotNull PLSQLParser.Exception_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#exception_declaration}.
	 * @param ctx the parse tree
	 */
	void exitException_declaration(@NotNull PLSQLParser.Exception_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#create_index}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index(@NotNull PLSQLParser.Create_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#create_index}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index(@NotNull PLSQLParser.Create_indexContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#location_specifier}.
	 * @param ctx the parse tree
	 */
	void enterLocation_specifier(@NotNull PLSQLParser.Location_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#location_specifier}.
	 * @param ctx the parse tree
	 */
	void exitLocation_specifier(@NotNull PLSQLParser.Location_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#column_properties}.
	 * @param ctx the parse tree
	 */
	void enterColumn_properties(@NotNull PLSQLParser.Column_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#column_properties}.
	 * @param ctx the parse tree
	 */
	void exitColumn_properties(@NotNull PLSQLParser.Column_propertiesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_sys_xmlagg}.
	 * @param ctx the parse tree
	 */
	void enterFunction_sys_xmlagg(@NotNull PLSQLParser.Function_sys_xmlaggContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_sys_xmlagg}.
	 * @param ctx the parse tree
	 */
	void exitFunction_sys_xmlagg(@NotNull PLSQLParser.Function_sys_xmlaggContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#lob_storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterLob_storage_clause(@NotNull PLSQLParser.Lob_storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#lob_storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitLob_storage_clause(@NotNull PLSQLParser.Lob_storage_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#add_disk_clause}.
	 * @param ctx the parse tree
	 */
	void enterAdd_disk_clause(@NotNull PLSQLParser.Add_disk_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#add_disk_clause}.
	 * @param ctx the parse tree
	 */
	void exitAdd_disk_clause(@NotNull PLSQLParser.Add_disk_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#disk_region_clause}.
	 * @param ctx the parse tree
	 */
	void enterDisk_region_clause(@NotNull PLSQLParser.Disk_region_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#disk_region_clause}.
	 * @param ctx the parse tree
	 */
	void exitDisk_region_clause(@NotNull PLSQLParser.Disk_region_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#tps_body}.
	 * @param ctx the parse tree
	 */
	void enterTps_body(@NotNull PLSQLParser.Tps_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#tps_body}.
	 * @param ctx the parse tree
	 */
	void exitTps_body(@NotNull PLSQLParser.Tps_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#range_partitions}.
	 * @param ctx the parse tree
	 */
	void enterRange_partitions(@NotNull PLSQLParser.Range_partitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#range_partitions}.
	 * @param ctx the parse tree
	 */
	void exitRange_partitions(@NotNull PLSQLParser.Range_partitionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_max}.
	 * @param ctx the parse tree
	 */
	void enterFunction_max(@NotNull PLSQLParser.Function_maxContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_max}.
	 * @param ctx the parse tree
	 */
	void exitFunction_max(@NotNull PLSQLParser.Function_maxContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#t_alias}.
	 * @param ctx the parse tree
	 */
	void enterT_alias(@NotNull PLSQLParser.T_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#t_alias}.
	 * @param ctx the parse tree
	 */
	void exitT_alias(@NotNull PLSQLParser.T_aliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#subexpr}.
	 * @param ctx the parse tree
	 */
	void enterSubexpr(@NotNull PLSQLParser.SubexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#subexpr}.
	 * @param ctx the parse tree
	 */
	void exitSubexpr(@NotNull PLSQLParser.SubexprContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(@NotNull PLSQLParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(@NotNull PLSQLParser.Table_aliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#ref_cursor_type}.
	 * @param ctx the parse tree
	 */
	void enterRef_cursor_type(@NotNull PLSQLParser.Ref_cursor_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#ref_cursor_type}.
	 * @param ctx the parse tree
	 */
	void exitRef_cursor_type(@NotNull PLSQLParser.Ref_cursor_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#update_index_partition}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_index_partition(@NotNull PLSQLParser.Update_index_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#update_index_partition}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_index_partition(@NotNull PLSQLParser.Update_index_partitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#partition_extended_name}.
	 * @param ctx the parse tree
	 */
	void enterPartition_extended_name(@NotNull PLSQLParser.Partition_extended_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#partition_extended_name}.
	 * @param ctx the parse tree
	 */
	void exitPartition_extended_name(@NotNull PLSQLParser.Partition_extended_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_in_clause(@NotNull PLSQLParser.Unpivot_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_in_clause(@NotNull PLSQLParser.Unpivot_in_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#partition_number}.
	 * @param ctx the parse tree
	 */
	void enterPartition_number(@NotNull PLSQLParser.Partition_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#partition_number}.
	 * @param ctx the parse tree
	 */
	void exitPartition_number(@NotNull PLSQLParser.Partition_numberContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_stats_t_test_indepu}.
	 * @param ctx the parse tree
	 */
	void enterFunction_stats_t_test_indepu(@NotNull PLSQLParser.Function_stats_t_test_indepuContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_stats_t_test_indepu}.
	 * @param ctx the parse tree
	 */
	void exitFunction_stats_t_test_indepu(@NotNull PLSQLParser.Function_stats_t_test_indepuContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(@NotNull PLSQLParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(@NotNull PLSQLParser.Boolean_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#merge_update_clause}.
	 * @param ctx the parse tree
	 */
	void enterMerge_update_clause(@NotNull PLSQLParser.Merge_update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#merge_update_clause}.
	 * @param ctx the parse tree
	 */
	void exitMerge_update_clause(@NotNull PLSQLParser.Merge_update_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#parameter_type}.
	 * @param ctx the parse tree
	 */
	void enterParameter_type(@NotNull PLSQLParser.Parameter_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#parameter_type}.
	 * @param ctx the parse tree
	 */
	void exitParameter_type(@NotNull PLSQLParser.Parameter_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_localtimestamp}.
	 * @param ctx the parse tree
	 */
	void enterFunction_localtimestamp(@NotNull PLSQLParser.Function_localtimestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_localtimestamp}.
	 * @param ctx the parse tree
	 */
	void exitFunction_localtimestamp(@NotNull PLSQLParser.Function_localtimestampContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_xmlexists}.
	 * @param ctx the parse tree
	 */
	void enterFunction_xmlexists(@NotNull PLSQLParser.Function_xmlexistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_xmlexists}.
	 * @param ctx the parse tree
	 */
	void exitFunction_xmlexists(@NotNull PLSQLParser.Function_xmlexistsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_nls_lower}.
	 * @param ctx the parse tree
	 */
	void enterFunction_nls_lower(@NotNull PLSQLParser.Function_nls_lowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_nls_lower}.
	 * @param ctx the parse tree
	 */
	void exitFunction_nls_lower(@NotNull PLSQLParser.Function_nls_lowerContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#update_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_set_clause(@NotNull PLSQLParser.Update_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#update_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_set_clause(@NotNull PLSQLParser.Update_set_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#condition_expr_lists}.
	 * @param ctx the parse tree
	 */
	void enterCondition_expr_lists(@NotNull PLSQLParser.Condition_expr_listsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#condition_expr_lists}.
	 * @param ctx the parse tree
	 */
	void exitCondition_expr_lists(@NotNull PLSQLParser.Condition_expr_listsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#time_expr}.
	 * @param ctx the parse tree
	 */
	void enterTime_expr(@NotNull PLSQLParser.Time_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#time_expr}.
	 * @param ctx the parse tree
	 */
	void exitTime_expr(@NotNull PLSQLParser.Time_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_stats_t_test_indep}.
	 * @param ctx the parse tree
	 */
	void enterFunction_stats_t_test_indep(@NotNull PLSQLParser.Function_stats_t_test_indepContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_stats_t_test_indep}.
	 * @param ctx the parse tree
	 */
	void exitFunction_stats_t_test_indep(@NotNull PLSQLParser.Function_stats_t_test_indepContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_var_samp}.
	 * @param ctx the parse tree
	 */
	void enterFunction_var_samp(@NotNull PLSQLParser.Function_var_sampContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_var_samp}.
	 * @param ctx the parse tree
	 */
	void exitFunction_var_samp(@NotNull PLSQLParser.Function_var_sampContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#source_outline}.
	 * @param ctx the parse tree
	 */
	void enterSource_outline(@NotNull PLSQLParser.Source_outlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#source_outline}.
	 * @param ctx the parse tree
	 */
	void exitSource_outline(@NotNull PLSQLParser.Source_outlineContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#collection_method_call}.
	 * @param ctx the parse tree
	 */
	void enterCollection_method_call(@NotNull PLSQLParser.Collection_method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#collection_method_call}.
	 * @param ctx the parse tree
	 */
	void exitCollection_method_call(@NotNull PLSQLParser.Collection_method_callContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_stats_ks_test}.
	 * @param ctx the parse tree
	 */
	void enterFunction_stats_ks_test(@NotNull PLSQLParser.Function_stats_ks_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_stats_ks_test}.
	 * @param ctx the parse tree
	 */
	void exitFunction_stats_ks_test(@NotNull PLSQLParser.Function_stats_ks_testContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_substrb}.
	 * @param ctx the parse tree
	 */
	void enterFunction_substrb(@NotNull PLSQLParser.Function_substrbContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_substrb}.
	 * @param ctx the parse tree
	 */
	void exitFunction_substrb(@NotNull PLSQLParser.Function_substrbContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_rtrim}.
	 * @param ctx the parse tree
	 */
	void enterFunction_rtrim(@NotNull PLSQLParser.Function_rtrimContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_rtrim}.
	 * @param ctx the parse tree
	 */
	void exitFunction_rtrim(@NotNull PLSQLParser.Function_rtrimContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_substrc}.
	 * @param ctx the parse tree
	 */
	void enterFunction_substrc(@NotNull PLSQLParser.Function_substrcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_substrc}.
	 * @param ctx the parse tree
	 */
	void exitFunction_substrc(@NotNull PLSQLParser.Function_substrcContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#while_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop_statement(@NotNull PLSQLParser.While_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#while_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop_statement(@NotNull PLSQLParser.While_loop_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_sqrt}.
	 * @param ctx the parse tree
	 */
	void enterFunction_sqrt(@NotNull PLSQLParser.Function_sqrtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_sqrt}.
	 * @param ctx the parse tree
	 */
	void exitFunction_sqrt(@NotNull PLSQLParser.Function_sqrtContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#incarnation_number}.
	 * @param ctx the parse tree
	 */
	void enterIncarnation_number(@NotNull PLSQLParser.Incarnation_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#incarnation_number}.
	 * @param ctx the parse tree
	 */
	void exitIncarnation_number(@NotNull PLSQLParser.Incarnation_numberContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#auditing_on_clause}.
	 * @param ctx the parse tree
	 */
	void enterAuditing_on_clause(@NotNull PLSQLParser.Auditing_on_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#auditing_on_clause}.
	 * @param ctx the parse tree
	 */
	void exitAuditing_on_clause(@NotNull PLSQLParser.Auditing_on_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#method_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_name(@NotNull PLSQLParser.Method_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#method_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_name(@NotNull PLSQLParser.Method_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#compound_trigger_block}.
	 * @param ctx the parse tree
	 */
	void enterCompound_trigger_block(@NotNull PLSQLParser.Compound_trigger_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#compound_trigger_block}.
	 * @param ctx the parse tree
	 */
	void exitCompound_trigger_block(@NotNull PLSQLParser.Compound_trigger_blockContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#parent_level}.
	 * @param ctx the parse tree
	 */
	void enterParent_level(@NotNull PLSQLParser.Parent_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#parent_level}.
	 * @param ctx the parse tree
	 */
	void exitParent_level(@NotNull PLSQLParser.Parent_levelContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_mapping_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_mapping_table_clause(@NotNull PLSQLParser.Alter_mapping_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_mapping_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_mapping_table_clause(@NotNull PLSQLParser.Alter_mapping_table_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_atan2}.
	 * @param ctx the parse tree
	 */
	void enterFunction_atan2(@NotNull PLSQLParser.Function_atan2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_atan2}.
	 * @param ctx the parse tree
	 */
	void exitFunction_atan2(@NotNull PLSQLParser.Function_atan2Context ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_initcap}.
	 * @param ctx the parse tree
	 */
	void enterFunction_initcap(@NotNull PLSQLParser.Function_initcapContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_initcap}.
	 * @param ctx the parse tree
	 */
	void exitFunction_initcap(@NotNull PLSQLParser.Function_initcapContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(@NotNull PLSQLParser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(@NotNull PLSQLParser.DimensionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#create_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger(@NotNull PLSQLParser.Create_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#create_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger(@NotNull PLSQLParser.Create_triggerContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#build_clause}.
	 * @param ctx the parse tree
	 */
	void enterBuild_clause(@NotNull PLSQLParser.Build_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#build_clause}.
	 * @param ctx the parse tree
	 */
	void exitBuild_clause(@NotNull PLSQLParser.Build_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_xmlquery}.
	 * @param ctx the parse tree
	 */
	void enterFunction_xmlquery(@NotNull PLSQLParser.Function_xmlqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_xmlquery}.
	 * @param ctx the parse tree
	 */
	void exitFunction_xmlquery(@NotNull PLSQLParser.Function_xmlqueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#current_of_condition}.
	 * @param ctx the parse tree
	 */
	void enterCurrent_of_condition(@NotNull PLSQLParser.Current_of_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#current_of_condition}.
	 * @param ctx the parse tree
	 */
	void exitCurrent_of_condition(@NotNull PLSQLParser.Current_of_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(@NotNull PLSQLParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(@NotNull PLSQLParser.Group_by_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_current_date}.
	 * @param ctx the parse tree
	 */
	void enterFunction_current_date(@NotNull PLSQLParser.Function_current_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_current_date}.
	 * @param ctx the parse tree
	 */
	void exitFunction_current_date(@NotNull PLSQLParser.Function_current_dateContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#create_package}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package(@NotNull PLSQLParser.Create_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#create_package}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package(@NotNull PLSQLParser.Create_packageContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#modify_index_partition}.
	 * @param ctx the parse tree
	 */
	void enterModify_index_partition(@NotNull PLSQLParser.Modify_index_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#modify_index_partition}.
	 * @param ctx the parse tree
	 */
	void exitModify_index_partition(@NotNull PLSQLParser.Modify_index_partitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#file_owner_clause}.
	 * @param ctx the parse tree
	 */
	void enterFile_owner_clause(@NotNull PLSQLParser.File_owner_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#file_owner_clause}.
	 * @param ctx the parse tree
	 */
	void exitFile_owner_clause(@NotNull PLSQLParser.File_owner_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xmltype_instance}.
	 * @param ctx the parse tree
	 */
	void enterXmltype_instance(@NotNull PLSQLParser.Xmltype_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xmltype_instance}.
	 * @param ctx the parse tree
	 */
	void exitXmltype_instance(@NotNull PLSQLParser.Xmltype_instanceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_insertchildxmlbefore}.
	 * @param ctx the parse tree
	 */
	void enterFunction_insertchildxmlbefore(@NotNull PLSQLParser.Function_insertchildxmlbeforeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_insertchildxmlbefore}.
	 * @param ctx the parse tree
	 */
	void exitFunction_insertchildxmlbefore(@NotNull PLSQLParser.Function_insertchildxmlbeforeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_covar_pop}.
	 * @param ctx the parse tree
	 */
	void enterFunction_covar_pop(@NotNull PLSQLParser.Function_covar_popContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_covar_pop}.
	 * @param ctx the parse tree
	 */
	void exitFunction_covar_pop(@NotNull PLSQLParser.Function_covar_popContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_cast}.
	 * @param ctx the parse tree
	 */
	void enterFunction_cast(@NotNull PLSQLParser.Function_castContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_cast}.
	 * @param ctx the parse tree
	 */
	void exitFunction_cast(@NotNull PLSQLParser.Function_castContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#table_collection_expression}.
	 * @param ctx the parse tree
	 */
	void enterTable_collection_expression(@NotNull PLSQLParser.Table_collection_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#table_collection_expression}.
	 * @param ctx the parse tree
	 */
	void exitTable_collection_expression(@NotNull PLSQLParser.Table_collection_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#named_cursor}.
	 * @param ctx the parse tree
	 */
	void enterNamed_cursor(@NotNull PLSQLParser.Named_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#named_cursor}.
	 * @param ctx the parse tree
	 */
	void exitNamed_cursor(@NotNull PLSQLParser.Named_cursorContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#connect_string}.
	 * @param ctx the parse tree
	 */
	void enterConnect_string(@NotNull PLSQLParser.Connect_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#connect_string}.
	 * @param ctx the parse tree
	 */
	void exitConnect_string(@NotNull PLSQLParser.Connect_stringContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#conditional_predicate}.
	 * @param ctx the parse tree
	 */
	void enterConditional_predicate(@NotNull PLSQLParser.Conditional_predicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#conditional_predicate}.
	 * @param ctx the parse tree
	 */
	void exitConditional_predicate(@NotNull PLSQLParser.Conditional_predicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_query_clause(@NotNull PLSQLParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_query_clause(@NotNull PLSQLParser.Hierarchical_query_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_xml_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void enterFunction_xml_attributes_clause(@NotNull PLSQLParser.Function_xml_attributes_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_xml_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void exitFunction_xml_attributes_clause(@NotNull PLSQLParser.Function_xml_attributes_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#object_type}.
	 * @param ctx the parse tree
	 */
	void enterObject_type(@NotNull PLSQLParser.Object_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#object_type}.
	 * @param ctx the parse tree
	 */
	void exitObject_type(@NotNull PLSQLParser.Object_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_substr4}.
	 * @param ctx the parse tree
	 */
	void enterFunction_substr4(@NotNull PLSQLParser.Function_substr4Context ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_substr4}.
	 * @param ctx the parse tree
	 */
	void exitFunction_substr4(@NotNull PLSQLParser.Function_substr4Context ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_regexp_count}.
	 * @param ctx the parse tree
	 */
	void enterFunction_regexp_count(@NotNull PLSQLParser.Function_regexp_countContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_regexp_count}.
	 * @param ctx the parse tree
	 */
	void exitFunction_regexp_count(@NotNull PLSQLParser.Function_regexp_countContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_path}.
	 * @param ctx the parse tree
	 */
	void enterFunction_path(@NotNull PLSQLParser.Function_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_path}.
	 * @param ctx the parse tree
	 */
	void exitFunction_path(@NotNull PLSQLParser.Function_pathContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_substr2}.
	 * @param ctx the parse tree
	 */
	void enterFunction_substr2(@NotNull PLSQLParser.Function_substr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_substr2}.
	 * @param ctx the parse tree
	 */
	void exitFunction_substr2(@NotNull PLSQLParser.Function_substr2Context ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#collection_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterCollection_type_definition(@NotNull PLSQLParser.Collection_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#collection_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitCollection_type_definition(@NotNull PLSQLParser.Collection_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_tempfile_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_tempfile_clause(@NotNull PLSQLParser.Alter_tempfile_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_tempfile_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_tempfile_clause(@NotNull PLSQLParser.Alter_tempfile_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_ltrim}.
	 * @param ctx the parse tree
	 */
	void enterFunction_ltrim(@NotNull PLSQLParser.Function_ltrimContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_ltrim}.
	 * @param ctx the parse tree
	 */
	void exitFunction_ltrim(@NotNull PLSQLParser.Function_ltrimContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_rawtohex}.
	 * @param ctx the parse tree
	 */
	void enterFunction_rawtohex(@NotNull PLSQLParser.Function_rawtohexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_rawtohex}.
	 * @param ctx the parse tree
	 */
	void exitFunction_rawtohex(@NotNull PLSQLParser.Function_rawtohexContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_table_partitioning}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_partitioning(@NotNull PLSQLParser.Alter_table_partitioningContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_table_partitioning}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_partitioning(@NotNull PLSQLParser.Alter_table_partitioningContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#occurrence}.
	 * @param ctx the parse tree
	 */
	void enterOccurrence(@NotNull PLSQLParser.OccurrenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#occurrence}.
	 * @param ctx the parse tree
	 */
	void exitOccurrence(@NotNull PLSQLParser.OccurrenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_index_paths_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_index_paths_clause(@NotNull PLSQLParser.Alter_index_paths_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_index_paths_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_index_paths_clause(@NotNull PLSQLParser.Alter_index_paths_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#record_variable}.
	 * @param ctx the parse tree
	 */
	void enterRecord_variable(@NotNull PLSQLParser.Record_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#record_variable}.
	 * @param ctx the parse tree
	 */
	void exitRecord_variable(@NotNull PLSQLParser.Record_variableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#bitmap_join_index_clause}.
	 * @param ctx the parse tree
	 */
	void enterBitmap_join_index_clause(@NotNull PLSQLParser.Bitmap_join_index_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#bitmap_join_index_clause}.
	 * @param ctx the parse tree
	 */
	void exitBitmap_join_index_clause(@NotNull PLSQLParser.Bitmap_join_index_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#default_selectivity}.
	 * @param ctx the parse tree
	 */
	void enterDefault_selectivity(@NotNull PLSQLParser.Default_selectivityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#default_selectivity}.
	 * @param ctx the parse tree
	 */
	void exitDefault_selectivity(@NotNull PLSQLParser.Default_selectivityContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_feature_set}.
	 * @param ctx the parse tree
	 */
	void enterFunction_feature_set(@NotNull PLSQLParser.Function_feature_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_feature_set}.
	 * @param ctx the parse tree
	 */
	void exitFunction_feature_set(@NotNull PLSQLParser.Function_feature_setContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#object_table}.
	 * @param ctx the parse tree
	 */
	void enterObject_table(@NotNull PLSQLParser.Object_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#object_table}.
	 * @param ctx the parse tree
	 */
	void exitObject_table(@NotNull PLSQLParser.Object_tableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_nchr}.
	 * @param ctx the parse tree
	 */
	void enterFunction_nchr(@NotNull PLSQLParser.Function_nchrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_nchr}.
	 * @param ctx the parse tree
	 */
	void exitFunction_nchr(@NotNull PLSQLParser.Function_nchrContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#is_present_condition}.
	 * @param ctx the parse tree
	 */
	void enterIs_present_condition(@NotNull PLSQLParser.Is_present_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#is_present_condition}.
	 * @param ctx the parse tree
	 */
	void exitIs_present_condition(@NotNull PLSQLParser.Is_present_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#searched_case_expression}.
	 * @param ctx the parse tree
	 */
	void enterSearched_case_expression(@NotNull PLSQLParser.Searched_case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#searched_case_expression}.
	 * @param ctx the parse tree
	 */
	void exitSearched_case_expression(@NotNull PLSQLParser.Searched_case_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_sys_guid}.
	 * @param ctx the parse tree
	 */
	void enterFunction_sys_guid(@NotNull PLSQLParser.Function_sys_guidContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_sys_guid}.
	 * @param ctx the parse tree
	 */
	void exitFunction_sys_guid(@NotNull PLSQLParser.Function_sys_guidContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#group_comparison_condition}.
	 * @param ctx the parse tree
	 */
	void enterGroup_comparison_condition(@NotNull PLSQLParser.Group_comparison_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#group_comparison_condition}.
	 * @param ctx the parse tree
	 */
	void exitGroup_comparison_condition(@NotNull PLSQLParser.Group_comparison_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_sys_xmlgen}.
	 * @param ctx the parse tree
	 */
	void enterFunction_sys_xmlgen(@NotNull PLSQLParser.Function_sys_xmlgenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_sys_xmlgen}.
	 * @param ctx the parse tree
	 */
	void exitFunction_sys_xmlgen(@NotNull PLSQLParser.Function_sys_xmlgenContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_sinh}.
	 * @param ctx the parse tree
	 */
	void enterFunction_sinh(@NotNull PLSQLParser.Function_sinhContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_sinh}.
	 * @param ctx the parse tree
	 */
	void exitFunction_sinh(@NotNull PLSQLParser.Function_sinhContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#path_name}.
	 * @param ctx the parse tree
	 */
	void enterPath_name(@NotNull PLSQLParser.Path_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#path_name}.
	 * @param ctx the parse tree
	 */
	void exitPath_name(@NotNull PLSQLParser.Path_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#move_mv_log_clause}.
	 * @param ctx the parse tree
	 */
	void enterMove_mv_log_clause(@NotNull PLSQLParser.Move_mv_log_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#move_mv_log_clause}.
	 * @param ctx the parse tree
	 */
	void exitMove_mv_log_clause(@NotNull PLSQLParser.Move_mv_log_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#template_name}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_name(@NotNull PLSQLParser.Template_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#template_name}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_name(@NotNull PLSQLParser.Template_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#supplemental_id_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterSupplemental_id_key_clause(@NotNull PLSQLParser.Supplemental_id_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#supplemental_id_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitSupplemental_id_key_clause(@NotNull PLSQLParser.Supplemental_id_key_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_last}.
	 * @param ctx the parse tree
	 */
	void enterFunction_last(@NotNull PLSQLParser.Function_lastContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_last}.
	 * @param ctx the parse tree
	 */
	void exitFunction_last(@NotNull PLSQLParser.Function_lastContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dimension_join_clause}.
	 * @param ctx the parse tree
	 */
	void enterDimension_join_clause(@NotNull PLSQLParser.Dimension_join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dimension_join_clause}.
	 * @param ctx the parse tree
	 */
	void exitDimension_join_clause(@NotNull PLSQLParser.Dimension_join_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#revoke_object_privileges}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_object_privileges(@NotNull PLSQLParser.Revoke_object_privilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#revoke_object_privileges}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_object_privileges(@NotNull PLSQLParser.Revoke_object_privilegesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_to_number}.
	 * @param ctx the parse tree
	 */
	void enterFunction_to_number(@NotNull PLSQLParser.Function_to_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_to_number}.
	 * @param ctx the parse tree
	 */
	void exitFunction_to_number(@NotNull PLSQLParser.Function_to_numberContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#split_table_subpartition}.
	 * @param ctx the parse tree
	 */
	void enterSplit_table_subpartition(@NotNull PLSQLParser.Split_table_subpartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#split_table_subpartition}.
	 * @param ctx the parse tree
	 */
	void exitSplit_table_subpartition(@NotNull PLSQLParser.Split_table_subpartitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#tablespace_group_clause}.
	 * @param ctx the parse tree
	 */
	void enterTablespace_group_clause(@NotNull PLSQLParser.Tablespace_group_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#tablespace_group_clause}.
	 * @param ctx the parse tree
	 */
	void exitTablespace_group_clause(@NotNull PLSQLParser.Tablespace_group_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#subtype_definition}.
	 * @param ctx the parse tree
	 */
	void enterSubtype_definition(@NotNull PLSQLParser.Subtype_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#subtype_definition}.
	 * @param ctx the parse tree
	 */
	void exitSubtype_definition(@NotNull PLSQLParser.Subtype_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_new_time}.
	 * @param ctx the parse tree
	 */
	void enterFunction_new_time(@NotNull PLSQLParser.Function_new_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_new_time}.
	 * @param ctx the parse tree
	 */
	void exitFunction_new_time(@NotNull PLSQLParser.Function_new_timeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(@NotNull PLSQLParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(@NotNull PLSQLParser.ConstraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#add_list_subpartition}.
	 * @param ctx the parse tree
	 */
	void enterAdd_list_subpartition(@NotNull PLSQLParser.Add_list_subpartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#add_list_subpartition}.
	 * @param ctx the parse tree
	 */
	void exitAdd_list_subpartition(@NotNull PLSQLParser.Add_list_subpartitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#under_path_condition}.
	 * @param ctx the parse tree
	 */
	void enterUnder_path_condition(@NotNull PLSQLParser.Under_path_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#under_path_condition}.
	 * @param ctx the parse tree
	 */
	void exitUnder_path_condition(@NotNull PLSQLParser.Under_path_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#hash_subparts_by_quantity}.
	 * @param ctx the parse tree
	 */
	void enterHash_subparts_by_quantity(@NotNull PLSQLParser.Hash_subparts_by_quantityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#hash_subparts_by_quantity}.
	 * @param ctx the parse tree
	 */
	void exitHash_subparts_by_quantity(@NotNull PLSQLParser.Hash_subparts_by_quantityContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#order_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_key_clause(@NotNull PLSQLParser.Order_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#order_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_key_clause(@NotNull PLSQLParser.Order_key_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#resource_parameters}.
	 * @param ctx the parse tree
	 */
	void enterResource_parameters(@NotNull PLSQLParser.Resource_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#resource_parameters}.
	 * @param ctx the parse tree
	 */
	void exitResource_parameters(@NotNull PLSQLParser.Resource_parametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#storage_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterStorage_table_clause(@NotNull PLSQLParser.Storage_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#storage_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitStorage_table_clause(@NotNull PLSQLParser.Storage_table_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#opaque_format_spec}.
	 * @param ctx the parse tree
	 */
	void enterOpaque_format_spec(@NotNull PLSQLParser.Opaque_format_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#opaque_format_spec}.
	 * @param ctx the parse tree
	 */
	void exitOpaque_format_spec(@NotNull PLSQLParser.Opaque_format_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#column_clause}.
	 * @param ctx the parse tree
	 */
	void enterColumn_clause(@NotNull PLSQLParser.Column_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#column_clause}.
	 * @param ctx the parse tree
	 */
	void exitColumn_clause(@NotNull PLSQLParser.Column_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#collection_expression}.
	 * @param ctx the parse tree
	 */
	void enterCollection_expression(@NotNull PLSQLParser.Collection_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#collection_expression}.
	 * @param ctx the parse tree
	 */
	void exitCollection_expression(@NotNull PLSQLParser.Collection_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#model_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_clause(@NotNull PLSQLParser.Model_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#model_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_clause(@NotNull PLSQLParser.Model_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#diskgroup_alias_clauses}.
	 * @param ctx the parse tree
	 */
	void enterDiskgroup_alias_clauses(@NotNull PLSQLParser.Diskgroup_alias_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#diskgroup_alias_clauses}.
	 * @param ctx the parse tree
	 */
	void exitDiskgroup_alias_clauses(@NotNull PLSQLParser.Diskgroup_alias_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#collection_variable}.
	 * @param ctx the parse tree
	 */
	void enterCollection_variable(@NotNull PLSQLParser.Collection_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#collection_variable}.
	 * @param ctx the parse tree
	 */
	void exitCollection_variable(@NotNull PLSQLParser.Collection_variableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(@NotNull PLSQLParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(@NotNull PLSQLParser.Continue_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_for_clause(@NotNull PLSQLParser.Pivot_for_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_for_clause(@NotNull PLSQLParser.Pivot_for_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#serially_resuable_pragma}.
	 * @param ctx the parse tree
	 */
	void enterSerially_resuable_pragma(@NotNull PLSQLParser.Serially_resuable_pragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#serially_resuable_pragma}.
	 * @param ctx the parse tree
	 */
	void exitSerially_resuable_pragma(@NotNull PLSQLParser.Serially_resuable_pragmaContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_expression}.
	 * @param ctx the parse tree
	 */
	void enterFunction_expression(@NotNull PLSQLParser.Function_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_expression}.
	 * @param ctx the parse tree
	 */
	void exitFunction_expression(@NotNull PLSQLParser.Function_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#reference_partitioning}.
	 * @param ctx the parse tree
	 */
	void enterReference_partitioning(@NotNull PLSQLParser.Reference_partitioningContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#reference_partitioning}.
	 * @param ctx the parse tree
	 */
	void exitReference_partitioning(@NotNull PLSQLParser.Reference_partitioningContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#plsql_table_reference}.
	 * @param ctx the parse tree
	 */
	void enterPlsql_table_reference(@NotNull PLSQLParser.Plsql_table_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#plsql_table_reference}.
	 * @param ctx the parse tree
	 */
	void exitPlsql_table_reference(@NotNull PLSQLParser.Plsql_table_referenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#parallel_clause}.
	 * @param ctx the parse tree
	 */
	void enterParallel_clause(@NotNull PLSQLParser.Parallel_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#parallel_clause}.
	 * @param ctx the parse tree
	 */
	void exitParallel_clause(@NotNull PLSQLParser.Parallel_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#measure_column}.
	 * @param ctx the parse tree
	 */
	void enterMeasure_column(@NotNull PLSQLParser.Measure_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#measure_column}.
	 * @param ctx the parse tree
	 */
	void exitMeasure_column(@NotNull PLSQLParser.Measure_columnContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_to_lob}.
	 * @param ctx the parse tree
	 */
	void enterFunction_to_lob(@NotNull PLSQLParser.Function_to_lobContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_to_lob}.
	 * @param ctx the parse tree
	 */
	void exitFunction_to_lob(@NotNull PLSQLParser.Function_to_lobContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#table_compression}.
	 * @param ctx the parse tree
	 */
	void enterTable_compression(@NotNull PLSQLParser.Table_compressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#table_compression}.
	 * @param ctx the parse tree
	 */
	void exitTable_compression(@NotNull PLSQLParser.Table_compressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(@NotNull PLSQLParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(@NotNull PLSQLParser.LocationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_presentnnv}.
	 * @param ctx the parse tree
	 */
	void enterFunction_presentnnv(@NotNull PLSQLParser.Function_presentnnvContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_presentnnv}.
	 * @param ctx the parse tree
	 */
	void exitFunction_presentnnv(@NotNull PLSQLParser.Function_presentnnvContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_percentile_cont}.
	 * @param ctx the parse tree
	 */
	void enterFunction_percentile_cont(@NotNull PLSQLParser.Function_percentile_contContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_percentile_cont}.
	 * @param ctx the parse tree
	 */
	void exitFunction_percentile_cont(@NotNull PLSQLParser.Function_percentile_contContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#is_empty_condition}.
	 * @param ctx the parse tree
	 */
	void enterIs_empty_condition(@NotNull PLSQLParser.Is_empty_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#is_empty_condition}.
	 * @param ctx the parse tree
	 */
	void exitIs_empty_condition(@NotNull PLSQLParser.Is_empty_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#create_datafile_clause}.
	 * @param ctx the parse tree
	 */
	void enterCreate_datafile_clause(@NotNull PLSQLParser.Create_datafile_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#create_datafile_clause}.
	 * @param ctx the parse tree
	 */
	void exitCreate_datafile_clause(@NotNull PLSQLParser.Create_datafile_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#flashback_archive_retention}.
	 * @param ctx the parse tree
	 */
	void enterFlashback_archive_retention(@NotNull PLSQLParser.Flashback_archive_retentionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#flashback_archive_retention}.
	 * @param ctx the parse tree
	 */
	void exitFlashback_archive_retention(@NotNull PLSQLParser.Flashback_archive_retentionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#add_overflow_clause}.
	 * @param ctx the parse tree
	 */
	void enterAdd_overflow_clause(@NotNull PLSQLParser.Add_overflow_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#add_overflow_clause}.
	 * @param ctx the parse tree
	 */
	void exitAdd_overflow_clause(@NotNull PLSQLParser.Add_overflow_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#deferred_segment_creation}.
	 * @param ctx the parse tree
	 */
	void enterDeferred_segment_creation(@NotNull PLSQLParser.Deferred_segment_creationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#deferred_segment_creation}.
	 * @param ctx the parse tree
	 */
	void exitDeferred_segment_creation(@NotNull PLSQLParser.Deferred_segment_creationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(@NotNull PLSQLParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(@NotNull PLSQLParser.Column_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#external_parameter}.
	 * @param ctx the parse tree
	 */
	void enterExternal_parameter(@NotNull PLSQLParser.External_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#external_parameter}.
	 * @param ctx the parse tree
	 */
	void exitExternal_parameter(@NotNull PLSQLParser.External_parameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#out_of_line_constraint}.
	 * @param ctx the parse tree
	 */
	void enterOut_of_line_constraint(@NotNull PLSQLParser.Out_of_line_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#out_of_line_constraint}.
	 * @param ctx the parse tree
	 */
	void exitOut_of_line_constraint(@NotNull PLSQLParser.Out_of_line_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#audit_schema_object_clause}.
	 * @param ctx the parse tree
	 */
	void enterAudit_schema_object_clause(@NotNull PLSQLParser.Audit_schema_object_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#audit_schema_object_clause}.
	 * @param ctx the parse tree
	 */
	void exitAudit_schema_object_clause(@NotNull PLSQLParser.Audit_schema_object_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#level}.
	 * @param ctx the parse tree
	 */
	void enterLevel(@NotNull PLSQLParser.LevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#level}.
	 * @param ctx the parse tree
	 */
	void exitLevel(@NotNull PLSQLParser.LevelContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#log_group}.
	 * @param ctx the parse tree
	 */
	void enterLog_group(@NotNull PLSQLParser.Log_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#log_group}.
	 * @param ctx the parse tree
	 */
	void exitLog_group(@NotNull PLSQLParser.Log_groupContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#partition}.
	 * @param ctx the parse tree
	 */
	void enterPartition(@NotNull PLSQLParser.PartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#partition}.
	 * @param ctx the parse tree
	 */
	void exitPartition(@NotNull PLSQLParser.PartitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#hash_partition_quantity}.
	 * @param ctx the parse tree
	 */
	void enterHash_partition_quantity(@NotNull PLSQLParser.Hash_partition_quantityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#hash_partition_quantity}.
	 * @param ctx the parse tree
	 */
	void exitHash_partition_quantity(@NotNull PLSQLParser.Hash_partition_quantityContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xpath_string}.
	 * @param ctx the parse tree
	 */
	void enterXpath_string(@NotNull PLSQLParser.Xpath_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xpath_string}.
	 * @param ctx the parse tree
	 */
	void exitXpath_string(@NotNull PLSQLParser.Xpath_stringContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_rank_analytic}.
	 * @param ctx the parse tree
	 */
	void enterFunction_rank_analytic(@NotNull PLSQLParser.Function_rank_analyticContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_rank_analytic}.
	 * @param ctx the parse tree
	 */
	void exitFunction_rank_analytic(@NotNull PLSQLParser.Function_rank_analyticContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#merge_table_subpartitions}.
	 * @param ctx the parse tree
	 */
	void enterMerge_table_subpartitions(@NotNull PLSQLParser.Merge_table_subpartitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#merge_table_subpartitions}.
	 * @param ctx the parse tree
	 */
	void exitMerge_table_subpartitions(@NotNull PLSQLParser.Merge_table_subpartitionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#standby_database_clauses}.
	 * @param ctx the parse tree
	 */
	void enterStandby_database_clauses(@NotNull PLSQLParser.Standby_database_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#standby_database_clauses}.
	 * @param ctx the parse tree
	 */
	void exitStandby_database_clauses(@NotNull PLSQLParser.Standby_database_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#level_clause}.
	 * @param ctx the parse tree
	 */
	void enterLevel_clause(@NotNull PLSQLParser.Level_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#level_clause}.
	 * @param ctx the parse tree
	 */
	void exitLevel_clause(@NotNull PLSQLParser.Level_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#timing_point_section}.
	 * @param ctx the parse tree
	 */
	void enterTiming_point_section(@NotNull PLSQLParser.Timing_point_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#timing_point_section}.
	 * @param ctx the parse tree
	 */
	void exitTiming_point_section(@NotNull PLSQLParser.Timing_point_sectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#lob_compression_clause}.
	 * @param ctx the parse tree
	 */
	void enterLob_compression_clause(@NotNull PLSQLParser.Lob_compression_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#lob_compression_clause}.
	 * @param ctx the parse tree
	 */
	void exitLob_compression_clause(@NotNull PLSQLParser.Lob_compression_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#type_attribute}.
	 * @param ctx the parse tree
	 */
	void enterType_attribute(@NotNull PLSQLParser.Type_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#type_attribute}.
	 * @param ctx the parse tree
	 */
	void exitType_attribute(@NotNull PLSQLParser.Type_attributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_ora_dst_affected}.
	 * @param ctx the parse tree
	 */
	void enterFunction_ora_dst_affected(@NotNull PLSQLParser.Function_ora_dst_affectedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_ora_dst_affected}.
	 * @param ctx the parse tree
	 */
	void exitFunction_ora_dst_affected(@NotNull PLSQLParser.Function_ora_dst_affectedContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#path_string}.
	 * @param ctx the parse tree
	 */
	void enterPath_string(@NotNull PLSQLParser.Path_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#path_string}.
	 * @param ctx the parse tree
	 */
	void exitPath_string(@NotNull PLSQLParser.Path_stringContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#context_clause}.
	 * @param ctx the parse tree
	 */
	void enterContext_clause(@NotNull PLSQLParser.Context_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#context_clause}.
	 * @param ctx the parse tree
	 */
	void exitContext_clause(@NotNull PLSQLParser.Context_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_session_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_session_set_clause(@NotNull PLSQLParser.Alter_session_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_session_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_session_set_clause(@NotNull PLSQLParser.Alter_session_set_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#object_type_col_properties}.
	 * @param ctx the parse tree
	 */
	void enterObject_type_col_properties(@NotNull PLSQLParser.Object_type_col_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#object_type_col_properties}.
	 * @param ctx the parse tree
	 */
	void exitObject_type_col_properties(@NotNull PLSQLParser.Object_type_col_propertiesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull PLSQLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull PLSQLParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sample_clause}.
	 * @param ctx the parse tree
	 */
	void enterSample_clause(@NotNull PLSQLParser.Sample_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sample_clause}.
	 * @param ctx the parse tree
	 */
	void exitSample_clause(@NotNull PLSQLParser.Sample_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#analytic_function}.
	 * @param ctx the parse tree
	 */
	void enterAnalytic_function(@NotNull PLSQLParser.Analytic_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#analytic_function}.
	 * @param ctx the parse tree
	 */
	void exitAnalytic_function(@NotNull PLSQLParser.Analytic_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_ratio_to_report}.
	 * @param ctx the parse tree
	 */
	void enterFunction_ratio_to_report(@NotNull PLSQLParser.Function_ratio_to_reportContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_ratio_to_report}.
	 * @param ctx the parse tree
	 */
	void exitFunction_ratio_to_report(@NotNull PLSQLParser.Function_ratio_to_reportContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_min}.
	 * @param ctx the parse tree
	 */
	void enterFunction_min(@NotNull PLSQLParser.Function_minContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_min}.
	 * @param ctx the parse tree
	 */
	void exitFunction_min(@NotNull PLSQLParser.Function_minContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#rollback_segment}.
	 * @param ctx the parse tree
	 */
	void enterRollback_segment(@NotNull PLSQLParser.Rollback_segmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#rollback_segment}.
	 * @param ctx the parse tree
	 */
	void exitRollback_segment(@NotNull PLSQLParser.Rollback_segmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_treat}.
	 * @param ctx the parse tree
	 */
	void enterFunction_treat(@NotNull PLSQLParser.Function_treatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_treat}.
	 * @param ctx the parse tree
	 */
	void exitFunction_treat(@NotNull PLSQLParser.Function_treatContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#update_index_subpartition}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_index_subpartition(@NotNull PLSQLParser.Update_index_subpartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#update_index_subpartition}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_index_subpartition(@NotNull PLSQLParser.Update_index_subpartitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#supplemental_log_grp_clause}.
	 * @param ctx the parse tree
	 */
	void enterSupplemental_log_grp_clause(@NotNull PLSQLParser.Supplemental_log_grp_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#supplemental_log_grp_clause}.
	 * @param ctx the parse tree
	 */
	void exitSupplemental_log_grp_clause(@NotNull PLSQLParser.Supplemental_log_grp_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_grouping}.
	 * @param ctx the parse tree
	 */
	void enterFunction_grouping(@NotNull PLSQLParser.Function_groupingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_grouping}.
	 * @param ctx the parse tree
	 */
	void exitFunction_grouping(@NotNull PLSQLParser.Function_groupingContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#hash_partitions_by_quantity}.
	 * @param ctx the parse tree
	 */
	void enterHash_partitions_by_quantity(@NotNull PLSQLParser.Hash_partitions_by_quantityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#hash_partitions_by_quantity}.
	 * @param ctx the parse tree
	 */
	void exitHash_partitions_by_quantity(@NotNull PLSQLParser.Hash_partitions_by_quantityContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#ym_iso_format}.
	 * @param ctx the parse tree
	 */
	void enterYm_iso_format(@NotNull PLSQLParser.Ym_iso_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#ym_iso_format}.
	 * @param ctx the parse tree
	 */
	void exitYm_iso_format(@NotNull PLSQLParser.Ym_iso_formatContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#indexspec}.
	 * @param ctx the parse tree
	 */
	void enterIndexspec(@NotNull PLSQLParser.IndexspecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#indexspec}.
	 * @param ctx the parse tree
	 */
	void exitIndexspec(@NotNull PLSQLParser.IndexspecContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#constraint_clauses}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_clauses(@NotNull PLSQLParser.Constraint_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#constraint_clauses}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_clauses(@NotNull PLSQLParser.Constraint_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#declare_section}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_section(@NotNull PLSQLParser.Declare_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#declare_section}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_section(@NotNull PLSQLParser.Declare_sectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#undo_tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void enterUndo_tablespace_clause(@NotNull PLSQLParser.Undo_tablespace_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#undo_tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void exitUndo_tablespace_clause(@NotNull PLSQLParser.Undo_tablespace_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#list_partitions}.
	 * @param ctx the parse tree
	 */
	void enterList_partitions(@NotNull PLSQLParser.List_partitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#list_partitions}.
	 * @param ctx the parse tree
	 */
	void exitList_partitions(@NotNull PLSQLParser.List_partitionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursor_parameter}.
	 * @param ctx the parse tree
	 */
	void enterCursor_parameter(@NotNull PLSQLParser.Cursor_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursor_parameter}.
	 * @param ctx the parse tree
	 */
	void exitCursor_parameter(@NotNull PLSQLParser.Cursor_parameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dependent_column}.
	 * @param ctx the parse tree
	 */
	void enterDependent_column(@NotNull PLSQLParser.Dependent_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dependent_column}.
	 * @param ctx the parse tree
	 */
	void exitDependent_column(@NotNull PLSQLParser.Dependent_columnContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_group_id}.
	 * @param ctx the parse tree
	 */
	void enterFunction_group_id(@NotNull PLSQLParser.Function_group_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_group_id}.
	 * @param ctx the parse tree
	 */
	void exitFunction_group_id(@NotNull PLSQLParser.Function_group_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(@NotNull PLSQLParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(@NotNull PLSQLParser.Table_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dblink_authentication}.
	 * @param ctx the parse tree
	 */
	void enterDblink_authentication(@NotNull PLSQLParser.Dblink_authenticationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dblink_authentication}.
	 * @param ctx the parse tree
	 */
	void exitDblink_authentication(@NotNull PLSQLParser.Dblink_authenticationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_lnnvl}.
	 * @param ctx the parse tree
	 */
	void enterFunction_lnnvl(@NotNull PLSQLParser.Function_lnnvlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_lnnvl}.
	 * @param ctx the parse tree
	 */
	void exitFunction_lnnvl(@NotNull PLSQLParser.Function_lnnvlContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#procedure_definition}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_definition(@NotNull PLSQLParser.Procedure_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#procedure_definition}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_definition(@NotNull PLSQLParser.Procedure_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#list_subpartition_desc}.
	 * @param ctx the parse tree
	 */
	void enterList_subpartition_desc(@NotNull PLSQLParser.List_subpartition_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#list_subpartition_desc}.
	 * @param ctx the parse tree
	 */
	void exitList_subpartition_desc(@NotNull PLSQLParser.List_subpartition_descContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#subprog_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void enterSubprog_decl_in_type(@NotNull PLSQLParser.Subprog_decl_in_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#subprog_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void exitSubprog_decl_in_type(@NotNull PLSQLParser.Subprog_decl_in_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursor_for_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterCursor_for_loop_statement(@NotNull PLSQLParser.Cursor_for_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursor_for_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitCursor_for_loop_statement(@NotNull PLSQLParser.Cursor_for_loop_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#index_attributes}.
	 * @param ctx the parse tree
	 */
	void enterIndex_attributes(@NotNull PLSQLParser.Index_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#index_attributes}.
	 * @param ctx the parse tree
	 */
	void exitIndex_attributes(@NotNull PLSQLParser.Index_attributesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_acos}.
	 * @param ctx the parse tree
	 */
	void enterFunction_acos(@NotNull PLSQLParser.Function_acosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_acos}.
	 * @param ctx the parse tree
	 */
	void exitFunction_acos(@NotNull PLSQLParser.Function_acosContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#old_dir_name}.
	 * @param ctx the parse tree
	 */
	void enterOld_dir_name(@NotNull PLSQLParser.Old_dir_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#old_dir_name}.
	 * @param ctx the parse tree
	 */
	void exitOld_dir_name(@NotNull PLSQLParser.Old_dir_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#disk_online_clause}.
	 * @param ctx the parse tree
	 */
	void enterDisk_online_clause(@NotNull PLSQLParser.Disk_online_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#disk_online_clause}.
	 * @param ctx the parse tree
	 */
	void exitDisk_online_clause(@NotNull PLSQLParser.Disk_online_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#correlation_variable}.
	 * @param ctx the parse tree
	 */
	void enterCorrelation_variable(@NotNull PLSQLParser.Correlation_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#correlation_variable}.
	 * @param ctx the parse tree
	 */
	void exitCorrelation_variable(@NotNull PLSQLParser.Correlation_variableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#trigger_body}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_body(@NotNull PLSQLParser.Trigger_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#trigger_body}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_body(@NotNull PLSQLParser.Trigger_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#map_order_function_spec}.
	 * @param ctx the parse tree
	 */
	void enterMap_order_function_spec(@NotNull PLSQLParser.Map_order_function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#map_order_function_spec}.
	 * @param ctx the parse tree
	 */
	void exitMap_order_function_spec(@NotNull PLSQLParser.Map_order_function_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#instead_of_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterInstead_of_dml_trigger(@NotNull PLSQLParser.Instead_of_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#instead_of_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitInstead_of_dml_trigger(@NotNull PLSQLParser.Instead_of_dml_triggerContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_rawtonhex}.
	 * @param ctx the parse tree
	 */
	void enterFunction_rawtonhex(@NotNull PLSQLParser.Function_rawtonhexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_rawtonhex}.
	 * @param ctx the parse tree
	 */
	void exitFunction_rawtonhex(@NotNull PLSQLParser.Function_rawtonhexContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#general_recovery}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_recovery(@NotNull PLSQLParser.General_recoveryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#general_recovery}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_recovery(@NotNull PLSQLParser.General_recoveryContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#extended_attribute_clause}.
	 * @param ctx the parse tree
	 */
	void enterExtended_attribute_clause(@NotNull PLSQLParser.Extended_attribute_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#extended_attribute_clause}.
	 * @param ctx the parse tree
	 */
	void exitExtended_attribute_clause(@NotNull PLSQLParser.Extended_attribute_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#virtual_column_definition}.
	 * @param ctx the parse tree
	 */
	void enterVirtual_column_definition(@NotNull PLSQLParser.Virtual_column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#virtual_column_definition}.
	 * @param ctx the parse tree
	 */
	void exitVirtual_column_definition(@NotNull PLSQLParser.Virtual_column_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#collection_function}.
	 * @param ctx the parse tree
	 */
	void enterCollection_function(@NotNull PLSQLParser.Collection_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#collection_function}.
	 * @param ctx the parse tree
	 */
	void exitCollection_function(@NotNull PLSQLParser.Collection_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dest_char_set}.
	 * @param ctx the parse tree
	 */
	void enterDest_char_set(@NotNull PLSQLParser.Dest_char_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dest_char_set}.
	 * @param ctx the parse tree
	 */
	void exitDest_char_set(@NotNull PLSQLParser.Dest_char_setContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#allocate_extent_clause}.
	 * @param ctx the parse tree
	 */
	void enterAllocate_extent_clause(@NotNull PLSQLParser.Allocate_extent_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#allocate_extent_clause}.
	 * @param ctx the parse tree
	 */
	void exitAllocate_extent_clause(@NotNull PLSQLParser.Allocate_extent_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#indextype}.
	 * @param ctx the parse tree
	 */
	void enterIndextype(@NotNull PLSQLParser.IndextypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#indextype}.
	 * @param ctx the parse tree
	 */
	void exitIndextype(@NotNull PLSQLParser.IndextypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(@NotNull PLSQLParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(@NotNull PLSQLParser.Order_by_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#comparison_function}.
	 * @param ctx the parse tree
	 */
	void enterComparison_function(@NotNull PLSQLParser.Comparison_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#comparison_function}.
	 * @param ctx the parse tree
	 */
	void exitComparison_function(@NotNull PLSQLParser.Comparison_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_xmlisvalid}.
	 * @param ctx the parse tree
	 */
	void enterFunction_xmlisvalid(@NotNull PLSQLParser.Function_xmlisvalidContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_xmlisvalid}.
	 * @param ctx the parse tree
	 */
	void exitFunction_xmlisvalid(@NotNull PLSQLParser.Function_xmlisvalidContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#managed_standby_recovery}.
	 * @param ctx the parse tree
	 */
	void enterManaged_standby_recovery(@NotNull PLSQLParser.Managed_standby_recoveryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#managed_standby_recovery}.
	 * @param ctx the parse tree
	 */
	void exitManaged_standby_recovery(@NotNull PLSQLParser.Managed_standby_recoveryContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#ordering_column}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_column(@NotNull PLSQLParser.Ordering_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#ordering_column}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_column(@NotNull PLSQLParser.Ordering_columnContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#add_range_partition_clause}.
	 * @param ctx the parse tree
	 */
	void enterAdd_range_partition_clause(@NotNull PLSQLParser.Add_range_partition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#add_range_partition_clause}.
	 * @param ctx the parse tree
	 */
	void exitAdd_range_partition_clause(@NotNull PLSQLParser.Add_range_partition_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_to_multi_byte}.
	 * @param ctx the parse tree
	 */
	void enterFunction_to_multi_byte(@NotNull PLSQLParser.Function_to_multi_byteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_to_multi_byte}.
	 * @param ctx the parse tree
	 */
	void exitFunction_to_multi_byte(@NotNull PLSQLParser.Function_to_multi_byteContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_sysdate}.
	 * @param ctx the parse tree
	 */
	void enterFunction_sysdate(@NotNull PLSQLParser.Function_sysdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_sysdate}.
	 * @param ctx the parse tree
	 */
	void exitFunction_sysdate(@NotNull PLSQLParser.Function_sysdateContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#mining_attribute_clause}.
	 * @param ctx the parse tree
	 */
	void enterMining_attribute_clause(@NotNull PLSQLParser.Mining_attribute_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#mining_attribute_clause}.
	 * @param ctx the parse tree
	 */
	void exitMining_attribute_clause(@NotNull PLSQLParser.Mining_attribute_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#aggregate_function}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_function(@NotNull PLSQLParser.Aggregate_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#aggregate_function}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_function(@NotNull PLSQLParser.Aggregate_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#mapping_table_clauses}.
	 * @param ctx the parse tree
	 */
	void enterMapping_table_clauses(@NotNull PLSQLParser.Mapping_table_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#mapping_table_clauses}.
	 * @param ctx the parse tree
	 */
	void exitMapping_table_clauses(@NotNull PLSQLParser.Mapping_table_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#returning_clause}.
	 * @param ctx the parse tree
	 */
	void enterReturning_clause(@NotNull PLSQLParser.Returning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#returning_clause}.
	 * @param ctx the parse tree
	 */
	void exitReturning_clause(@NotNull PLSQLParser.Returning_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#subquery_restriction_clause}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_restriction_clause(@NotNull PLSQLParser.Subquery_restriction_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#subquery_restriction_clause}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_restriction_clause(@NotNull PLSQLParser.Subquery_restriction_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void enterSchema(@NotNull PLSQLParser.SchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void exitSchema(@NotNull PLSQLParser.SchemaContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_dense_rank_aggregate}.
	 * @param ctx the parse tree
	 */
	void enterFunction_dense_rank_aggregate(@NotNull PLSQLParser.Function_dense_rank_aggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_dense_rank_aggregate}.
	 * @param ctx the parse tree
	 */
	void exitFunction_dense_rank_aggregate(@NotNull PLSQLParser.Function_dense_rank_aggregateContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#directory_dn}.
	 * @param ctx the parse tree
	 */
	void enterDirectory_dn(@NotNull PLSQLParser.Directory_dnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#directory_dn}.
	 * @param ctx the parse tree
	 */
	void exitDirectory_dn(@NotNull PLSQLParser.Directory_dnContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#unstructured_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnstructured_clause(@NotNull PLSQLParser.Unstructured_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#unstructured_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnstructured_clause(@NotNull PLSQLParser.Unstructured_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_nls_charset_id}.
	 * @param ctx the parse tree
	 */
	void enterFunction_nls_charset_id(@NotNull PLSQLParser.Function_nls_charset_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_nls_charset_id}.
	 * @param ctx the parse tree
	 */
	void exitFunction_nls_charset_id(@NotNull PLSQLParser.Function_nls_charset_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_xmlsequence}.
	 * @param ctx the parse tree
	 */
	void enterFunction_xmlsequence(@NotNull PLSQLParser.Function_xmlsequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_xmlsequence}.
	 * @param ctx the parse tree
	 */
	void exitFunction_xmlsequence(@NotNull PLSQLParser.Function_xmlsequenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_stats_crosstab}.
	 * @param ctx the parse tree
	 */
	void enterFunction_stats_crosstab(@NotNull PLSQLParser.Function_stats_crosstabContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_stats_crosstab}.
	 * @param ctx the parse tree
	 */
	void exitFunction_stats_crosstab(@NotNull PLSQLParser.Function_stats_crosstabContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#object_type_def}.
	 * @param ctx the parse tree
	 */
	void enterObject_type_def(@NotNull PLSQLParser.Object_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#object_type_def}.
	 * @param ctx the parse tree
	 */
	void exitObject_type_def(@NotNull PLSQLParser.Object_type_defContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#null_condition}.
	 * @param ctx the parse tree
	 */
	void enterNull_condition(@NotNull PLSQLParser.Null_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#null_condition}.
	 * @param ctx the parse tree
	 */
	void exitNull_condition(@NotNull PLSQLParser.Null_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#level_column}.
	 * @param ctx the parse tree
	 */
	void enterLevel_column(@NotNull PLSQLParser.Level_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#level_column}.
	 * @param ctx the parse tree
	 */
	void exitLevel_column(@NotNull PLSQLParser.Level_columnContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#logfile_clause}.
	 * @param ctx the parse tree
	 */
	void enterLogfile_clause(@NotNull PLSQLParser.Logfile_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#logfile_clause}.
	 * @param ctx the parse tree
	 */
	void exitLogfile_clause(@NotNull PLSQLParser.Logfile_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sequence_name}.
	 * @param ctx the parse tree
	 */
	void enterSequence_name(@NotNull PLSQLParser.Sequence_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sequence_name}.
	 * @param ctx the parse tree
	 */
	void exitSequence_name(@NotNull PLSQLParser.Sequence_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#deallocate_unused_clause}.
	 * @param ctx the parse tree
	 */
	void enterDeallocate_unused_clause(@NotNull PLSQLParser.Deallocate_unused_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#deallocate_unused_clause}.
	 * @param ctx the parse tree
	 */
	void exitDeallocate_unused_clause(@NotNull PLSQLParser.Deallocate_unused_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#match_string}.
	 * @param ctx the parse tree
	 */
	void enterMatch_string(@NotNull PLSQLParser.Match_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#match_string}.
	 * @param ctx the parse tree
	 */
	void exitMatch_string(@NotNull PLSQLParser.Match_stringContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#charset}.
	 * @param ctx the parse tree
	 */
	void enterCharset(@NotNull PLSQLParser.CharsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#charset}.
	 * @param ctx the parse tree
	 */
	void exitCharset(@NotNull PLSQLParser.CharsetContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_avg}.
	 * @param ctx the parse tree
	 */
	void enterFunction_avg(@NotNull PLSQLParser.Function_avgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_avg}.
	 * @param ctx the parse tree
	 */
	void exitFunction_avg(@NotNull PLSQLParser.Function_avgContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#shutdown_dispatcher_clause}.
	 * @param ctx the parse tree
	 */
	void enterShutdown_dispatcher_clause(@NotNull PLSQLParser.Shutdown_dispatcher_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#shutdown_dispatcher_clause}.
	 * @param ctx the parse tree
	 */
	void exitShutdown_dispatcher_clause(@NotNull PLSQLParser.Shutdown_dispatcher_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#inline_ref_constraint}.
	 * @param ctx the parse tree
	 */
	void enterInline_ref_constraint(@NotNull PLSQLParser.Inline_ref_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#inline_ref_constraint}.
	 * @param ctx the parse tree
	 */
	void exitInline_ref_constraint(@NotNull PLSQLParser.Inline_ref_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_grouping_id}.
	 * @param ctx the parse tree
	 */
	void enterFunction_grouping_id(@NotNull PLSQLParser.Function_grouping_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_grouping_id}.
	 * @param ctx the parse tree
	 */
	void exitFunction_grouping_id(@NotNull PLSQLParser.Function_grouping_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#pragma}.
	 * @param ctx the parse tree
	 */
	void enterPragma(@NotNull PLSQLParser.PragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#pragma}.
	 * @param ctx the parse tree
	 */
	void exitPragma(@NotNull PLSQLParser.PragmaContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#any_types}.
	 * @param ctx the parse tree
	 */
	void enterAny_types(@NotNull PLSQLParser.Any_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#any_types}.
	 * @param ctx the parse tree
	 */
	void exitAny_types(@NotNull PLSQLParser.Any_typesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition(@NotNull PLSQLParser.Column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition(@NotNull PLSQLParser.Column_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#object_access_expression}.
	 * @param ctx the parse tree
	 */
	void enterObject_access_expression(@NotNull PLSQLParser.Object_access_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#object_access_expression}.
	 * @param ctx the parse tree
	 */
	void exitObject_access_expression(@NotNull PLSQLParser.Object_access_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#relational_table}.
	 * @param ctx the parse tree
	 */
	void enterRelational_table(@NotNull PLSQLParser.Relational_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#relational_table}.
	 * @param ctx the parse tree
	 */
	void exitRelational_table(@NotNull PLSQLParser.Relational_tableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_mv_refresh}.
	 * @param ctx the parse tree
	 */
	void enterAlter_mv_refresh(@NotNull PLSQLParser.Alter_mv_refreshContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_mv_refresh}.
	 * @param ctx the parse tree
	 */
	void exitAlter_mv_refresh(@NotNull PLSQLParser.Alter_mv_refreshContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#on_object_clause}.
	 * @param ctx the parse tree
	 */
	void enterOn_object_clause(@NotNull PLSQLParser.On_object_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#on_object_clause}.
	 * @param ctx the parse tree
	 */
	void exitOn_object_clause(@NotNull PLSQLParser.On_object_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#timeout_clause}.
	 * @param ctx the parse tree
	 */
	void enterTimeout_clause(@NotNull PLSQLParser.Timeout_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#timeout_clause}.
	 * @param ctx the parse tree
	 */
	void exitTimeout_clause(@NotNull PLSQLParser.Timeout_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(@NotNull PLSQLParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(@NotNull PLSQLParser.Type_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_to_blob}.
	 * @param ctx the parse tree
	 */
	void enterFunction_to_blob(@NotNull PLSQLParser.Function_to_blobContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_to_blob}.
	 * @param ctx the parse tree
	 */
	void exitFunction_to_blob(@NotNull PLSQLParser.Function_to_blobContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#date_types}.
	 * @param ctx the parse tree
	 */
	void enterDate_types(@NotNull PLSQLParser.Date_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#date_types}.
	 * @param ctx the parse tree
	 */
	void exitDate_types(@NotNull PLSQLParser.Date_typesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_feature_value}.
	 * @param ctx the parse tree
	 */
	void enterFunction_feature_value(@NotNull PLSQLParser.Function_feature_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_feature_value}.
	 * @param ctx the parse tree
	 */
	void exitFunction_feature_value(@NotNull PLSQLParser.Function_feature_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#checkpoint_clause}.
	 * @param ctx the parse tree
	 */
	void enterCheckpoint_clause(@NotNull PLSQLParser.Checkpoint_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#checkpoint_clause}.
	 * @param ctx the parse tree
	 */
	void exitCheckpoint_clause(@NotNull PLSQLParser.Checkpoint_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cell_assignment}.
	 * @param ctx the parse tree
	 */
	void enterCell_assignment(@NotNull PLSQLParser.Cell_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cell_assignment}.
	 * @param ctx the parse tree
	 */
	void exitCell_assignment(@NotNull PLSQLParser.Cell_assignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterSingle_column_for_loop(@NotNull PLSQLParser.Single_column_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitSingle_column_for_loop(@NotNull PLSQLParser.Single_column_for_loopContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#usergroup}.
	 * @param ctx the parse tree
	 */
	void enterUsergroup(@NotNull PLSQLParser.UsergroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#usergroup}.
	 * @param ctx the parse tree
	 */
	void exitUsergroup(@NotNull PLSQLParser.UsergroupContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#add_list_partition_clause}.
	 * @param ctx the parse tree
	 */
	void enterAdd_list_partition_clause(@NotNull PLSQLParser.Add_list_partition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#add_list_partition_clause}.
	 * @param ctx the parse tree
	 */
	void exitAdd_list_partition_clause(@NotNull PLSQLParser.Add_list_partition_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dynamic_returning_clause}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_returning_clause(@NotNull PLSQLParser.Dynamic_returning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dynamic_returning_clause}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_returning_clause(@NotNull PLSQLParser.Dynamic_returning_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_deref}.
	 * @param ctx the parse tree
	 */
	void enterFunction_deref(@NotNull PLSQLParser.Function_derefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_deref}.
	 * @param ctx the parse tree
	 */
	void exitFunction_deref(@NotNull PLSQLParser.Function_derefContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#collection}.
	 * @param ctx the parse tree
	 */
	void enterCollection(@NotNull PLSQLParser.CollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#collection}.
	 * @param ctx the parse tree
	 */
	void exitCollection(@NotNull PLSQLParser.CollectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#return_fmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_fmt(@NotNull PLSQLParser.Return_fmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#return_fmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_fmt(@NotNull PLSQLParser.Return_fmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(@NotNull PLSQLParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(@NotNull PLSQLParser.DateContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_ceil}.
	 * @param ctx the parse tree
	 */
	void enterFunction_ceil(@NotNull PLSQLParser.Function_ceilContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_ceil}.
	 * @param ctx the parse tree
	 */
	void exitFunction_ceil(@NotNull PLSQLParser.Function_ceilContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_xmltable}.
	 * @param ctx the parse tree
	 */
	void enterFunction_xmltable(@NotNull PLSQLParser.Function_xmltableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_xmltable}.
	 * @param ctx the parse tree
	 */
	void exitFunction_xmltable(@NotNull PLSQLParser.Function_xmltableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_to_yminterval}.
	 * @param ctx the parse tree
	 */
	void enterFunction_to_yminterval(@NotNull PLSQLParser.Function_to_ymintervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_to_yminterval}.
	 * @param ctx the parse tree
	 */
	void exitFunction_to_yminterval(@NotNull PLSQLParser.Function_to_ymintervalContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_sign}.
	 * @param ctx the parse tree
	 */
	void enterFunction_sign(@NotNull PLSQLParser.Function_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_sign}.
	 * @param ctx the parse tree
	 */
	void exitFunction_sign(@NotNull PLSQLParser.Function_signContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#create_procedure}.
	 * @param ctx the parse tree
	 */
	void enterCreate_procedure(@NotNull PLSQLParser.Create_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#create_procedure}.
	 * @param ctx the parse tree
	 */
	void exitCreate_procedure(@NotNull PLSQLParser.Create_procedureContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#record_type}.
	 * @param ctx the parse tree
	 */
	void enterRecord_type(@NotNull PLSQLParser.Record_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#record_type}.
	 * @param ctx the parse tree
	 */
	void exitRecord_type(@NotNull PLSQLParser.Record_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#model_iterate_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_iterate_clause(@NotNull PLSQLParser.Model_iterate_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#model_iterate_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_iterate_clause(@NotNull PLSQLParser.Model_iterate_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#lob_partitioning_clause}.
	 * @param ctx the parse tree
	 */
	void enterLob_partitioning_clause(@NotNull PLSQLParser.Lob_partitioning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#lob_partitioning_clause}.
	 * @param ctx the parse tree
	 */
	void exitLob_partitioning_clause(@NotNull PLSQLParser.Lob_partitioning_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#character_set}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_set(@NotNull PLSQLParser.Character_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#character_set}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_set(@NotNull PLSQLParser.Character_setContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_rowidtonchar}.
	 * @param ctx the parse tree
	 */
	void enterFunction_rowidtonchar(@NotNull PLSQLParser.Function_rowidtoncharContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_rowidtonchar}.
	 * @param ctx the parse tree
	 */
	void exitFunction_rowidtonchar(@NotNull PLSQLParser.Function_rowidtoncharContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#failgroup_name}.
	 * @param ctx the parse tree
	 */
	void enterFailgroup_name(@NotNull PLSQLParser.Failgroup_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#failgroup_name}.
	 * @param ctx the parse tree
	 */
	void exitFailgroup_name(@NotNull PLSQLParser.Failgroup_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#model_function}.
	 * @param ctx the parse tree
	 */
	void enterModel_function(@NotNull PLSQLParser.Model_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#model_function}.
	 * @param ctx the parse tree
	 */
	void exitModel_function(@NotNull PLSQLParser.Model_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#upgrade_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterUpgrade_table_clause(@NotNull PLSQLParser.Upgrade_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#upgrade_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitUpgrade_table_clause(@NotNull PLSQLParser.Upgrade_table_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#numeric_file_name}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_file_name(@NotNull PLSQLParser.Numeric_file_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#numeric_file_name}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_file_name(@NotNull PLSQLParser.Numeric_file_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xml_table_column}.
	 * @param ctx the parse tree
	 */
	void enterXml_table_column(@NotNull PLSQLParser.Xml_table_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xml_table_column}.
	 * @param ctx the parse tree
	 */
	void exitXml_table_column(@NotNull PLSQLParser.Xml_table_columnContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#for_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop_statement(@NotNull PLSQLParser.For_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#for_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop_statement(@NotNull PLSQLParser.For_loop_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#userenv_parameter}.
	 * @param ctx the parse tree
	 */
	void enterUserenv_parameter(@NotNull PLSQLParser.Userenv_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#userenv_parameter}.
	 * @param ctx the parse tree
	 */
	void exitUserenv_parameter(@NotNull PLSQLParser.Userenv_parameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(@NotNull PLSQLParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(@NotNull PLSQLParser.FieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#still_image_object_types}.
	 * @param ctx the parse tree
	 */
	void enterStill_image_object_types(@NotNull PLSQLParser.Still_image_object_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#still_image_object_types}.
	 * @param ctx the parse tree
	 */
	void exitStill_image_object_types(@NotNull PLSQLParser.Still_image_object_typesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_lead}.
	 * @param ctx the parse tree
	 */
	void enterFunction_lead(@NotNull PLSQLParser.Function_leadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_lead}.
	 * @param ctx the parse tree
	 */
	void exitFunction_lead(@NotNull PLSQLParser.Function_leadContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#single_table_insert}.
	 * @param ctx the parse tree
	 */
	void enterSingle_table_insert(@NotNull PLSQLParser.Single_table_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#single_table_insert}.
	 * @param ctx the parse tree
	 */
	void exitSingle_table_insert(@NotNull PLSQLParser.Single_table_insertContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_updatexml}.
	 * @param ctx the parse tree
	 */
	void enterFunction_updatexml(@NotNull PLSQLParser.Function_updatexmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_updatexml}.
	 * @param ctx the parse tree
	 */
	void exitFunction_updatexml(@NotNull PLSQLParser.Function_updatexmlContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(@NotNull PLSQLParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(@NotNull PLSQLParser.PatternContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#repeat_interval}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_interval(@NotNull PLSQLParser.Repeat_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#repeat_interval}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_interval(@NotNull PLSQLParser.Repeat_intervalContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_to_dsinterval}.
	 * @param ctx the parse tree
	 */
	void enterFunction_to_dsinterval(@NotNull PLSQLParser.Function_to_dsintervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_to_dsinterval}.
	 * @param ctx the parse tree
	 */
	void exitFunction_to_dsinterval(@NotNull PLSQLParser.Function_to_dsintervalContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull PLSQLParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull PLSQLParser.StringContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#collection_item}.
	 * @param ctx the parse tree
	 */
	void enterCollection_item(@NotNull PLSQLParser.Collection_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#collection_item}.
	 * @param ctx the parse tree
	 */
	void exitCollection_item(@NotNull PLSQLParser.Collection_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#negative_integer}.
	 * @param ctx the parse tree
	 */
	void enterNegative_integer(@NotNull PLSQLParser.Negative_integerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#negative_integer}.
	 * @param ctx the parse tree
	 */
	void exitNegative_integer(@NotNull PLSQLParser.Negative_integerContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#forall_statement}.
	 * @param ctx the parse tree
	 */
	void enterForall_statement(@NotNull PLSQLParser.Forall_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#forall_statement}.
	 * @param ctx the parse tree
	 */
	void exitForall_statement(@NotNull PLSQLParser.Forall_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#part}.
	 * @param ctx the parse tree
	 */
	void enterPart(@NotNull PLSQLParser.PartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#part}.
	 * @param ctx the parse tree
	 */
	void exitPart(@NotNull PLSQLParser.PartContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull PLSQLParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull PLSQLParser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#subpartition_by_range}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition_by_range(@NotNull PLSQLParser.Subpartition_by_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#subpartition_by_range}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition_by_range(@NotNull PLSQLParser.Subpartition_by_rangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#set_time_zone_clause}.
	 * @param ctx the parse tree
	 */
	void enterSet_time_zone_clause(@NotNull PLSQLParser.Set_time_zone_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#set_time_zone_clause}.
	 * @param ctx the parse tree
	 */
	void exitSet_time_zone_clause(@NotNull PLSQLParser.Set_time_zone_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#submultiset_condition}.
	 * @param ctx the parse tree
	 */
	void enterSubmultiset_condition(@NotNull PLSQLParser.Submultiset_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#submultiset_condition}.
	 * @param ctx the parse tree
	 */
	void exitSubmultiset_condition(@NotNull PLSQLParser.Submultiset_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#streaming_clause}.
	 * @param ctx the parse tree
	 */
	void enterStreaming_clause(@NotNull PLSQLParser.Streaming_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#streaming_clause}.
	 * @param ctx the parse tree
	 */
	void exitStreaming_clause(@NotNull PLSQLParser.Streaming_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#inline_constraint}.
	 * @param ctx the parse tree
	 */
	void enterInline_constraint(@NotNull PLSQLParser.Inline_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#inline_constraint}.
	 * @param ctx the parse tree
	 */
	void exitInline_constraint(@NotNull PLSQLParser.Inline_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#domain_index_clause}.
	 * @param ctx the parse tree
	 */
	void enterDomain_index_clause(@NotNull PLSQLParser.Domain_index_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#domain_index_clause}.
	 * @param ctx the parse tree
	 */
	void exitDomain_index_clause(@NotNull PLSQLParser.Domain_index_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#non_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterNon_dml_trigger(@NotNull PLSQLParser.Non_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#non_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitNon_dml_trigger(@NotNull PLSQLParser.Non_dml_triggerContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#child_level}.
	 * @param ctx the parse tree
	 */
	void enterChild_level(@NotNull PLSQLParser.Child_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#child_level}.
	 * @param ctx the parse tree
	 */
	void exitChild_level(@NotNull PLSQLParser.Child_levelContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#condition_without_logical_compound}.
	 * @param ctx the parse tree
	 */
	void enterCondition_without_logical_compound(@NotNull PLSQLParser.Condition_without_logical_compoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#condition_without_logical_compound}.
	 * @param ctx the parse tree
	 */
	void exitCondition_without_logical_compound(@NotNull PLSQLParser.Condition_without_logical_compoundContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_sessiontimezone}.
	 * @param ctx the parse tree
	 */
	void enterFunction_sessiontimezone(@NotNull PLSQLParser.Function_sessiontimezoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_sessiontimezone}.
	 * @param ctx the parse tree
	 */
	void exitFunction_sessiontimezone(@NotNull PLSQLParser.Function_sessiontimezoneContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#datetime_expression}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_expression(@NotNull PLSQLParser.Datetime_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#datetime_expression}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_expression(@NotNull PLSQLParser.Datetime_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_declaration(@NotNull PLSQLParser.Constructor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_declaration(@NotNull PLSQLParser.Constructor_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#rowid_datatypes}.
	 * @param ctx the parse tree
	 */
	void enterRowid_datatypes(@NotNull PLSQLParser.Rowid_datatypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#rowid_datatypes}.
	 * @param ctx the parse tree
	 */
	void exitRowid_datatypes(@NotNull PLSQLParser.Rowid_datatypesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#table_index_clause}.
	 * @param ctx the parse tree
	 */
	void enterTable_index_clause(@NotNull PLSQLParser.Table_index_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#table_index_clause}.
	 * @param ctx the parse tree
	 */
	void exitTable_index_clause(@NotNull PLSQLParser.Table_index_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#permanent_tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void enterPermanent_tablespace_clause(@NotNull PLSQLParser.Permanent_tablespace_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#permanent_tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void exitPermanent_tablespace_clause(@NotNull PLSQLParser.Permanent_tablespace_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#enable_disable_volume}.
	 * @param ctx the parse tree
	 */
	void enterEnable_disable_volume(@NotNull PLSQLParser.Enable_disable_volumeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#enable_disable_volume}.
	 * @param ctx the parse tree
	 */
	void exitEnable_disable_volume(@NotNull PLSQLParser.Enable_disable_volumeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(@NotNull PLSQLParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(@NotNull PLSQLParser.Function_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(@NotNull PLSQLParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(@NotNull PLSQLParser.IndexContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#physical_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void enterPhysical_attributes_clause(@NotNull PLSQLParser.Physical_attributes_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#physical_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void exitPhysical_attributes_clause(@NotNull PLSQLParser.Physical_attributes_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#mv_log_augmentation}.
	 * @param ctx the parse tree
	 */
	void enterMv_log_augmentation(@NotNull PLSQLParser.Mv_log_augmentationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#mv_log_augmentation}.
	 * @param ctx the parse tree
	 */
	void exitMv_log_augmentation(@NotNull PLSQLParser.Mv_log_augmentationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dblink_name}.
	 * @param ctx the parse tree
	 */
	void enterDblink_name(@NotNull PLSQLParser.Dblink_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dblink_name}.
	 * @param ctx the parse tree
	 */
	void exitDblink_name(@NotNull PLSQLParser.Dblink_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#expr_without_compound_datetime_scalar}.
	 * @param ctx the parse tree
	 */
	void enterExpr_without_compound_datetime_scalar(@NotNull PLSQLParser.Expr_without_compound_datetime_scalarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#expr_without_compound_datetime_scalar}.
	 * @param ctx the parse tree
	 */
	void exitExpr_without_compound_datetime_scalar(@NotNull PLSQLParser.Expr_without_compound_datetime_scalarContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#file_type_tag}.
	 * @param ctx the parse tree
	 */
	void enterFile_type_tag(@NotNull PLSQLParser.File_type_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#file_type_tag}.
	 * @param ctx the parse tree
	 */
	void exitFile_type_tag(@NotNull PLSQLParser.File_type_tagContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_to_binary_double}.
	 * @param ctx the parse tree
	 */
	void enterFunction_to_binary_double(@NotNull PLSQLParser.Function_to_binary_doubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_to_binary_double}.
	 * @param ctx the parse tree
	 */
	void exitFunction_to_binary_double(@NotNull PLSQLParser.Function_to_binary_doubleContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xml_passing_clause}.
	 * @param ctx the parse tree
	 */
	void enterXml_passing_clause(@NotNull PLSQLParser.Xml_passing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xml_passing_clause}.
	 * @param ctx the parse tree
	 */
	void exitXml_passing_clause(@NotNull PLSQLParser.Xml_passing_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_regexp_replace}.
	 * @param ctx the parse tree
	 */
	void enterFunction_regexp_replace(@NotNull PLSQLParser.Function_regexp_replaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_regexp_replace}.
	 * @param ctx the parse tree
	 */
	void exitFunction_regexp_replace(@NotNull PLSQLParser.Function_regexp_replaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#out_of_line_ref_constraint}.
	 * @param ctx the parse tree
	 */
	void enterOut_of_line_ref_constraint(@NotNull PLSQLParser.Out_of_line_ref_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#out_of_line_ref_constraint}.
	 * @param ctx the parse tree
	 */
	void exitOut_of_line_ref_constraint(@NotNull PLSQLParser.Out_of_line_ref_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_numtoyminterval}.
	 * @param ctx the parse tree
	 */
	void enterFunction_numtoyminterval(@NotNull PLSQLParser.Function_numtoymintervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_numtoyminterval}.
	 * @param ctx the parse tree
	 */
	void exitFunction_numtoyminterval(@NotNull PLSQLParser.Function_numtoymintervalContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#declare_section2}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_section2(@NotNull PLSQLParser.Declare_section2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#declare_section2}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_section2(@NotNull PLSQLParser.Declare_section2Context ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(@NotNull PLSQLParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(@NotNull PLSQLParser.SizeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_first}.
	 * @param ctx the parse tree
	 */
	void enterFunction_first(@NotNull PLSQLParser.Function_firstContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_first}.
	 * @param ctx the parse tree
	 */
	void exitFunction_first(@NotNull PLSQLParser.Function_firstContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause(@NotNull PLSQLParser.Pivot_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause(@NotNull PLSQLParser.Pivot_in_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#data_mining_function}.
	 * @param ctx the parse tree
	 */
	void enterData_mining_function(@NotNull PLSQLParser.Data_mining_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#data_mining_function}.
	 * @param ctx the parse tree
	 */
	void exitData_mining_function(@NotNull PLSQLParser.Data_mining_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#equals_path_condition}.
	 * @param ctx the parse tree
	 */
	void enterEquals_path_condition(@NotNull PLSQLParser.Equals_path_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#equals_path_condition}.
	 * @param ctx the parse tree
	 */
	void exitEquals_path_condition(@NotNull PLSQLParser.Equals_path_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#outer_join_type}.
	 * @param ctx the parse tree
	 */
	void enterOuter_join_type(@NotNull PLSQLParser.Outer_join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#outer_join_type}.
	 * @param ctx the parse tree
	 */
	void exitOuter_join_type(@NotNull PLSQLParser.Outer_join_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#close_statement}.
	 * @param ctx the parse tree
	 */
	void enterClose_statement(@NotNull PLSQLParser.Close_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#close_statement}.
	 * @param ctx the parse tree
	 */
	void exitClose_statement(@NotNull PLSQLParser.Close_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#on_list_partitioned_table}.
	 * @param ctx the parse tree
	 */
	void enterOn_list_partitioned_table(@NotNull PLSQLParser.On_list_partitioned_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#on_list_partitioned_table}.
	 * @param ctx the parse tree
	 */
	void exitOn_list_partitioned_table(@NotNull PLSQLParser.On_list_partitioned_tableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sql_delete}.
	 * @param ctx the parse tree
	 */
	void enterSql_delete(@NotNull PLSQLParser.Sql_deleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sql_delete}.
	 * @param ctx the parse tree
	 */
	void exitSql_delete(@NotNull PLSQLParser.Sql_deleteContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_spec}.
	 * @param ctx the parse tree
	 */
	void enterFunction_spec(@NotNull PLSQLParser.Function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_spec}.
	 * @param ctx the parse tree
	 */
	void exitFunction_spec(@NotNull PLSQLParser.Function_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#main_model}.
	 * @param ctx the parse tree
	 */
	void enterMain_model(@NotNull PLSQLParser.Main_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#main_model}.
	 * @param ctx the parse tree
	 */
	void exitMain_model(@NotNull PLSQLParser.Main_modelContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#character_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_set_clause(@NotNull PLSQLParser.Character_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#character_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_set_clause(@NotNull PLSQLParser.Character_set_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#array_dml_clause}.
	 * @param ctx the parse tree
	 */
	void enterArray_dml_clause(@NotNull PLSQLParser.Array_dml_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#array_dml_clause}.
	 * @param ctx the parse tree
	 */
	void exitArray_dml_clause(@NotNull PLSQLParser.Array_dml_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(@NotNull PLSQLParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(@NotNull PLSQLParser.ResultContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(@NotNull PLSQLParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(@NotNull PLSQLParser.ModelContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#implementation_clause}.
	 * @param ctx the parse tree
	 */
	void enterImplementation_clause(@NotNull PLSQLParser.Implementation_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#implementation_clause}.
	 * @param ctx the parse tree
	 */
	void exitImplementation_clause(@NotNull PLSQLParser.Implementation_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_xmldiff}.
	 * @param ctx the parse tree
	 */
	void enterFunction_xmldiff(@NotNull PLSQLParser.Function_xmldiffContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_xmldiff}.
	 * @param ctx the parse tree
	 */
	void exitFunction_xmldiff(@NotNull PLSQLParser.Function_xmldiffContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#varray_storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterVarray_storage_clause(@NotNull PLSQLParser.Varray_storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#varray_storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitVarray_storage_clause(@NotNull PLSQLParser.Varray_storage_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#add_table_partition}.
	 * @param ctx the parse tree
	 */
	void enterAdd_table_partition(@NotNull PLSQLParser.Add_table_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#add_table_partition}.
	 * @param ctx the parse tree
	 */
	void exitAdd_table_partition(@NotNull PLSQLParser.Add_table_partitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#supertype}.
	 * @param ctx the parse tree
	 */
	void enterSupertype(@NotNull PLSQLParser.SupertypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#supertype}.
	 * @param ctx the parse tree
	 */
	void exitSupertype(@NotNull PLSQLParser.SupertypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_tz_offset}.
	 * @param ctx the parse tree
	 */
	void enterFunction_tz_offset(@NotNull PLSQLParser.Function_tz_offsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_tz_offset}.
	 * @param ctx the parse tree
	 */
	void exitFunction_tz_offset(@NotNull PLSQLParser.Function_tz_offsetContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dependent_tables_clause}.
	 * @param ctx the parse tree
	 */
	void enterDependent_tables_clause(@NotNull PLSQLParser.Dependent_tables_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dependent_tables_clause}.
	 * @param ctx the parse tree
	 */
	void exitDependent_tables_clause(@NotNull PLSQLParser.Dependent_tables_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_extract_xml}.
	 * @param ctx the parse tree
	 */
	void enterFunction_extract_xml(@NotNull PLSQLParser.Function_extract_xmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_extract_xml}.
	 * @param ctx the parse tree
	 */
	void exitFunction_extract_xml(@NotNull PLSQLParser.Function_extract_xmlContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_xmlpi}.
	 * @param ctx the parse tree
	 */
	void enterFunction_xmlpi(@NotNull PLSQLParser.Function_xmlpiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_xmlpi}.
	 * @param ctx the parse tree
	 */
	void exitFunction_xmlpi(@NotNull PLSQLParser.Function_xmlpiContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#nested_item}.
	 * @param ctx the parse tree
	 */
	void enterNested_item(@NotNull PLSQLParser.Nested_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#nested_item}.
	 * @param ctx the parse tree
	 */
	void exitNested_item(@NotNull PLSQLParser.Nested_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_reftohex}.
	 * @param ctx the parse tree
	 */
	void enterFunction_reftohex(@NotNull PLSQLParser.Function_reftohexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_reftohex}.
	 * @param ctx the parse tree
	 */
	void exitFunction_reftohex(@NotNull PLSQLParser.Function_reftohexContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_tanh}.
	 * @param ctx the parse tree
	 */
	void enterFunction_tanh(@NotNull PLSQLParser.Function_tanhContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_tanh}.
	 * @param ctx the parse tree
	 */
	void exitFunction_tanh(@NotNull PLSQLParser.Function_tanhContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#partial_database_recovery}.
	 * @param ctx the parse tree
	 */
	void enterPartial_database_recovery(@NotNull PLSQLParser.Partial_database_recoveryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#partial_database_recovery}.
	 * @param ctx the parse tree
	 */
	void exitPartial_database_recovery(@NotNull PLSQLParser.Partial_database_recoveryContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_prediction_probability}.
	 * @param ctx the parse tree
	 */
	void enterFunction_prediction_probability(@NotNull PLSQLParser.Function_prediction_probabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_prediction_probability}.
	 * @param ctx the parse tree
	 */
	void exitFunction_prediction_probability(@NotNull PLSQLParser.Function_prediction_probabilityContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sqlj_object_type_sig}.
	 * @param ctx the parse tree
	 */
	void enterSqlj_object_type_sig(@NotNull PLSQLParser.Sqlj_object_type_sigContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sqlj_object_type_sig}.
	 * @param ctx the parse tree
	 */
	void exitSqlj_object_type_sig(@NotNull PLSQLParser.Sqlj_object_type_sigContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#path_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterPath_table_clause(@NotNull PLSQLParser.Path_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#path_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitPath_table_clause(@NotNull PLSQLParser.Path_table_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_deletexml}.
	 * @param ctx the parse tree
	 */
	void enterFunction_deletexml(@NotNull PLSQLParser.Function_deletexmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_deletexml}.
	 * @param ctx the parse tree
	 */
	void exitFunction_deletexml(@NotNull PLSQLParser.Function_deletexmlContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_expression(@NotNull PLSQLParser.Boolean_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_expression(@NotNull PLSQLParser.Boolean_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#coalesce_index_partition}.
	 * @param ctx the parse tree
	 */
	void enterCoalesce_index_partition(@NotNull PLSQLParser.Coalesce_index_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#coalesce_index_partition}.
	 * @param ctx the parse tree
	 */
	void exitCoalesce_index_partition(@NotNull PLSQLParser.Coalesce_index_partitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#exists_condition}.
	 * @param ctx the parse tree
	 */
	void enterExists_condition(@NotNull PLSQLParser.Exists_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#exists_condition}.
	 * @param ctx the parse tree
	 */
	void exitExists_condition(@NotNull PLSQLParser.Exists_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_stats_mode}.
	 * @param ctx the parse tree
	 */
	void enterFunction_stats_mode(@NotNull PLSQLParser.Function_stats_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_stats_mode}.
	 * @param ctx the parse tree
	 */
	void exitFunction_stats_mode(@NotNull PLSQLParser.Function_stats_modeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#proc_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void enterProc_decl_in_type(@NotNull PLSQLParser.Proc_decl_in_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#proc_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void exitProc_decl_in_type(@NotNull PLSQLParser.Proc_decl_in_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#lob_deduplicate_clause}.
	 * @param ctx the parse tree
	 */
	void enterLob_deduplicate_clause(@NotNull PLSQLParser.Lob_deduplicate_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#lob_deduplicate_clause}.
	 * @param ctx the parse tree
	 */
	void exitLob_deduplicate_clause(@NotNull PLSQLParser.Lob_deduplicate_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dimension_column}.
	 * @param ctx the parse tree
	 */
	void enterDimension_column(@NotNull PLSQLParser.Dimension_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dimension_column}.
	 * @param ctx the parse tree
	 */
	void exitDimension_column(@NotNull PLSQLParser.Dimension_columnContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#add_range_subpartition}.
	 * @param ctx the parse tree
	 */
	void enterAdd_range_subpartition(@NotNull PLSQLParser.Add_range_subpartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#add_range_subpartition}.
	 * @param ctx the parse tree
	 */
	void exitAdd_range_subpartition(@NotNull PLSQLParser.Add_range_subpartitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cell_reference_options}.
	 * @param ctx the parse tree
	 */
	void enterCell_reference_options(@NotNull PLSQLParser.Cell_reference_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cell_reference_options}.
	 * @param ctx the parse tree
	 */
	void exitCell_reference_options(@NotNull PLSQLParser.Cell_reference_optionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_mod}.
	 * @param ctx the parse tree
	 */
	void enterFunction_mod(@NotNull PLSQLParser.Function_modContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_mod}.
	 * @param ctx the parse tree
	 */
	void exitFunction_mod(@NotNull PLSQLParser.Function_modContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#object_name}.
	 * @param ctx the parse tree
	 */
	void enterObject_name(@NotNull PLSQLParser.Object_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#object_name}.
	 * @param ctx the parse tree
	 */
	void exitObject_name(@NotNull PLSQLParser.Object_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_powermultiset}.
	 * @param ctx the parse tree
	 */
	void enterFunction_powermultiset(@NotNull PLSQLParser.Function_powermultisetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_powermultiset}.
	 * @param ctx the parse tree
	 */
	void exitFunction_powermultiset(@NotNull PLSQLParser.Function_powermultisetContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#java_ext_name}.
	 * @param ctx the parse tree
	 */
	void enterJava_ext_name(@NotNull PLSQLParser.Java_ext_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#java_ext_name}.
	 * @param ctx the parse tree
	 */
	void exitJava_ext_name(@NotNull PLSQLParser.Java_ext_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#flashback_archive_quota}.
	 * @param ctx the parse tree
	 */
	void enterFlashback_archive_quota(@NotNull PLSQLParser.Flashback_archive_quotaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#flashback_archive_quota}.
	 * @param ctx the parse tree
	 */
	void exitFlashback_archive_quota(@NotNull PLSQLParser.Flashback_archive_quotaContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_sys_connect_by_path}.
	 * @param ctx the parse tree
	 */
	void enterFunction_sys_connect_by_path(@NotNull PLSQLParser.Function_sys_connect_by_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_sys_connect_by_path}.
	 * @param ctx the parse tree
	 */
	void exitFunction_sys_connect_by_path(@NotNull PLSQLParser.Function_sys_connect_by_pathContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#set_parameter_clause}.
	 * @param ctx the parse tree
	 */
	void enterSet_parameter_clause(@NotNull PLSQLParser.Set_parameter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#set_parameter_clause}.
	 * @param ctx the parse tree
	 */
	void exitSet_parameter_clause(@NotNull PLSQLParser.Set_parameter_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursor}.
	 * @param ctx the parse tree
	 */
	void enterCursor(@NotNull PLSQLParser.CursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursor}.
	 * @param ctx the parse tree
	 */
	void exitCursor(@NotNull PLSQLParser.CursorContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#flashback_archive}.
	 * @param ctx the parse tree
	 */
	void enterFlashback_archive(@NotNull PLSQLParser.Flashback_archiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#flashback_archive}.
	 * @param ctx the parse tree
	 */
	void exitFlashback_archive(@NotNull PLSQLParser.Flashback_archiveContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_xmlcolattval}.
	 * @param ctx the parse tree
	 */
	void enterFunction_xmlcolattval(@NotNull PLSQLParser.Function_xmlcolattvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_xmlcolattval}.
	 * @param ctx the parse tree
	 */
	void exitFunction_xmlcolattval(@NotNull PLSQLParser.Function_xmlcolattvalContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#superview}.
	 * @param ctx the parse tree
	 */
	void enterSuperview(@NotNull PLSQLParser.SuperviewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#superview}.
	 * @param ctx the parse tree
	 */
	void exitSuperview(@NotNull PLSQLParser.SuperviewContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#system_partitioning}.
	 * @param ctx the parse tree
	 */
	void enterSystem_partitioning(@NotNull PLSQLParser.System_partitioningContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#system_partitioning}.
	 * @param ctx the parse tree
	 */
	void exitSystem_partitioning(@NotNull PLSQLParser.System_partitioningContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 */
	void enterRollup_cube_clause(@NotNull PLSQLParser.Rollup_cube_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 */
	void exitRollup_cube_clause(@NotNull PLSQLParser.Rollup_cube_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#datetime_function}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_function(@NotNull PLSQLParser.Datetime_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#datetime_function}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_function(@NotNull PLSQLParser.Datetime_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_stats_f_test}.
	 * @param ctx the parse tree
	 */
	void enterFunction_stats_f_test(@NotNull PLSQLParser.Function_stats_f_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_stats_f_test}.
	 * @param ctx the parse tree
	 */
	void exitFunction_stats_f_test(@NotNull PLSQLParser.Function_stats_f_testContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void enterException_handler(@NotNull PLSQLParser.Exception_handlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void exitException_handler(@NotNull PLSQLParser.Exception_handlerContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#scalar_subquery_expression}.
	 * @param ctx the parse tree
	 */
	void enterScalar_subquery_expression(@NotNull PLSQLParser.Scalar_subquery_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#scalar_subquery_expression}.
	 * @param ctx the parse tree
	 */
	void exitScalar_subquery_expression(@NotNull PLSQLParser.Scalar_subquery_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#reference_partition_desc}.
	 * @param ctx the parse tree
	 */
	void enterReference_partition_desc(@NotNull PLSQLParser.Reference_partition_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#reference_partition_desc}.
	 * @param ctx the parse tree
	 */
	void exitReference_partition_desc(@NotNull PLSQLParser.Reference_partition_descContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#odci_parameters}.
	 * @param ctx the parse tree
	 */
	void enterOdci_parameters(@NotNull PLSQLParser.Odci_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#odci_parameters}.
	 * @param ctx the parse tree
	 */
	void exitOdci_parameters(@NotNull PLSQLParser.Odci_parametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#object_table_substitution}.
	 * @param ctx the parse tree
	 */
	void enterObject_table_substitution(@NotNull PLSQLParser.Object_table_substitutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#object_table_substitution}.
	 * @param ctx the parse tree
	 */
	void exitObject_table_substitution(@NotNull PLSQLParser.Object_table_substitutionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void enterValue_expr(@NotNull PLSQLParser.Value_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void exitValue_expr(@NotNull PLSQLParser.Value_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#nested_table_partition_spec}.
	 * @param ctx the parse tree
	 */
	void enterNested_table_partition_spec(@NotNull PLSQLParser.Nested_table_partition_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#nested_table_partition_spec}.
	 * @param ctx the parse tree
	 */
	void exitNested_table_partition_spec(@NotNull PLSQLParser.Nested_table_partition_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#nlsparam}.
	 * @param ctx the parse tree
	 */
	void enterNlsparam(@NotNull PLSQLParser.NlsparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#nlsparam}.
	 * @param ctx the parse tree
	 */
	void exitNlsparam(@NotNull PLSQLParser.NlsparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_vsize}.
	 * @param ctx the parse tree
	 */
	void enterFunction_vsize(@NotNull PLSQLParser.Function_vsizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_vsize}.
	 * @param ctx the parse tree
	 */
	void exitFunction_vsize(@NotNull PLSQLParser.Function_vsizeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xmlnamespace_clause}.
	 * @param ctx the parse tree
	 */
	void enterXmlnamespace_clause(@NotNull PLSQLParser.Xmlnamespace_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xmlnamespace_clause}.
	 * @param ctx the parse tree
	 */
	void exitXmlnamespace_clause(@NotNull PLSQLParser.Xmlnamespace_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#async_clause}.
	 * @param ctx the parse tree
	 */
	void enterAsync_clause(@NotNull PLSQLParser.Async_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#async_clause}.
	 * @param ctx the parse tree
	 */
	void exitAsync_clause(@NotNull PLSQLParser.Async_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(@NotNull PLSQLParser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(@NotNull PLSQLParser.Goto_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#oracle_supplied_types}.
	 * @param ctx the parse tree
	 */
	void enterOracle_supplied_types(@NotNull PLSQLParser.Oracle_supplied_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#oracle_supplied_types}.
	 * @param ctx the parse tree
	 */
	void exitOracle_supplied_types(@NotNull PLSQLParser.Oracle_supplied_typesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_ascii}.
	 * @param ctx the parse tree
	 */
	void enterFunction_ascii(@NotNull PLSQLParser.Function_asciiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_ascii}.
	 * @param ctx the parse tree
	 */
	void exitFunction_ascii(@NotNull PLSQLParser.Function_asciiContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_current_timestamp}.
	 * @param ctx the parse tree
	 */
	void enterFunction_current_timestamp(@NotNull PLSQLParser.Function_current_timestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_current_timestamp}.
	 * @param ctx the parse tree
	 */
	void exitFunction_current_timestamp(@NotNull PLSQLParser.Function_current_timestampContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_trunc}.
	 * @param ctx the parse tree
	 */
	void enterFunction_trunc(@NotNull PLSQLParser.Function_truncContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_trunc}.
	 * @param ctx the parse tree
	 */
	void exitFunction_trunc(@NotNull PLSQLParser.Function_truncContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_atan}.
	 * @param ctx the parse tree
	 */
	void enterFunction_atan(@NotNull PLSQLParser.Function_atanContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_atan}.
	 * @param ctx the parse tree
	 */
	void exitFunction_atan(@NotNull PLSQLParser.Function_atanContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#date_time_interval_types}.
	 * @param ctx the parse tree
	 */
	void enterDate_time_interval_types(@NotNull PLSQLParser.Date_time_interval_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#date_time_interval_types}.
	 * @param ctx the parse tree
	 */
	void exitDate_time_interval_types(@NotNull PLSQLParser.Date_time_interval_typesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_stats_wsr_test}.
	 * @param ctx the parse tree
	 */
	void enterFunction_stats_wsr_test(@NotNull PLSQLParser.Function_stats_wsr_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_stats_wsr_test}.
	 * @param ctx the parse tree
	 */
	void exitFunction_stats_wsr_test(@NotNull PLSQLParser.Function_stats_wsr_testContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#certificate_id}.
	 * @param ctx the parse tree
	 */
	void enterCertificate_id(@NotNull PLSQLParser.Certificate_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#certificate_id}.
	 * @param ctx the parse tree
	 */
	void exitCertificate_id(@NotNull PLSQLParser.Certificate_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#time_types}.
	 * @param ctx the parse tree
	 */
	void enterTime_types(@NotNull PLSQLParser.Time_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#time_types}.
	 * @param ctx the parse tree
	 */
	void exitTime_types(@NotNull PLSQLParser.Time_typesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#modify_index_subpartition}.
	 * @param ctx the parse tree
	 */
	void enterModify_index_subpartition(@NotNull PLSQLParser.Modify_index_subpartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#modify_index_subpartition}.
	 * @param ctx the parse tree
	 */
	void exitModify_index_subpartition(@NotNull PLSQLParser.Modify_index_subpartitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#truncate_partition_subpart}.
	 * @param ctx the parse tree
	 */
	void enterTruncate_partition_subpart(@NotNull PLSQLParser.Truncate_partition_subpartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#truncate_partition_subpart}.
	 * @param ctx the parse tree
	 */
	void exitTruncate_partition_subpart(@NotNull PLSQLParser.Truncate_partition_subpartContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(@NotNull PLSQLParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(@NotNull PLSQLParser.TableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cluster_index_clause}.
	 * @param ctx the parse tree
	 */
	void enterCluster_index_clause(@NotNull PLSQLParser.Cluster_index_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cluster_index_clause}.
	 * @param ctx the parse tree
	 */
	void exitCluster_index_clause(@NotNull PLSQLParser.Cluster_index_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_prediction}.
	 * @param ctx the parse tree
	 */
	void enterFunction_prediction(@NotNull PLSQLParser.Function_predictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_prediction}.
	 * @param ctx the parse tree
	 */
	void exitFunction_prediction(@NotNull PLSQLParser.Function_predictionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#drop_table_partition}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_partition(@NotNull PLSQLParser.Drop_table_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#drop_table_partition}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_partition(@NotNull PLSQLParser.Drop_table_partitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_ora_dst_convert}.
	 * @param ctx the parse tree
	 */
	void enterFunction_ora_dst_convert(@NotNull PLSQLParser.Function_ora_dst_convertContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_ora_dst_convert}.
	 * @param ctx the parse tree
	 */
	void exitFunction_ora_dst_convert(@NotNull PLSQLParser.Function_ora_dst_convertContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#enable_disable_clause}.
	 * @param ctx the parse tree
	 */
	void enterEnable_disable_clause(@NotNull PLSQLParser.Enable_disable_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#enable_disable_clause}.
	 * @param ctx the parse tree
	 */
	void exitEnable_disable_clause(@NotNull PLSQLParser.Enable_disable_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#record}.
	 * @param ctx the parse tree
	 */
	void enterRecord(@NotNull PLSQLParser.RecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#record}.
	 * @param ctx the parse tree
	 */
	void exitRecord(@NotNull PLSQLParser.RecordContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#commit_switchover_clause}.
	 * @param ctx the parse tree
	 */
	void enterCommit_switchover_clause(@NotNull PLSQLParser.Commit_switchover_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#commit_switchover_clause}.
	 * @param ctx the parse tree
	 */
	void exitCommit_switchover_clause(@NotNull PLSQLParser.Commit_switchover_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_system_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_system_set_clause(@NotNull PLSQLParser.Alter_system_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_system_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_system_set_clause(@NotNull PLSQLParser.Alter_system_set_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#using_index_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_index_clause(@NotNull PLSQLParser.Using_index_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#using_index_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_index_clause(@NotNull PLSQLParser.Using_index_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cube}.
	 * @param ctx the parse tree
	 */
	void enterCube(@NotNull PLSQLParser.CubeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cube}.
	 * @param ctx the parse tree
	 */
	void exitCube(@NotNull PLSQLParser.CubeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#hierarchical_function}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_function(@NotNull PLSQLParser.Hierarchical_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#hierarchical_function}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_function(@NotNull PLSQLParser.Hierarchical_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(@NotNull PLSQLParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(@NotNull PLSQLParser.Trigger_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#simple_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterSimple_dml_trigger(@NotNull PLSQLParser.Simple_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#simple_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitSimple_dml_trigger(@NotNull PLSQLParser.Simple_dml_triggerContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#position}.
	 * @param ctx the parse tree
	 */
	void enterPosition(@NotNull PLSQLParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#position}.
	 * @param ctx the parse tree
	 */
	void exitPosition(@NotNull PLSQLParser.PositionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sql_insert}.
	 * @param ctx the parse tree
	 */
	void enterSql_insert(@NotNull PLSQLParser.Sql_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sql_insert}.
	 * @param ctx the parse tree
	 */
	void exitSql_insert(@NotNull PLSQLParser.Sql_insertContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#assignment_statement_target}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement_target(@NotNull PLSQLParser.Assignment_statement_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#assignment_statement_target}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement_target(@NotNull PLSQLParser.Assignment_statement_targetContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#positive_integer}.
	 * @param ctx the parse tree
	 */
	void enterPositive_integer(@NotNull PLSQLParser.Positive_integerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#positive_integer}.
	 * @param ctx the parse tree
	 */
	void exitPositive_integer(@NotNull PLSQLParser.Positive_integerContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_depth}.
	 * @param ctx the parse tree
	 */
	void enterFunction_depth(@NotNull PLSQLParser.Function_depthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_depth}.
	 * @param ctx the parse tree
	 */
	void exitFunction_depth(@NotNull PLSQLParser.Function_depthContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#fmt}.
	 * @param ctx the parse tree
	 */
	void enterFmt(@NotNull PLSQLParser.FmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#fmt}.
	 * @param ctx the parse tree
	 */
	void exitFmt(@NotNull PLSQLParser.FmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull PLSQLParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull PLSQLParser.If_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_systimestamp}.
	 * @param ctx the parse tree
	 */
	void enterFunction_systimestamp(@NotNull PLSQLParser.Function_systimestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_systimestamp}.
	 * @param ctx the parse tree
	 */
	void exitFunction_systimestamp(@NotNull PLSQLParser.Function_systimestampContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(@NotNull PLSQLParser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(@NotNull PLSQLParser.Class_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_external_table}.
	 * @param ctx the parse tree
	 */
	void enterAlter_external_table(@NotNull PLSQLParser.Alter_external_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_external_table}.
	 * @param ctx the parse tree
	 */
	void exitAlter_external_table(@NotNull PLSQLParser.Alter_external_tableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#external_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterExternal_table_clause(@NotNull PLSQLParser.External_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#external_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitExternal_table_clause(@NotNull PLSQLParser.External_table_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#tablespace_name}.
	 * @param ctx the parse tree
	 */
	void enterTablespace_name(@NotNull PLSQLParser.Tablespace_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#tablespace_name}.
	 * @param ctx the parse tree
	 */
	void exitTablespace_name(@NotNull PLSQLParser.Tablespace_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#leading_precision}.
	 * @param ctx the parse tree
	 */
	void enterLeading_precision(@NotNull PLSQLParser.Leading_precisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#leading_precision}.
	 * @param ctx the parse tree
	 */
	void exitLeading_precision(@NotNull PLSQLParser.Leading_precisionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#drop_disk_clause}.
	 * @param ctx the parse tree
	 */
	void enterDrop_disk_clause(@NotNull PLSQLParser.Drop_disk_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#drop_disk_clause}.
	 * @param ctx the parse tree
	 */
	void exitDrop_disk_clause(@NotNull PLSQLParser.Drop_disk_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#rolling_migration_clauses}.
	 * @param ctx the parse tree
	 */
	void enterRolling_migration_clauses(@NotNull PLSQLParser.Rolling_migration_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#rolling_migration_clauses}.
	 * @param ctx the parse tree
	 */
	void exitRolling_migration_clauses(@NotNull PLSQLParser.Rolling_migration_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(@NotNull PLSQLParser.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(@NotNull PLSQLParser.Simple_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#single_row_function}.
	 * @param ctx the parse tree
	 */
	void enterSingle_row_function(@NotNull PLSQLParser.Single_row_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#single_row_function}.
	 * @param ctx the parse tree
	 */
	void exitSingle_row_function(@NotNull PLSQLParser.Single_row_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(@NotNull PLSQLParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(@NotNull PLSQLParser.LengthContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#range_partition_desc}.
	 * @param ctx the parse tree
	 */
	void enterRange_partition_desc(@NotNull PLSQLParser.Range_partition_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#range_partition_desc}.
	 * @param ctx the parse tree
	 */
	void exitRange_partition_desc(@NotNull PLSQLParser.Range_partition_descContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#host_cursor_variable}.
	 * @param ctx the parse tree
	 */
	void enterHost_cursor_variable(@NotNull PLSQLParser.Host_cursor_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#host_cursor_variable}.
	 * @param ctx the parse tree
	 */
	void exitHost_cursor_variable(@NotNull PLSQLParser.Host_cursor_variableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_datetime_expr}.
	 * @param ctx the parse tree
	 */
	void enterFunction_datetime_expr(@NotNull PLSQLParser.Function_datetime_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_datetime_expr}.
	 * @param ctx the parse tree
	 */
	void exitFunction_datetime_expr(@NotNull PLSQLParser.Function_datetime_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#database_event}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_event(@NotNull PLSQLParser.Database_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#database_event}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_event(@NotNull PLSQLParser.Database_eventContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(@NotNull PLSQLParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(@NotNull PLSQLParser.Return_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#trigger}.
	 * @param ctx the parse tree
	 */
	void enterTrigger(@NotNull PLSQLParser.TriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#trigger}.
	 * @param ctx the parse tree
	 */
	void exitTrigger(@NotNull PLSQLParser.TriggerContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#grant_object_privileges}.
	 * @param ctx the parse tree
	 */
	void enterGrant_object_privileges(@NotNull PLSQLParser.Grant_object_privilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#grant_object_privileges}.
	 * @param ctx the parse tree
	 */
	void exitGrant_object_privileges(@NotNull PLSQLParser.Grant_object_privilegesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_sum}.
	 * @param ctx the parse tree
	 */
	void enterFunction_sum(@NotNull PLSQLParser.Function_sumContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_sum}.
	 * @param ctx the parse tree
	 */
	void exitFunction_sum(@NotNull PLSQLParser.Function_sumContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#server_file_name}.
	 * @param ctx the parse tree
	 */
	void enterServer_file_name(@NotNull PLSQLParser.Server_file_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#server_file_name}.
	 * @param ctx the parse tree
	 */
	void exitServer_file_name(@NotNull PLSQLParser.Server_file_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#prm_name}.
	 * @param ctx the parse tree
	 */
	void enterPrm_name(@NotNull PLSQLParser.Prm_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#prm_name}.
	 * @param ctx the parse tree
	 */
	void exitPrm_name(@NotNull PLSQLParser.Prm_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#time_zone_name}.
	 * @param ctx the parse tree
	 */
	void enterTime_zone_name(@NotNull PLSQLParser.Time_zone_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#time_zone_name}.
	 * @param ctx the parse tree
	 */
	void exitTime_zone_name(@NotNull PLSQLParser.Time_zone_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dblink}.
	 * @param ctx the parse tree
	 */
	void enterDblink(@NotNull PLSQLParser.DblinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dblink}.
	 * @param ctx the parse tree
	 */
	void exitDblink(@NotNull PLSQLParser.DblinkContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_regexp_instr}.
	 * @param ctx the parse tree
	 */
	void enterFunction_regexp_instr(@NotNull PLSQLParser.Function_regexp_instrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_regexp_instr}.
	 * @param ctx the parse tree
	 */
	void exitFunction_regexp_instr(@NotNull PLSQLParser.Function_regexp_instrContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#inline_pragma}.
	 * @param ctx the parse tree
	 */
	void enterInline_pragma(@NotNull PLSQLParser.Inline_pragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#inline_pragma}.
	 * @param ctx the parse tree
	 */
	void exitInline_pragma(@NotNull PLSQLParser.Inline_pragmaContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#key_for_blob}.
	 * @param ctx the parse tree
	 */
	void enterKey_for_blob(@NotNull PLSQLParser.Key_for_blobContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#key_for_blob}.
	 * @param ctx the parse tree
	 */
	void exitKey_for_blob(@NotNull PLSQLParser.Key_for_blobContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#user_defined_types}.
	 * @param ctx the parse tree
	 */
	void enterUser_defined_types(@NotNull PLSQLParser.User_defined_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#user_defined_types}.
	 * @param ctx the parse tree
	 */
	void exitUser_defined_types(@NotNull PLSQLParser.User_defined_typesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#logical_condition}.
	 * @param ctx the parse tree
	 */
	void enterLogical_condition(@NotNull PLSQLParser.Logical_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#logical_condition}.
	 * @param ctx the parse tree
	 */
	void exitLogical_condition(@NotNull PLSQLParser.Logical_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#lob_retention_clause}.
	 * @param ctx the parse tree
	 */
	void enterLob_retention_clause(@NotNull PLSQLParser.Lob_retention_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#lob_retention_clause}.
	 * @param ctx the parse tree
	 */
	void exitLob_retention_clause(@NotNull PLSQLParser.Lob_retention_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#ddl_event}.
	 * @param ctx the parse tree
	 */
	void enterDdl_event(@NotNull PLSQLParser.Ddl_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#ddl_event}.
	 * @param ctx the parse tree
	 */
	void exitDdl_event(@NotNull PLSQLParser.Ddl_eventContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#directory}.
	 * @param ctx the parse tree
	 */
	void enterDirectory(@NotNull PLSQLParser.DirectoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#directory}.
	 * @param ctx the parse tree
	 */
	void exitDirectory(@NotNull PLSQLParser.DirectoryContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_cume_dist}.
	 * @param ctx the parse tree
	 */
	void enterFunction_cume_dist(@NotNull PLSQLParser.Function_cume_distContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_cume_dist}.
	 * @param ctx the parse tree
	 */
	void exitFunction_cume_dist(@NotNull PLSQLParser.Function_cume_distContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#pfile_name}.
	 * @param ctx the parse tree
	 */
	void enterPfile_name(@NotNull PLSQLParser.Pfile_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#pfile_name}.
	 * @param ctx the parse tree
	 */
	void exitPfile_name(@NotNull PLSQLParser.Pfile_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_user}.
	 * @param ctx the parse tree
	 */
	void enterFunction_user(@NotNull PLSQLParser.Function_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_user}.
	 * @param ctx the parse tree
	 */
	void exitFunction_user(@NotNull PLSQLParser.Function_userContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_first_value}.
	 * @param ctx the parse tree
	 */
	void enterFunction_first_value(@NotNull PLSQLParser.Function_first_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_first_value}.
	 * @param ctx the parse tree
	 */
	void exitFunction_first_value(@NotNull PLSQLParser.Function_first_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#seed_value}.
	 * @param ctx the parse tree
	 */
	void enterSeed_value(@NotNull PLSQLParser.Seed_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#seed_value}.
	 * @param ctx the parse tree
	 */
	void exitSeed_value(@NotNull PLSQLParser.Seed_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xml_types}.
	 * @param ctx the parse tree
	 */
	void enterXml_types(@NotNull PLSQLParser.Xml_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xml_types}.
	 * @param ctx the parse tree
	 */
	void exitXml_types(@NotNull PLSQLParser.Xml_typesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#auditing_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterAuditing_by_clause(@NotNull PLSQLParser.Auditing_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#auditing_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitAuditing_by_clause(@NotNull PLSQLParser.Auditing_by_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#drop_path_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterDrop_path_table_clause(@NotNull PLSQLParser.Drop_path_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#drop_path_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitDrop_path_table_clause(@NotNull PLSQLParser.Drop_path_table_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_clause(@NotNull PLSQLParser.Grouping_sets_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_clause(@NotNull PLSQLParser.Grouping_sets_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#index_org_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_org_table_clause(@NotNull PLSQLParser.Index_org_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#index_org_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_org_table_clause(@NotNull PLSQLParser.Index_org_table_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_insertxmlbefore}.
	 * @param ctx the parse tree
	 */
	void enterFunction_insertxmlbefore(@NotNull PLSQLParser.Function_insertxmlbeforeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_insertxmlbefore}.
	 * @param ctx the parse tree
	 */
	void exitFunction_insertxmlbefore(@NotNull PLSQLParser.Function_insertxmlbeforeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#nested_table}.
	 * @param ctx the parse tree
	 */
	void enterNested_table(@NotNull PLSQLParser.Nested_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#nested_table}.
	 * @param ctx the parse tree
	 */
	void exitNested_table(@NotNull PLSQLParser.Nested_tableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#row_movement_clause}.
	 * @param ctx the parse tree
	 */
	void enterRow_movement_clause(@NotNull PLSQLParser.Row_movement_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#row_movement_clause}.
	 * @param ctx the parse tree
	 */
	void exitRow_movement_clause(@NotNull PLSQLParser.Row_movement_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#pattern_matching_condition}.
	 * @param ctx the parse tree
	 */
	void enterPattern_matching_condition(@NotNull PLSQLParser.Pattern_matching_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#pattern_matching_condition}.
	 * @param ctx the parse tree
	 */
	void exitPattern_matching_condition(@NotNull PLSQLParser.Pattern_matching_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#validation_clauses}.
	 * @param ctx the parse tree
	 */
	void enterValidation_clauses(@NotNull PLSQLParser.Validation_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#validation_clauses}.
	 * @param ctx the parse tree
	 */
	void exitValidation_clauses(@NotNull PLSQLParser.Validation_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#table_partitioning_clauses}.
	 * @param ctx the parse tree
	 */
	void enterTable_partitioning_clauses(@NotNull PLSQLParser.Table_partitioning_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#table_partitioning_clauses}.
	 * @param ctx the parse tree
	 */
	void exitTable_partitioning_clauses(@NotNull PLSQLParser.Table_partitioning_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_to_date}.
	 * @param ctx the parse tree
	 */
	void enterFunction_to_date(@NotNull PLSQLParser.Function_to_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_to_date}.
	 * @param ctx the parse tree
	 */
	void exitFunction_to_date(@NotNull PLSQLParser.Function_to_dateContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cell_reference}.
	 * @param ctx the parse tree
	 */
	void enterCell_reference(@NotNull PLSQLParser.Cell_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cell_reference}.
	 * @param ctx the parse tree
	 */
	void exitCell_reference(@NotNull PLSQLParser.Cell_referenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#instance_name}.
	 * @param ctx the parse tree
	 */
	void enterInstance_name(@NotNull PLSQLParser.Instance_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#instance_name}.
	 * @param ctx the parse tree
	 */
	void exitInstance_name(@NotNull PLSQLParser.Instance_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#diskgroup_availability}.
	 * @param ctx the parse tree
	 */
	void enterDiskgroup_availability(@NotNull PLSQLParser.Diskgroup_availabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#diskgroup_availability}.
	 * @param ctx the parse tree
	 */
	void exitDiskgroup_availability(@NotNull PLSQLParser.Diskgroup_availabilityContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#range_condition}.
	 * @param ctx the parse tree
	 */
	void enterRange_condition(@NotNull PLSQLParser.Range_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#range_condition}.
	 * @param ctx the parse tree
	 */
	void exitRange_condition(@NotNull PLSQLParser.Range_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#password}.
	 * @param ctx the parse tree
	 */
	void enterPassword(@NotNull PLSQLParser.PasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#password}.
	 * @param ctx the parse tree
	 */
	void exitPassword(@NotNull PLSQLParser.PasswordContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_collect}.
	 * @param ctx the parse tree
	 */
	void enterFunction_collect(@NotNull PLSQLParser.Function_collectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_collect}.
	 * @param ctx the parse tree
	 */
	void exitFunction_collect(@NotNull PLSQLParser.Function_collectContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#drop_table_subpartition}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_subpartition(@NotNull PLSQLParser.Drop_table_subpartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#drop_table_subpartition}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_subpartition(@NotNull PLSQLParser.Drop_table_subpartitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#maximize_standby_db_clause}.
	 * @param ctx the parse tree
	 */
	void enterMaximize_standby_db_clause(@NotNull PLSQLParser.Maximize_standby_db_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#maximize_standby_db_clause}.
	 * @param ctx the parse tree
	 */
	void exitMaximize_standby_db_clause(@NotNull PLSQLParser.Maximize_standby_db_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_prediction_details}.
	 * @param ctx the parse tree
	 */
	void enterFunction_prediction_details(@NotNull PLSQLParser.Function_prediction_detailsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_prediction_details}.
	 * @param ctx the parse tree
	 */
	void exitFunction_prediction_details(@NotNull PLSQLParser.Function_prediction_detailsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_empty_blob}.
	 * @param ctx the parse tree
	 */
	void enterFunction_empty_blob(@NotNull PLSQLParser.Function_empty_blobContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_empty_blob}.
	 * @param ctx the parse tree
	 */
	void exitFunction_empty_blob(@NotNull PLSQLParser.Function_empty_blobContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_sys_dburigen}.
	 * @param ctx the parse tree
	 */
	void enterFunction_sys_dburigen(@NotNull PLSQLParser.Function_sys_dburigenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_sys_dburigen}.
	 * @param ctx the parse tree
	 */
	void exitFunction_sys_dburigen(@NotNull PLSQLParser.Function_sys_dburigenContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_floor}.
	 * @param ctx the parse tree
	 */
	void enterFunction_floor(@NotNull PLSQLParser.Function_floorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_floor}.
	 * @param ctx the parse tree
	 */
	void exitFunction_floor(@NotNull PLSQLParser.Function_floorContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#move_table_partition}.
	 * @param ctx the parse tree
	 */
	void enterMove_table_partition(@NotNull PLSQLParser.Move_table_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#move_table_partition}.
	 * @param ctx the parse tree
	 */
	void exitMove_table_partition(@NotNull PLSQLParser.Move_table_partitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#outer_join_clause}.
	 * @param ctx the parse tree
	 */
	void enterOuter_join_clause(@NotNull PLSQLParser.Outer_join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#outer_join_clause}.
	 * @param ctx the parse tree
	 */
	void exitOuter_join_clause(@NotNull PLSQLParser.Outer_join_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_width_bucket}.
	 * @param ctx the parse tree
	 */
	void enterFunction_width_bucket(@NotNull PLSQLParser.Function_width_bucketContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_width_bucket}.
	 * @param ctx the parse tree
	 */
	void exitFunction_width_bucket(@NotNull PLSQLParser.Function_width_bucketContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_index_group_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_index_group_clause(@NotNull PLSQLParser.Alter_index_group_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_index_group_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_index_group_clause(@NotNull PLSQLParser.Alter_index_group_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#user_defined_function}.
	 * @param ctx the parse tree
	 */
	void enterUser_defined_function(@NotNull PLSQLParser.User_defined_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#user_defined_function}.
	 * @param ctx the parse tree
	 */
	void exitUser_defined_function(@NotNull PLSQLParser.User_defined_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#object_privilege}.
	 * @param ctx the parse tree
	 */
	void enterObject_privilege(@NotNull PLSQLParser.Object_privilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#object_privilege}.
	 * @param ctx the parse tree
	 */
	void exitObject_privilege(@NotNull PLSQLParser.Object_privilegeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_xmlcast}.
	 * @param ctx the parse tree
	 */
	void enterFunction_xmlcast(@NotNull PLSQLParser.Function_xmlcastContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_xmlcast}.
	 * @param ctx the parse tree
	 */
	void exitFunction_xmlcast(@NotNull PLSQLParser.Function_xmlcastContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#search_string}.
	 * @param ctx the parse tree
	 */
	void enterSearch_string(@NotNull PLSQLParser.Search_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#search_string}.
	 * @param ctx the parse tree
	 */
	void exitSearch_string(@NotNull PLSQLParser.Search_stringContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#recovery_clauses}.
	 * @param ctx the parse tree
	 */
	void enterRecovery_clauses(@NotNull PLSQLParser.Recovery_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#recovery_clauses}.
	 * @param ctx the parse tree
	 */
	void exitRecovery_clauses(@NotNull PLSQLParser.Recovery_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(@NotNull PLSQLParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(@NotNull PLSQLParser.PropertyContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#multi_table_insert}.
	 * @param ctx the parse tree
	 */
	void enterMulti_table_insert(@NotNull PLSQLParser.Multi_table_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#multi_table_insert}.
	 * @param ctx the parse tree
	 */
	void exitMulti_table_insert(@NotNull PLSQLParser.Multi_table_insertContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void enterElse_clause(@NotNull PLSQLParser.Else_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void exitElse_clause(@NotNull PLSQLParser.Else_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_table_expression_clause(@NotNull PLSQLParser.Dml_table_expression_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_table_expression_clause(@NotNull PLSQLParser.Dml_table_expression_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 */
	void enterMerge_insert_clause(@NotNull PLSQLParser.Merge_insert_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 */
	void exitMerge_insert_clause(@NotNull PLSQLParser.Merge_insert_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#trace_file_clause}.
	 * @param ctx the parse tree
	 */
	void enterTrace_file_clause(@NotNull PLSQLParser.Trace_file_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#trace_file_clause}.
	 * @param ctx the parse tree
	 */
	void exitTrace_file_clause(@NotNull PLSQLParser.Trace_file_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#segment_management_clause}.
	 * @param ctx the parse tree
	 */
	void enterSegment_management_clause(@NotNull PLSQLParser.Segment_management_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#segment_management_clause}.
	 * @param ctx the parse tree
	 */
	void exitSegment_management_clause(@NotNull PLSQLParser.Segment_management_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_presentv}.
	 * @param ctx the parse tree
	 */
	void enterFunction_presentv(@NotNull PLSQLParser.Function_presentvContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_presentv}.
	 * @param ctx the parse tree
	 */
	void exitFunction_presentv(@NotNull PLSQLParser.Function_presentvContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_coalesce}.
	 * @param ctx the parse tree
	 */
	void enterFunction_coalesce(@NotNull PLSQLParser.Function_coalesceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_coalesce}.
	 * @param ctx the parse tree
	 */
	void exitFunction_coalesce(@NotNull PLSQLParser.Function_coalesceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_median}.
	 * @param ctx the parse tree
	 */
	void enterFunction_median(@NotNull PLSQLParser.Function_medianContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_median}.
	 * @param ctx the parse tree
	 */
	void exitFunction_median(@NotNull PLSQLParser.Function_medianContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_variance}.
	 * @param ctx the parse tree
	 */
	void enterFunction_variance(@NotNull PLSQLParser.Function_varianceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_variance}.
	 * @param ctx the parse tree
	 */
	void exitFunction_variance(@NotNull PLSQLParser.Function_varianceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_cosh}.
	 * @param ctx the parse tree
	 */
	void enterFunction_cosh(@NotNull PLSQLParser.Function_coshContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_cosh}.
	 * @param ctx the parse tree
	 */
	void exitFunction_cosh(@NotNull PLSQLParser.Function_coshContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#ansi_supported_datatypes}.
	 * @param ctx the parse tree
	 */
	void enterAnsi_supported_datatypes(@NotNull PLSQLParser.Ansi_supported_datatypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#ansi_supported_datatypes}.
	 * @param ctx the parse tree
	 */
	void exitAnsi_supported_datatypes(@NotNull PLSQLParser.Ansi_supported_datatypesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#data_cartridge_function}.
	 * @param ctx the parse tree
	 */
	void enterData_cartridge_function(@NotNull PLSQLParser.Data_cartridge_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#data_cartridge_function}.
	 * @param ctx the parse tree
	 */
	void exitData_cartridge_function(@NotNull PLSQLParser.Data_cartridge_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#confidence_level}.
	 * @param ctx the parse tree
	 */
	void enterConfidence_level(@NotNull PLSQLParser.Confidence_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#confidence_level}.
	 * @param ctx the parse tree
	 */
	void exitConfidence_level(@NotNull PLSQLParser.Confidence_levelContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#filenumber}.
	 * @param ctx the parse tree
	 */
	void enterFilenumber(@NotNull PLSQLParser.FilenumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#filenumber}.
	 * @param ctx the parse tree
	 */
	void exitFilenumber(@NotNull PLSQLParser.FilenumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#scoped_table_ref_constraint}.
	 * @param ctx the parse tree
	 */
	void enterScoped_table_ref_constraint(@NotNull PLSQLParser.Scoped_table_ref_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#scoped_table_ref_constraint}.
	 * @param ctx the parse tree
	 */
	void exitScoped_table_ref_constraint(@NotNull PLSQLParser.Scoped_table_ref_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_xmlpatch}.
	 * @param ctx the parse tree
	 */
	void enterFunction_xmlpatch(@NotNull PLSQLParser.Function_xmlpatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_xmlpatch}.
	 * @param ctx the parse tree
	 */
	void exitFunction_xmlpatch(@NotNull PLSQLParser.Function_xmlpatchContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_cost_matrix_clause}.
	 * @param ctx the parse tree
	 */
	void enterFunction_cost_matrix_clause(@NotNull PLSQLParser.Function_cost_matrix_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_cost_matrix_clause}.
	 * @param ctx the parse tree
	 */
	void exitFunction_cost_matrix_clause(@NotNull PLSQLParser.Function_cost_matrix_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_corr}.
	 * @param ctx the parse tree
	 */
	void enterFunction_corr(@NotNull PLSQLParser.Function_corrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_corr}.
	 * @param ctx the parse tree
	 */
	void exitFunction_corr(@NotNull PLSQLParser.Function_corrContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull PLSQLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull PLSQLParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(@NotNull PLSQLParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(@NotNull PLSQLParser.ObjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#reference_model}.
	 * @param ctx the parse tree
	 */
	void enterReference_model(@NotNull PLSQLParser.Reference_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#reference_model}.
	 * @param ctx the parse tree
	 */
	void exitReference_model(@NotNull PLSQLParser.Reference_modelContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#item_declaration}.
	 * @param ctx the parse tree
	 */
	void enterItem_declaration(@NotNull PLSQLParser.Item_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#item_declaration}.
	 * @param ctx the parse tree
	 */
	void exitItem_declaration(@NotNull PLSQLParser.Item_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#fractional_second_precision}.
	 * @param ctx the parse tree
	 */
	void enterFractional_second_precision(@NotNull PLSQLParser.Fractional_second_precisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#fractional_second_precision}.
	 * @param ctx the parse tree
	 */
	void exitFractional_second_precision(@NotNull PLSQLParser.Fractional_second_precisionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#old_alias_name}.
	 * @param ctx the parse tree
	 */
	void enterOld_alias_name(@NotNull PLSQLParser.Old_alias_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#old_alias_name}.
	 * @param ctx the parse tree
	 */
	void exitOld_alias_name(@NotNull PLSQLParser.Old_alias_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration(@NotNull PLSQLParser.Parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration(@NotNull PLSQLParser.Parameter_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 */
	void enterPartition_extension_clause(@NotNull PLSQLParser.Partition_extension_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 */
	void exitPartition_extension_clause(@NotNull PLSQLParser.Partition_extension_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull PLSQLParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull PLSQLParser.ParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_prediction_set}.
	 * @param ctx the parse tree
	 */
	void enterFunction_prediction_set(@NotNull PLSQLParser.Function_prediction_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_prediction_set}.
	 * @param ctx the parse tree
	 */
	void exitFunction_prediction_set(@NotNull PLSQLParser.Function_prediction_setContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#column_association}.
	 * @param ctx the parse tree
	 */
	void enterColumn_association(@NotNull PLSQLParser.Column_associationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#column_association}.
	 * @param ctx the parse tree
	 */
	void exitColumn_association(@NotNull PLSQLParser.Column_associationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#in_condition}.
	 * @param ctx the parse tree
	 */
	void enterIn_condition(@NotNull PLSQLParser.In_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#in_condition}.
	 * @param ctx the parse tree
	 */
	void exitIn_condition(@NotNull PLSQLParser.In_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#autoextend_clause}.
	 * @param ctx the parse tree
	 */
	void enterAutoextend_clause(@NotNull PLSQLParser.Autoextend_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#autoextend_clause}.
	 * @param ctx the parse tree
	 */
	void exitAutoextend_clause(@NotNull PLSQLParser.Autoextend_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#certificate_dn}.
	 * @param ctx the parse tree
	 */
	void enterCertificate_dn(@NotNull PLSQLParser.Certificate_dnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#certificate_dn}.
	 * @param ctx the parse tree
	 */
	void exitCertificate_dn(@NotNull PLSQLParser.Certificate_dnContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#quiesce_clauses}.
	 * @param ctx the parse tree
	 */
	void enterQuiesce_clauses(@NotNull PLSQLParser.Quiesce_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#quiesce_clauses}.
	 * @param ctx the parse tree
	 */
	void exitQuiesce_clauses(@NotNull PLSQLParser.Quiesce_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_dense_rank}.
	 * @param ctx the parse tree
	 */
	void enterFunction_dense_rank(@NotNull PLSQLParser.Function_dense_rankContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_dense_rank}.
	 * @param ctx the parse tree
	 */
	void exitFunction_dense_rank(@NotNull PLSQLParser.Function_dense_rankContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_percent_rank}.
	 * @param ctx the parse tree
	 */
	void enterFunction_percent_rank(@NotNull PLSQLParser.Function_percent_rankContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_percent_rank}.
	 * @param ctx the parse tree
	 */
	void exitFunction_percent_rank(@NotNull PLSQLParser.Function_percent_rankContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#compound_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCompound_dml_trigger(@NotNull PLSQLParser.Compound_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#compound_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCompound_dml_trigger(@NotNull PLSQLParser.Compound_dml_triggerContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#range_subpartition_desc}.
	 * @param ctx the parse tree
	 */
	void enterRange_subpartition_desc(@NotNull PLSQLParser.Range_subpartition_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#range_subpartition_desc}.
	 * @param ctx the parse tree
	 */
	void exitRange_subpartition_desc(@NotNull PLSQLParser.Range_subpartition_descContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_cos}.
	 * @param ctx the parse tree
	 */
	void enterFunction_cos(@NotNull PLSQLParser.Function_cosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_cos}.
	 * @param ctx the parse tree
	 */
	void exitFunction_cos(@NotNull PLSQLParser.Function_cosContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#default_tablespace}.
	 * @param ctx the parse tree
	 */
	void enterDefault_tablespace(@NotNull PLSQLParser.Default_tablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#default_tablespace}.
	 * @param ctx the parse tree
	 */
	void exitDefault_tablespace(@NotNull PLSQLParser.Default_tablespaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_dense_rank_analytic}.
	 * @param ctx the parse tree
	 */
	void enterFunction_dense_rank_analytic(@NotNull PLSQLParser.Function_dense_rank_analyticContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_dense_rank_analytic}.
	 * @param ctx the parse tree
	 */
	void exitFunction_dense_rank_analytic(@NotNull PLSQLParser.Function_dense_rank_analyticContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#drop_diskgroup_file_clause}.
	 * @param ctx the parse tree
	 */
	void enterDrop_diskgroup_file_clause(@NotNull PLSQLParser.Drop_diskgroup_file_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#drop_diskgroup_file_clause}.
	 * @param ctx the parse tree
	 */
	void exitDrop_diskgroup_file_clause(@NotNull PLSQLParser.Drop_diskgroup_file_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#on_range_partitioned_table}.
	 * @param ctx the parse tree
	 */
	void enterOn_range_partitioned_table(@NotNull PLSQLParser.On_range_partitioned_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#on_range_partitioned_table}.
	 * @param ctx the parse tree
	 */
	void exitOn_range_partitioned_table(@NotNull PLSQLParser.On_range_partitioned_tableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(@NotNull PLSQLParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(@NotNull PLSQLParser.SubqueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#member_condition}.
	 * @param ctx the parse tree
	 */
	void enterMember_condition(@NotNull PLSQLParser.Member_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#member_condition}.
	 * @param ctx the parse tree
	 */
	void exitMember_condition(@NotNull PLSQLParser.Member_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#varray_type_def}.
	 * @param ctx the parse tree
	 */
	void enterVarray_type_def(@NotNull PLSQLParser.Varray_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#varray_type_def}.
	 * @param ctx the parse tree
	 */
	void exitVarray_type_def(@NotNull PLSQLParser.Varray_type_defContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#index_org_overflow_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_org_overflow_clause(@NotNull PLSQLParser.Index_org_overflow_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#index_org_overflow_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_org_overflow_clause(@NotNull PLSQLParser.Index_org_overflow_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#maxsize_clause}.
	 * @param ctx the parse tree
	 */
	void enterMaxsize_clause(@NotNull PLSQLParser.Maxsize_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#maxsize_clause}.
	 * @param ctx the parse tree
	 */
	void exitMaxsize_clause(@NotNull PLSQLParser.Maxsize_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(@NotNull PLSQLParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(@NotNull PLSQLParser.FilenameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cluster}.
	 * @param ctx the parse tree
	 */
	void enterCluster(@NotNull PLSQLParser.ClusterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cluster}.
	 * @param ctx the parse tree
	 */
	void exitCluster(@NotNull PLSQLParser.ClusterContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_to_timestamp}.
	 * @param ctx the parse tree
	 */
	void enterFunction_to_timestamp(@NotNull PLSQLParser.Function_to_timestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_to_timestamp}.
	 * @param ctx the parse tree
	 */
	void exitFunction_to_timestamp(@NotNull PLSQLParser.Function_to_timestampContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursor_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCursor_variable_declaration(@NotNull PLSQLParser.Cursor_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursor_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCursor_variable_declaration(@NotNull PLSQLParser.Cursor_variable_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#rowid}.
	 * @param ctx the parse tree
	 */
	void enterRowid(@NotNull PLSQLParser.RowidContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#rowid}.
	 * @param ctx the parse tree
	 */
	void exitRowid(@NotNull PLSQLParser.RowidContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#bulk_collect_into_clause}.
	 * @param ctx the parse tree
	 */
	void enterBulk_collect_into_clause(@NotNull PLSQLParser.Bulk_collect_into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#bulk_collect_into_clause}.
	 * @param ctx the parse tree
	 */
	void exitBulk_collect_into_clause(@NotNull PLSQLParser.Bulk_collect_into_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_scn_to_timestamp}.
	 * @param ctx the parse tree
	 */
	void enterFunction_scn_to_timestamp(@NotNull PLSQLParser.Function_scn_to_timestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_scn_to_timestamp}.
	 * @param ctx the parse tree
	 */
	void exitFunction_scn_to_timestamp(@NotNull PLSQLParser.Function_scn_to_timestampContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull PLSQLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull PLSQLParser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLSQLParser#query_name}.
	 * @param ctx the parse tree
	 */
	void enterQuery_name(@NotNull PLSQLParser.Query_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#query_name}.
	 * @param ctx the parse tree
	 */
	void exitQuery_name(@NotNull PLSQLParser.Query_nameContext ctx);
}