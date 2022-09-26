package com.github.zhenwei.kmip.common.enums;

import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: zhangzhenwei
 * @description: TagEnum
 *  项标签
 * @date: 2022/9/26  23:12
 * @since: 1.0
 */
public enum TagEnum {
  ActivationDate(0x420001),//激活日期
  ApplicationData(0x420002),//应用程序数据
  ApplicationNamespace(0x420003),//应用程序命名空间
  ApplicationSpecificInformation(0x420004),//应用程序特定信息
  ArchiveDate(0x420005),//归档日期
  AsynchronousCorrelationValue(0x420006),//异步相关值
  AsynchronousIndicator(0x420007),//异步指示器
  Attribute(0x420008),//属性
  AttributeIndex(0x420009),//属性索引
  AttributeName(0x42000A),//属性名称
  AttributeValue(0x42000B),//属性值
  Authentication(0x42000C),//身份认证
  BatchCount(0x42000D),//批处理项数量
  BatchErrorContinuationOption(0x42000E),//批处理错误继续选项
  BatchItem(0x42000F),//批处理项
  BatchOrderOption(0x420010),//批处理顺序选项
  BlockCipherMode(0x420011),//分组密码模式
  CancellationResult(0x420012),//取消结果
  Certificate(0x420013),//证书
  CertificateIdentifier(0x420014),//证书标识符
  CertificateIssuer(0x420015),//证书颁发者
  CertificateIssuerAlternativeName(0x420016),//证书颁发者替换名
  CertificateIssuerDistinguishedName(0x420017),//证书颁发者可识别名
  CertificateRequest(0x420018),//证书请求
  CertificateRequestType(0x420019),//证书请求类型
  CertificateSubject(0x42001A),//证书主体
  CertificateSubjectAlternativeName(0x42001B),//证书主体替换名
  CertificateSubjectDistinguishedName(0x42001C),//证书主体可识别名
  CertificateType(0x42001D),//证书类型
  CertificateValue(0x42001E),//证书值
  CommonTemplateAttribute(0x42001F),//通用属性集
  CompromiseDate(0x420020),//失信日期
  CompromiseOccurrenceDate(0x420021),//失信发生日期
  ContactInformation(0x420022),//联系信息
  Credential(0x420023),//凭证
  CredentialType(0x420024),//凭证类型
  CredentialValue(0x420025),//凭证值
  CriticalityIndicator(0x420026),//关键性指示符
  CRTCoefficient(0x420027),//CRT系数
  CryptographicAlgorithm(0x420028),//密码算法
  CryptographicDomainParameters(0x420029),//密码算法域参数
  CryptographicLength(0x42002A),//加密长度
  CryptographicParameters(0x42002B),//密码参数
  CryptographicUsageMask(0x42002C),//密码用途掩码
  CustomAttribute(0x42002D),//自定义属性
  D(0x42002E),//D
  DeactivationDate(0x42002F),//停用日期
  DerivationData(0x420030),//派生数据
  DerivationMethod(0x420031),//派生方法
  DerivationParameters(0x420032),//派生参数
  DestroyDate(0x420033),//销毁日期
  Digest(0x420034),//摘要
  DigestValue(0x420035),//摘要值
  EncryptionKeyInformation(0x420036),//加密密钥信息
  G(0x420037),//G
  HashingAlgorithm(0x420038),//杂凑算法
  InitialDate(0x420039),//初始化日期
  InitializationVector(0x42003A),//初始向量
  Issuer(0x42003B),//颁发者
  IterationCount(0x42003C),//迭代次数
  IVCounterNonce(0x42003D),//IV/计数器/随机值
  J(0x42003E),//J
  Key(0x42003F),//密钥
  KeyBlock(0x420040),//密钥块
  KeyCompressionType(0x420041),//密钥压缩类型
  KeyFormatType(0x420042),//密钥格式类型
  KeyMaterial(0x420043),//密钥材料
  KeyPartIdentifier(0x420044),//密钥分量标识符
  KeyValue(0x420045),//密钥值
  KeyWrappingData(0x420046), //密钥封装数据
  KeyWrappingSpecification(0x420047),//密钥封装规范
  LastChangeDate(0x420048),//最后修改日期
  LeaseTime(0x420049),//租约时间
  Link(0x42004A),//链接
  LinkType(0x42004B),//链接类型
  LinkedObjectIdentifier(0x42004C),//链接对象标识符
  MACSignature(0x42004D),//MAC/签名
  MACSignatureKeyInformation(0x42004E),//MAC/签名密钥信息
  MaximumItems(0x42004F),//最大项目数量
  MaximumResponseSize(0x420050),//最大响应长度
  MessageExtension(0x420051),//消息扩展
  Modulus(0x420052),//模量
  Name(0x420053),//名称
  NameType(0x420054),//名称类型
  NameValue(0x420055),//名称值
  ObjectGroup(0x420056),//对象组
  ObjectType(0x420057),//对象类型
  Offset(0x420058),//偏移量
  OpaqueDataType(0x420059),//自定义数据类型
  OpaqueDataValue(0x42005A),//自定义数据值
  OpaqueObject(0x42005B),//自定义对象
  Operation(0x42005C),//操作
  OperationPolicyName(0x42005D),//操作策略名称
  P(0x42005E),//P
  PaddingMethod(0x42005F),//填充方法
  PrimeExponentP(0x420060),//主要指数P
  PrimeExponentQ(0x420061),//主要指数Q
  PrimeFieldSize(0x420062),//素域尺寸
  PrivateExponent(0x420063),//私钥指数
  PrivateKey(0x420064),//私钥
  PrivateKeyTemplateAttribute(0x420065),//私钥属性集
  PrivateKeyUniqueIdentifier(0x420066),//私钥唯一标识符
  ProcessStartDate(0x420067),//生效日期
  ProtectStopDate(0x420068),//失效日期
  ProtocolVersion(0x420069),//协议版本
  ProtocolVersionMajor(0x42006A),//主版本
  ProtocolVersionMinor(0x42006B),//次要版本
  PublicExponent(0x42006C),//公钥指数
  PublicKey(0x42006D),//公钥
  PublicKeyTemplateAttribute(0x42006E),//公钥属性集
  PublicKeyUniqueIdentifier(0x42006F),//公钥唯一标识符
  PutFunction(0x420070),//推送功能
  Q(0x420071),//Q
  QString(0x420072),//Q字符串
  Qlength(0x420073),//Q长度
  QueryFunction(0x420074),//查询功能
  RecommendedCurve(0x420075),//推荐曲线
  ReplacedUniqueIdentifier(0x420076),//替换唯一标识符
  RequestHeader(0x420077),//请求头
  RequestMessage(0x420078),//请求消息
  RequestPayload(0x420079),//请求载荷
  ResponseHeader(0x42007A),//响应头
  ResponseMessage(0x42007B),//响应消息
  ResponsePayload(0x42007C),//响应载荷
  ResultMessage(0x42007D),//结果消息
  ResultReason(0x42007E),//结果原因
  ResultStatus(0x42007F),//结果状态
  RevocationMessage(0x420080),//注销信息
  RevocationReason(0x420081),//注销原因
  RevocationReasonCode(0x420082),//注销原因码
  KeyRoleType(0x420083),//密钥角色类型
  Salt(0x420084),//添加变量
  SecretData(0x420085),//秘密数据
  SecretDataType(0x420086),//秘密数据类型
  SerialNumber(0x420087),//序列号
  ServerInformation(0x420088),//服务端信息
  SplitKey(0x420089),//分割密钥
  SplitKeyMethod(0x42008A),//分割密钥方法
  SplitKeyParts(0x42008B),//分割密钥份数
  SplitKeyThreshold(0x42008C),//分割密钥阈值
  State(0x42008D),//状态
  StorageStatusMask(0x42008E),//存储状态掩码
  SymmetricKey(0x42008F),//对称密钥
  Template(0x420090),//模板
  TemplateAttribute(0x420091),//属性集
  TimeStamp(0x420092),//时间戳
  UniqueBatchItemID(0x420093),//唯一批处理项ID
  UniqueIdentifier(0x420094),//唯一标识符
  UsageLimits(0x420095),//使用限制
  UsageLimitsCount(0x420096),//使用限制计数
  UsageLimitsTotal(0x420097),//使用限制总数
  UsageLimitsUnit(0x420098),//使用限制单位
  Username(0x420099),//用户名
  ValidityDate(0x42009A),//有效期
  ValidityIndicator(0x42009B),//有效性标识
  VendorExtension(0x42009C),//供应商扩展
  VendorIdentification(0x42009D),//供应商标识
  WrappingMethod(0x42009E),//封装方法
  X(0x42009F),//X
  Y(0x4200A0),//Y
  Password(0x4200A1),//口令
  DeviceIdentifier(0x4200A2),//设备标识
  EncodingOption(0x4200A3),//编码选项
  ExtensionInformation(0x4200A4),//扩展信息
  ExtensionName(0x4200A5),//扩展名
  ExtensionTag(0x4200A6),//扩展标签
  ExtensionType(0x4200A7),//扩展类型
  Fresh(0x4200A8),//未使用
  MachineIdentifier(0x4200A9),//机器标识
  MediaIdentifier(0x4200AA),//媒体标识
  NetworkIdentifier(0x4200AB),//网络标识
  ObjectGroupMember(0x4200AC),//对象组成员
  CertificateLength(0x4200AD),//证书长度
  DigitalSignatureAlgorithm(0x4200AE),//数字签名算法
  CertificateSerialNumber(0x4200AF),//证书序列号
  DeviceSerialNumber(0x4200B0),//设备序列号
  IssuerAlternativeName(0x4200B1),//颁发者可识别名
  IssuerDistinguishedName(0x4200B2),//颁发者可识别名
  SubjectAlternativeName(0x4200B3),//主体替换名
  SubjectDistinguishedName(0x4200B4),//主体可识别名
  X509CertificateIdentifier(0x4200B5),//X.509证书标识符
  X509CertificateIssuer(0x4200B6),//X.509 证书颁发者
  X509CertificateSubject(0x4200B7),//X.509 证书主体
  KeyValueLocation(0x4200B8),//密钥值位置
  KeyValueLocationValue(0x4200B9),//密钥值位置值
  KeyValueLocationType(0x4200BA),//密钥值位置类型
  KeyValuePresent(0x4200BB),//密钥值存在标记
  OriginalCreationDate(0x4200BC),//原创创建日期
  PGPKey(0x4200BD),//PGP密钥
  PGPKeyVersion(0x4200BE),//PGP密钥版本
  AlternativeName(0x4200BF),//别名
  AlternativeNameValue(0x4200C0),//别名值
  AlternativeNameType(0x4200C1),//别名类型
  Data(0x4200C2),//数据
  SignatureData(0x4200C3),//签名数据
  DataLength(0x4200C4),//数据长度
  RandomIV(0x4200C5),//随机IV
  MACData(0x4200C6),//MAC值
  AttestationType(0x4200C7),//证实类型
  Nonce(0x4200C8),//随机数
  NonceID(0x4200C9),//随机数ID
  NonceValue(0x4200CA),//随机数值
  AttestationMeasurement(0x4200CB),//证实测量
  AttestationAssertion(0x4200CC),//证实声明
  IVLength(0x4200CD),//IV长度
  TagLength(0x4200CE),//标签长度
  FixedFieldLength(0x4200CF),//固定字段长度
  CounterLength(0x4200D0),//计数器长度
  InitialCounterValue(0x4200D1),//初始计数器值
  InvocationFieldLength(0x4200D2),//调用字段长度
  AttestationCapableIndicator(0x4200D3),//认证能力指示符
  OffsetItems(0x4200D4),//偏移项目数量
  LocatedItems(0x4200D5),//定位项目
  CorrelationValue(0x4200D6),//相关值
  InitIndicator(0x4200D7),//初始指示符
  FinalIndicator(0x4200D8),//完成指示符
  RNGParameters(0x4200D9),//RNG参数
  RNGAlgorithm(0x4200DA),//RNG算法

