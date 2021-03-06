package typings.babelTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typings.babelTypes.mod.AnyTypeAnnotation_
    - typings.babelTypes.mod.ArgumentPlaceholder_
    - typings.babelTypes.mod.ArrayExpression_
    - typings.babelTypes.mod.ArrayPattern_
    - typings.babelTypes.mod.ArrayTypeAnnotation_
    - typings.babelTypes.mod.ArrowFunctionExpression_
    - typings.babelTypes.mod.AssignmentExpression_
    - typings.babelTypes.mod.AssignmentPattern_
    - typings.babelTypes.mod.AwaitExpression_
    - typings.babelTypes.mod.BigIntLiteral_
    - typings.babelTypes.mod.Binary
    - typings.babelTypes.mod.BinaryExpression_
    - typings.babelTypes.mod.BindExpression_
    - typings.babelTypes.mod.Block
    - typings.babelTypes.mod.BlockParent
    - typings.babelTypes.mod.BlockStatement_
    - typings.babelTypes.mod.BooleanLiteral_
    - typings.babelTypes.mod.BooleanLiteralTypeAnnotation_
    - typings.babelTypes.mod.BooleanTypeAnnotation_
    - typings.babelTypes.mod.BreakStatement_
    - typings.babelTypes.mod.CallExpression_
    - typings.babelTypes.mod.CatchClause_
    - typings.babelTypes.mod.Class
    - typings.babelTypes.mod.ClassBody_
    - typings.babelTypes.mod.ClassDeclaration_
    - typings.babelTypes.mod.ClassExpression_
    - typings.babelTypes.mod.ClassImplements_
    - typings.babelTypes.mod.ClassMethod_
    - typings.babelTypes.mod.ClassPrivateMethod_
    - typings.babelTypes.mod.ClassPrivateProperty_
    - typings.babelTypes.mod.ClassProperty_
    - typings.babelTypes.mod.CompletionStatement
    - typings.babelTypes.mod.Conditional
    - typings.babelTypes.mod.ConditionalExpression_
    - typings.babelTypes.mod.ContinueStatement_
    - typings.babelTypes.mod.DebuggerStatement_
    - typings.babelTypes.mod.Declaration
    - typings.babelTypes.mod.DeclareClass_
    - typings.babelTypes.mod.DeclareExportAllDeclaration_
    - typings.babelTypes.mod.DeclareExportDeclaration_
    - typings.babelTypes.mod.DeclareFunction_
    - typings.babelTypes.mod.DeclareInterface_
    - typings.babelTypes.mod.DeclareModule_
    - typings.babelTypes.mod.DeclareModuleExports_
    - typings.babelTypes.mod.DeclareOpaqueType_
    - typings.babelTypes.mod.DeclareTypeAlias_
    - typings.babelTypes.mod.DeclareVariable_
    - typings.babelTypes.mod.DeclaredPredicate_
    - typings.babelTypes.mod.Decorator_
    - typings.babelTypes.mod.Directive_
    - typings.babelTypes.mod.DirectiveLiteral_
    - typings.babelTypes.mod.DoExpression_
    - typings.babelTypes.mod.DoWhileStatement_
    - typings.babelTypes.mod.EmptyStatement_
    - typings.babelTypes.mod.EmptyTypeAnnotation_
    - typings.babelTypes.mod.EnumBody
    - typings.babelTypes.mod.EnumBooleanBody_
    - typings.babelTypes.mod.EnumBooleanMember_
    - typings.babelTypes.mod.EnumDeclaration_
    - typings.babelTypes.mod.EnumDefaultedMember_
    - typings.babelTypes.mod.EnumMember
    - typings.babelTypes.mod.EnumNumberBody_
    - typings.babelTypes.mod.EnumNumberMember_
    - typings.babelTypes.mod.EnumStringBody_
    - typings.babelTypes.mod.EnumStringMember_
    - typings.babelTypes.mod.EnumSymbolBody_
    - typings.babelTypes.mod.ExistsTypeAnnotation_
    - typings.babelTypes.mod.ExportAllDeclaration_
    - typings.babelTypes.mod.ExportDeclaration
    - typings.babelTypes.mod.ExportDefaultDeclaration_
    - typings.babelTypes.mod.ExportDefaultSpecifier_
    - typings.babelTypes.mod.ExportNamedDeclaration_
    - typings.babelTypes.mod.ExportNamespaceSpecifier_
    - typings.babelTypes.mod.ExportSpecifier_
    - typings.babelTypes.mod.Expression
    - typings.babelTypes.mod.ExpressionStatement_
    - typings.babelTypes.mod.ExpressionWrapper
    - typings.babelTypes.mod.File_
    - typings.babelTypes.mod.Flow
    - typings.babelTypes.mod.FlowBaseAnnotation
    - typings.babelTypes.mod.FlowDeclaration
    - typings.babelTypes.mod.FlowPredicate
    - typings.babelTypes.mod.FlowType
    - typings.babelTypes.mod.For
    - typings.babelTypes.mod.ForInStatement_
    - typings.babelTypes.mod.ForOfStatement_
    - typings.babelTypes.mod.ForStatement_
    - typings.babelTypes.mod.ForXStatement
    - typings.babelTypes.mod.Function
    - typings.babelTypes.mod.FunctionDeclaration_
    - typings.babelTypes.mod.FunctionExpression_
    - typings.babelTypes.mod.FunctionParent
    - typings.babelTypes.mod.FunctionTypeAnnotation_
    - typings.babelTypes.mod.FunctionTypeParam_
    - typings.babelTypes.mod.GenericTypeAnnotation_
    - typings.babelTypes.mod.Identifier_
    - typings.babelTypes.mod.IfStatement_
    - typings.babelTypes.mod.Immutable
    - typings.babelTypes.mod.Import_
    - typings.babelTypes.mod.ImportDeclaration_
    - typings.babelTypes.mod.ImportDefaultSpecifier_
    - typings.babelTypes.mod.ImportNamespaceSpecifier_
    - typings.babelTypes.mod.ImportSpecifier_
    - typings.babelTypes.mod.InferredPredicate_
    - typings.babelTypes.mod.InterfaceDeclaration_
    - typings.babelTypes.mod.InterfaceExtends_
    - typings.babelTypes.mod.InterfaceTypeAnnotation_
    - typings.babelTypes.mod.InterpreterDirective_
    - typings.babelTypes.mod.IntersectionTypeAnnotation_
    - typings.babelTypes.mod.JSX
    - typings.babelTypes.mod.JSXAttribute_
    - typings.babelTypes.mod.JSXClosingElement_
    - typings.babelTypes.mod.JSXClosingFragment_
    - typings.babelTypes.mod.JSXElement_
    - typings.babelTypes.mod.JSXEmptyExpression_
    - typings.babelTypes.mod.JSXExpressionContainer_
    - typings.babelTypes.mod.JSXFragment_
    - typings.babelTypes.mod.JSXIdentifier_
    - typings.babelTypes.mod.JSXMemberExpression_
    - typings.babelTypes.mod.JSXNamespacedName_
    - typings.babelTypes.mod.JSXOpeningElement_
    - typings.babelTypes.mod.JSXOpeningFragment_
    - typings.babelTypes.mod.JSXSpreadAttribute_
    - typings.babelTypes.mod.JSXSpreadChild_
    - typings.babelTypes.mod.JSXText_
    - typings.babelTypes.mod.LVal
    - typings.babelTypes.mod.LabeledStatement_
    - typings.babelTypes.mod.Literal
    - typings.babelTypes.mod.LogicalExpression_
    - typings.babelTypes.mod.Loop
    - typings.babelTypes.mod.MemberExpression_
    - typings.babelTypes.mod.MetaProperty_
    - typings.babelTypes.mod.Method
    - typings.babelTypes.mod.MixedTypeAnnotation_
    - typings.babelTypes.mod.ModuleDeclaration
    - typings.babelTypes.mod.ModuleSpecifier
    - typings.babelTypes.mod.NewExpression_
    - typings.babelTypes.mod.Noop_
    - typings.babelTypes.mod.NullLiteral_
    - typings.babelTypes.mod.NullLiteralTypeAnnotation_
    - typings.babelTypes.mod.NullableTypeAnnotation_
    - typings.babelTypes.mod.NumberLiteral
    - typings.babelTypes.mod.NumberLiteralTypeAnnotation_
    - typings.babelTypes.mod.NumberTypeAnnotation_
    - typings.babelTypes.mod.NumericLiteral_
    - typings.babelTypes.mod.ObjectExpression_
    - typings.babelTypes.mod.ObjectMember
    - typings.babelTypes.mod.ObjectMethod_
    - typings.babelTypes.mod.ObjectPattern_
    - typings.babelTypes.mod.ObjectProperty_
    - typings.babelTypes.mod.ObjectTypeAnnotation_
    - typings.babelTypes.mod.ObjectTypeCallProperty_
    - typings.babelTypes.mod.ObjectTypeIndexer_
    - typings.babelTypes.mod.ObjectTypeInternalSlot_
    - typings.babelTypes.mod.ObjectTypeProperty_
    - typings.babelTypes.mod.ObjectTypeSpreadProperty_
    - typings.babelTypes.mod.OpaqueType_
    - typings.babelTypes.mod.OptionalCallExpression_
    - typings.babelTypes.mod.OptionalMemberExpression_
    - typings.babelTypes.mod.ParenthesizedExpression_
    - typings.babelTypes.mod.Pattern
    - typings.babelTypes.mod.PatternLike
    - typings.babelTypes.mod.PipelineBareFunction_
    - typings.babelTypes.mod.PipelinePrimaryTopicReference_
    - typings.babelTypes.mod.PipelineTopicExpression_
    - typings.babelTypes.mod.Placeholder_
    - typings.babelTypes.mod.Private
    - typings.babelTypes.mod.PrivateName_
    - typings.babelTypes.mod.Program_
    - typings.babelTypes.mod.Property
    - typings.babelTypes.mod.Pureish
    - typings.babelTypes.mod.QualifiedTypeIdentifier_
    - typings.babelTypes.mod.RecordExpression_
    - typings.babelTypes.mod.RegExpLiteral_
    - typings.babelTypes.mod.RegexLiteral
    - typings.babelTypes.mod.RestElement_
    - typings.babelTypes.mod.RestProperty
    - typings.babelTypes.mod.ReturnStatement_
    - typings.babelTypes.mod.Scopable
    - typings.babelTypes.mod.SequenceExpression_
    - typings.babelTypes.mod.SpreadElement_
    - typings.babelTypes.mod.SpreadProperty
    - typings.babelTypes.mod.Statement
    - typings.babelTypes.mod.StringLiteral_
    - typings.babelTypes.mod.StringLiteralTypeAnnotation_
    - typings.babelTypes.mod.StringTypeAnnotation_
    - typings.babelTypes.mod.Super_
    - typings.babelTypes.mod.SwitchCase_
    - typings.babelTypes.mod.SwitchStatement_
    - typings.babelTypes.mod.SymbolTypeAnnotation_
    - typings.babelTypes.mod.TSAnyKeyword_
    - typings.babelTypes.mod.TSArrayType_
    - typings.babelTypes.mod.TSAsExpression_
    - typings.babelTypes.mod.TSBigIntKeyword_
    - typings.babelTypes.mod.TSBooleanKeyword_
    - typings.babelTypes.mod.TSCallSignatureDeclaration_
    - typings.babelTypes.mod.TSConditionalType_
    - typings.babelTypes.mod.TSConstructSignatureDeclaration_
    - typings.babelTypes.mod.TSConstructorType_
    - typings.babelTypes.mod.TSDeclareFunction_
    - typings.babelTypes.mod.TSDeclareMethod_
    - typings.babelTypes.mod.TSEntityName
    - typings.babelTypes.mod.TSEnumDeclaration_
    - typings.babelTypes.mod.TSEnumMember_
    - typings.babelTypes.mod.TSExportAssignment_
    - typings.babelTypes.mod.TSExpressionWithTypeArguments_
    - typings.babelTypes.mod.TSExternalModuleReference_
    - typings.babelTypes.mod.TSFunctionType_
    - typings.babelTypes.mod.TSImportEqualsDeclaration_
    - typings.babelTypes.mod.TSImportType_
    - typings.babelTypes.mod.TSIndexSignature_
    - typings.babelTypes.mod.TSIndexedAccessType_
    - typings.babelTypes.mod.TSInferType_
    - typings.babelTypes.mod.TSInterfaceBody_
    - typings.babelTypes.mod.TSInterfaceDeclaration_
    - typings.babelTypes.mod.TSIntersectionType_
    - typings.babelTypes.mod.TSLiteralType_
    - typings.babelTypes.mod.TSMappedType_
    - typings.babelTypes.mod.TSMethodSignature_
    - typings.babelTypes.mod.TSModuleBlock_
    - typings.babelTypes.mod.TSModuleDeclaration_
    - typings.babelTypes.mod.TSNamespaceExportDeclaration_
    - typings.babelTypes.mod.TSNeverKeyword_
    - typings.babelTypes.mod.TSNonNullExpression_
    - typings.babelTypes.mod.TSNullKeyword_
    - typings.babelTypes.mod.TSNumberKeyword_
    - typings.babelTypes.mod.TSObjectKeyword_
    - typings.babelTypes.mod.TSOptionalType_
    - typings.babelTypes.mod.TSParameterProperty_
    - typings.babelTypes.mod.TSParenthesizedType_
    - typings.babelTypes.mod.TSPropertySignature_
    - typings.babelTypes.mod.TSQualifiedName_
    - typings.babelTypes.mod.TSRestType_
    - typings.babelTypes.mod.TSStringKeyword_
    - typings.babelTypes.mod.TSSymbolKeyword_
    - typings.babelTypes.mod.TSThisType_
    - typings.babelTypes.mod.TSTupleType_
    - typings.babelTypes.mod.TSType
    - typings.babelTypes.mod.TSTypeAliasDeclaration_
    - typings.babelTypes.mod.TSTypeAnnotation_
    - typings.babelTypes.mod.TSTypeAssertion_
    - typings.babelTypes.mod.TSTypeElement
    - typings.babelTypes.mod.TSTypeLiteral_
    - typings.babelTypes.mod.TSTypeOperator_
    - typings.babelTypes.mod.TSTypeParameter_
    - typings.babelTypes.mod.TSTypeParameterDeclaration_
    - typings.babelTypes.mod.TSTypeParameterInstantiation_
    - typings.babelTypes.mod.TSTypePredicate_
    - typings.babelTypes.mod.TSTypeQuery_
    - typings.babelTypes.mod.TSTypeReference_
    - typings.babelTypes.mod.TSUndefinedKeyword_
    - typings.babelTypes.mod.TSUnionType_
    - typings.babelTypes.mod.TSUnknownKeyword_
    - typings.babelTypes.mod.TSVoidKeyword_
    - typings.babelTypes.mod.TaggedTemplateExpression_
    - typings.babelTypes.mod.TemplateElement_
    - typings.babelTypes.mod.TemplateLiteral_
    - typings.babelTypes.mod.Terminatorless
    - typings.babelTypes.mod.ThisExpression_
    - typings.babelTypes.mod.ThisTypeAnnotation_
    - typings.babelTypes.mod.ThrowStatement_
    - typings.babelTypes.mod.TryStatement_
    - typings.babelTypes.mod.TupleExpression_
    - typings.babelTypes.mod.TupleTypeAnnotation_
    - typings.babelTypes.mod.TypeAlias_
    - typings.babelTypes.mod.TypeAnnotation_
    - typings.babelTypes.mod.TypeCastExpression_
    - typings.babelTypes.mod.TypeParameter_
    - typings.babelTypes.mod.TypeParameterDeclaration_
    - typings.babelTypes.mod.TypeParameterInstantiation_
    - typings.babelTypes.mod.TypeofTypeAnnotation_
    - typings.babelTypes.mod.UnaryExpression_
    - typings.babelTypes.mod.UnaryLike
    - typings.babelTypes.mod.UnionTypeAnnotation_
    - typings.babelTypes.mod.UpdateExpression_
    - typings.babelTypes.mod.UserWhitespacable
    - typings.babelTypes.mod.V8IntrinsicIdentifier_
    - typings.babelTypes.mod.VariableDeclaration_
    - typings.babelTypes.mod.VariableDeclarator_
    - typings.babelTypes.mod.Variance_
    - typings.babelTypes.mod.VoidTypeAnnotation_
    - typings.babelTypes.mod.While
    - typings.babelTypes.mod.WhileStatement_
    - typings.babelTypes.mod.WithStatement_
    - typings.babelTypes.mod.YieldExpression_
  */
  type Node = typings.babelTypes.mod._Node | typings.babelTypes.mod.NumberLiteral | typings.babelTypes.mod.RegexLiteral | typings.babelTypes.mod.RestProperty | typings.babelTypes.mod.SpreadProperty
  type NumberLiteral = typings.babelTypes.mod.NumericLiteral_
  type RegexLiteral = typings.babelTypes.mod.RegExpLiteral_
  type RestProperty = typings.babelTypes.mod.RestElement_
  type SpreadProperty = typings.babelTypes.mod.SpreadElement_
  type TraversalAncestors = js.Array[typings.babelTypes.AnonIndex]
  type TraversalHandler[T] = js.ThisFunction3[
    /* this */ js.UndefOr[scala.Nothing], 
    /* node */ typings.babelTypes.mod.Node, 
    /* parent */ typings.babelTypes.mod.TraversalAncestors, 
    /* type */ T, 
    scala.Unit
  ]
}
