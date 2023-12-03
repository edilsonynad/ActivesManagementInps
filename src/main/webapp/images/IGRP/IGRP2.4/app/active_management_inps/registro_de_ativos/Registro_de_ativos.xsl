<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="html" omit-xml-declaration="yes" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat"/><xsl:template match="/"><html><xsl:call-template name="igrp-page-attributes"/><head><xsl:call-template name="igrp-head"/><style/></head><body class=""><div id="layout-wrapper"><xsl:call-template name="igrp-header"/><xsl:call-template name="igrp-sidebar"/><div class="main-content"><form method="POST" class="IGRP-form page-content" name="formular_default" enctype="multipart/form-data"><div class="container-fluid"><div class="igrp-page-header"></div><div class="igrp-page-contents"><div class="row " id="row-b5098d36"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:if test="rows/content/sectionheader_1"><section class="content-header igrp-section-header gen-container-item " gen-class="" item-name="sectionheader_1"><h4 class="mb-0 disable-output-escaping h4"><xsl:value-of disable-output-escaping="yes" select="rows/content/sectionheader_1/fields/sectionheader_1_text/value"/></h4></section></xsl:if><xsl:if test="rows/content/form_1"><div class="card igrp-forms gen-container-item " gen-class="" item-name="form_1"><xsl:apply-templates mode="igrp-card-header" select="rows/content/form_1"><xsl:with-param name="show-title" select="'undefined'"/></xsl:apply-templates><div class="card-body"><div class="row g-4" role="form"><xsl:if test="rows/content/form_1/fields/nome"><div class="col-md-6 gen-fields-holder" item-name="nome" item-type="text" required="required"><xsl:apply-templates mode="igrp-form-field" select="rows/content/form_1/fields/nome"><xsl:with-param name="change" select="''"/><xsl:with-param name="declabel" select="''"/><xsl:with-param name="inputmask" select="''"/><xsl:with-param name="maxlength" select="'250'"/></xsl:apply-templates></div></xsl:if><xsl:if test="rows/content/form_1/fields/codigo"><div class="col-md-6 gen-fields-holder" item-name="codigo" item-type="text"><xsl:apply-templates mode="igrp-form-field" select="rows/content/form_1/fields/codigo"><xsl:with-param name="change" select="''"/><xsl:with-param name="declabel" select="''"/><xsl:with-param name="inputmask" select="''"/><xsl:with-param name="maxlength" select="'250'"/></xsl:apply-templates></div></xsl:if><xsl:if test="rows/content/form_1/fields/estado"><div class="col-sm-6 form-group  gen-fields-holder" item-name="estado" item-type="select"><xsl:apply-templates mode="igrp-form-select-field" select="rows/content/form_1/fields/estado"><xsl:param name="parent-id" select="'form_1'"/><xsl:param name="change" select="''"/><xsl:param name="tags" select="'false'"/><xsl:param name="maxlength" select="'250'"/><xsl:with-param name="multiple" select="'false'"/></xsl:apply-templates></div></xsl:if><xsl:if test="rows/content/form_1/fields/categoria"><div class="col-sm-6 form-group  gen-fields-holder" item-name="categoria" item-type="select"><xsl:apply-templates mode="igrp-form-select-field" select="rows/content/form_1/fields/categoria"><xsl:param name="parent-id" select="'form_1'"/><xsl:param name="change" select="''"/><xsl:param name="tags" select="'false'"/><xsl:param name="maxlength" select="'250'"/><xsl:with-param name="multiple" select="'false'"/></xsl:apply-templates></div></xsl:if><xsl:if test="rows/content/form_1/fields/garantia"><div class="form-group col-sm-6   gen-fields-holder" item-name="garantia" item-type="number"><label for="{rows/content/form_1/fields/garantia/@name}"><span><xsl:value-of select="rows/content/form_1/fields/garantia/label"/></span></label><input type="number" value="{rows/content/form_1/fields/garantia/value}" min="" max="" class="form-control  " id="{rows/content/form_1/fields/garantia/@name}" name="{rows/content/form_1/fields/garantia/@name}" maxlength="250" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/garantia"/></xsl:call-template></input></div></xsl:if></div></div><xsl:apply-templates select="rows/content/form_1/tools-bar" mode="form-buttons-2"/></div></xsl:if><xsl:if test="rows/content/sectionheader_2"><section class="content-header igrp-section-header gen-container-item " gen-class="" item-name="sectionheader_2"><h4 class="mb-0 disable-output-escaping h4"><xsl:value-of disable-output-escaping="yes" select="rows/content/sectionheader_2/fields/sectionheader_2_text/value"/></h4></section></xsl:if><xsl:if test="rows/content/buyandsell"><div class="card igrp-forms gen-container-item " gen-class="" item-name="buyandsell"><xsl:apply-templates mode="igrp-card-header" select="rows/content/buyandsell"><xsl:with-param name="show-title" select="'undefined'"/></xsl:apply-templates><div class="card-body"><div class="row g-4" role="form"><xsl:if test="rows/content/buyandsell/fields/valor_da_compra"><div class="col-md-6 gen-fields-holder" item-name="valor_da_compra" item-type="text"><xsl:apply-templates mode="igrp-form-field" select="rows/content/buyandsell/fields/valor_da_compra"><xsl:with-param name="change" select="''"/><xsl:with-param name="declabel" select="''"/><xsl:with-param name="inputmask" select="''"/><xsl:with-param name="maxlength" select="'250'"/></xsl:apply-templates></div></xsl:if><xsl:if test="rows/content/buyandsell/fields/valor_da_venda"><div class="col-md-6 gen-fields-holder" item-name="valor_da_venda" item-type="text"><xsl:apply-templates mode="igrp-form-field" select="rows/content/buyandsell/fields/valor_da_venda"><xsl:with-param name="change" select="''"/><xsl:with-param name="declabel" select="''"/><xsl:with-param name="inputmask" select="''"/><xsl:with-param name="maxlength" select="'250'"/></xsl:apply-templates></div></xsl:if><xsl:if test="rows/content/buyandsell/fields/data_da_compra"><div class="form-group col-sm-6 gen-date-picker-wrapper gen-fields-holder" item-name="data_da_compra" item-type="date"><xsl:apply-templates mode="igrp-form-date-field" select="rows/content/buyandsell/fields/data_da_compra"><xsl:with-param name="format" select="'d-m-Y'"/><xsl:with-param name="enableTime" select="'false'"/><xsl:with-param name="disableWeekends" select="'false'"/><xsl:with-param name="disabledBeforetoday" select="'false'"/><xsl:with-param name="range" select="'false'"/><xsl:with-param name="change" select="''"/><xsl:with-param name="maxlength" select="'250'"/><xsl:with-param name="placeholder" select="''"/></xsl:apply-templates></div></xsl:if><xsl:if test="rows/content/buyandsell/fields/data_da_venda"><div class="form-group col-sm-6 gen-date-picker-wrapper gen-fields-holder" item-name="data_da_venda" item-type="date"><xsl:apply-templates mode="igrp-form-date-field" select="rows/content/buyandsell/fields/data_da_venda"><xsl:with-param name="format" select="'d-m-Y'"/><xsl:with-param name="enableTime" select="'false'"/><xsl:with-param name="disableWeekends" select="'false'"/><xsl:with-param name="disabledBeforetoday" select="'false'"/><xsl:with-param name="range" select="'false'"/><xsl:with-param name="change" select="''"/><xsl:with-param name="maxlength" select="'250'"/><xsl:with-param name="placeholder" select="''"/></xsl:apply-templates></div></xsl:if></div></div><xsl:apply-templates select="rows/content/buyandsell/tools-bar" mode="form-buttons-2"/></div></xsl:if></div></div></div><div class="row " id="row-68ff1d22"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:if test="rows/content/atribuicao"><div class="card igrp-forms gen-container-item " gen-class="" item-name="atribuicao"><xsl:apply-templates mode="igrp-card-header" select="rows/content/atribuicao"><xsl:with-param name="show-title" select="'undefined'"/></xsl:apply-templates><div class="card-body"><div class="row g-4" role="form"><xsl:if test="rows/content/atribuicao/fields/departamento"><div class="col-md-3 gen-fields-holder" item-name="departamento" item-type="text"><xsl:apply-templates mode="igrp-form-field" select="rows/content/atribuicao/fields/departamento"><xsl:with-param name="change" select="''"/><xsl:with-param name="declabel" select="''"/><xsl:with-param name="inputmask" select="''"/><xsl:with-param name="maxlength" select="'250'"/></xsl:apply-templates></div></xsl:if><xsl:if test="rows/content/atribuicao/fields/funcionario"><div class="col-md-6 gen-fields-holder" item-name="funcionario" item-type="text"><xsl:apply-templates mode="igrp-form-field" select="rows/content/atribuicao/fields/funcionario"><xsl:with-param name="change" select="''"/><xsl:with-param name="declabel" select="''"/><xsl:with-param name="inputmask" select="''"/><xsl:with-param name="maxlength" select="'250'"/></xsl:apply-templates></div></xsl:if></div></div><xsl:apply-templates select="rows/content/atribuicao/tools-bar" mode="form-buttons-2"/></div></xsl:if></div></div></div></div></div></form><xsl:call-template name="igrp-footer"/></div></div><xsl:call-template name="igrp-page-helpers"/><xsl:call-template name="igrp-scripts"/><script type="text/javascript" src="{$path}/libs/choices.js/public/assets/scripts/choices.min.js?v={$version}"/><script type="text/javascript" src="{$path}/components/select.choices/select.choices.js?v={$version}"/><script type="text/javascript" src="{$path}/core/moment/moment.min.js?v={$version}"/><script type="text/javascript" src="{$path}/libs/flatpickr/flatpickr.min.js?v={$version}"/><script type="text/javascript" src="{$path}/libs/flatpickr/l10n/default.js?v={$version}"/><script type="text/javascript" src="{$path}/libs/flatpickr/l10n/pt.js?v={$version}"/><script type="text/javascript" src="{$path}/components/datepicker/init.js?v={$version}"/></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=3"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=3"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=3"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=3"/><xsl:include href="../../../xsl/tmpl/parts.common.xsl?v=3"/><xsl:include href="../../../xsl/tmpl/parts.head.xsl?v=3"/><xsl:include href="../../../xsl/tmpl/parts.header.xsl?v=3"/><xsl:include href="../../../xsl/tmpl/parts.scripts.xsl?v=3"/><xsl:include href="../../../xsl/tmpl/parts.footer.xsl?v=3"/><xsl:include href="../../../xsl/tmpl/parts.sidebar.xsl?v=3"/><xsl:include href="../../../xsl/tmpl/IGRP-form-utils.tmpl.xsl?v=3"/><xsl:include href="../../../xsl/tmpl/component.form.fields.xsl?v=3"/></xsl:stylesheet>