  DRBGAlgorithm(0x4200DB),//DRBG算法
  FIPS186Variation(0x4200DC),//FIPS186变化
  PredictionResistance(0x4200DD),//预测阻力
  RandomNumberGenerator(0x4200DE),//随机数发生器
  ValidationInformation(0x4200DF),//验证信息
  ValidationAuthorityType(0x4200E0),//验证机构类型
  ValidationAuthorityCountry(0x4200E1),//验证机构国家
  ValidationAuthorityURI(0x4200E2),//验证机构URI
  ValidationVersionMajor(0x4200E3),//验证主版本
  ValidationVersionMinor(0x4200E4),//验证次版本
  ValidationType(0x4200E5),//验证类型
  ValidationLevel(0x4200E6),//验证级别
  ValidationCertificateIdentifier(0x4200E7),//验证证书编号
  ValidationCertificateURI(0x4200E8),//验证证书URI
  ValidationVendorURI(0x4200E9),//验证供应商URI
  ValidationProfile(0x4200EA),//验证配置文件
  ProfileInformation(0x4200EB),//配置文件信息
  ProfileName(0x4200EC),//配置文件名称
  ServerURI(0x4200ED),//服务器URI
  ServerPort(0x4200EE),//服务器端口
  StreamingCapability(0x4200EF),//流化能力
  AsynchronousCapability(0x4200F0),//异步能力
  AttestationCapability(0x4200F1),//证明能力
  UnwrapMode(0x4200F2),//解封装模式
  DestroyAction(0x4200F3),//销毁操作

  ShreddingAlgorithm(0x4200F4),//粉碎算法
  RNGMode(0x4200F5),//随机数发生器模式
  ClientRegistrationMethod(0x4200F6),//客户端注册方法
  CapabilityInformation(0x4200F7),//能力信息
  KeyWrapType(0x4200F8),//密钥封装类型
  BatchUndoCapability(0x4200F9),//批量撤销能力
  BatchContinueCapability(0x4200FA),//批量持续能力
  PKCS12FriendlyName(0x4200FB),//PKCS#12 别名
  Description(0x4200FC),//描述
  Comment(0x4200FD),//备注
  AuthenticatedEncryptionAdditionalData(0x4200FE),//加密验证附加数据
  AuthenticatedEncryptionTag(0x4200FF),//加密验证完整性标签
  SaltLength(0x420100),//添加变量长度
  MaskGenerator(0x420101),//掩码生成器
  MaskGeneratorHashingAlgorithm(0x420102),//掩码生成器杂凑算法
  PSource(0x420103),//P源
  TrailerField(0x420104),//填充字段
  ClientCorrelationValue(0x420105),//客户端相关值
  ServerCorrelationValue(0x420106),//服务端相关值
  DigestedData(0x420107),//摘要数据
  CertificateSubjectCN(0x420108),//证书主体 CN
  CertificateSubjectO(0x420109),//证书主体 O
  CertificateSubjectOU(0x42010A),//证书主体 OU
  CertificateSubjectEmail(0x42010B),//证书主体 Email
  CertificateSubjectC(0x42010C),//证书主体 C

  CertificateSubjectST(0x42010D),//证书主体 ST
  CertificateSubjectL(0x42010E),//证书主体 L
  CertificateSubjectUID(0x42010F),//证书主体 UID
  CertificateSubjectSerialNumber(0x420110),//证书主体 Serial Number
  CertificateSubjectTitle(0x420111),//证书主体 Title
  CertificateSubjectDC(0x420112),//证书主体 DC
  CertificateSubjectDNQualifier(0x420113),//证书主体DN Qualifier
  CertificateIssuerCN(0x420114),//证书颁发者 CN
  CertificateIssuerO(0x420115),//证书颁发者 O
  CertificateIssuerOU(0x420116),//证书颁发者 OU
  CertificateIssuerEmail(0x420117),//证书颁发者 Email
  CertificateIssuerC(0x420118),//证书颁发者 C
  CertificateIssuerST(0x420119),//证书颁发者 ST
  CertificateIssuerL(0x42011A),//证书颁发者 L
  CertificateIssuerUID(0x42011B),//证书颁发者 UID
  CertificateIssuerSerialNumber(0x42011C),//证书颁发者 SerialNumber
  CertificateIssuerTitle(0x42011D),//证书颁发者 Title
  CertificateIssuerDC(0x42011E),//证书颁发者 DC
  CertificateIssuerDNQualifier(0x42011F),//证书颁发者 DN Qualifier
  Sensitive(0x420120),//敏感
  AlwaysSensitive(0x420121),//始终敏感
  Extractable(0x420122),//提取
  NeverExtractable(0x420123),//从未提取
  ReplaceExisting(0x420124),//是否替代

  //自定义扩展属性
  KeyVersion(0x540001),
  keyStore(0x540002),

  ;
  private int value;

  TagEnum(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public String getHexValue() {
    return Integer.toHexString(value).toUpperCase();
  }


  /**
   * @description: 获取所有Tag的在用前缀
   * 5400 为自定义
   * @param: []
   * @return: java.lang.String[]
   * @author zhangzhenwei
   * @date: 2021/2/3 10:22 下午
   */
  public static String[] getAllPrefix() {
    String[] allPrefix = {"4200", "4201","5400"};
    return allPrefix;

  }

  public static TagEnum matchTag(int value) {
    List<TagEnum> list = Stream.of(values()).filter(tag -> tag.getValue() == value)
        .collect(Collectors.toList());
    return list.isEmpty() ? null : list.get(0);
  }

  public static TagEnum matchTag(String hexValue) {
    return Stream.of(values())
        .filter(tag -> tag.getHexValue().equalsIgnoreCase(hexValue)).findFirst().orElse(null);
  }

  public final static EnumSet<TagEnum> Encrypt = EnumSet
      .of(UniqueIdentifier, BlockCipherMode, PaddingMethod,CryptographicAlgorithm,KeyVersion);
}
