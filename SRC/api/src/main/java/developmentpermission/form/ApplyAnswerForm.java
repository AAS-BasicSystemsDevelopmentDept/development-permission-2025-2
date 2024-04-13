package developmentpermission.form;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 申請・回答内容確認情報フォーム
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class ApplyAnswerForm implements Serializable {

	/** シリアルバージョンUID */
	private static final long serialVersionUID = 1L;

	/** 申請ID */
	@ApiModelProperty(value = "申請ID", example = "1")
	private Integer applicationId;

	/** ステータス */
	@ApiModelProperty(value = "ステータス(0:申請中 1:回答中（未回答課あり）2:回答完了 3:通知済み 4:通知済み（要再申請)", example = "第1版申請中")
	private String status;
	
	/** ステータスコード */
	@ApiModelProperty(value = "ステータス(0:申請中 1:回答中（未回答課あり）2:回答完了 3:通知済み 4:通知済み（要再申請）)", example = "1")
	private String statusCode;

	/** 申請区分 */
	@ApiModelProperty(value = "申請区分選択一覧")
	private List<ApplicationCategorySelectionViewForm> applicationCategories;

	/** 申請者情報一覧 */
	@ApiModelProperty(value = "申請者情報一覧")
	private List<ApplicantInformationItemForm> applicantInformations;

	/** 回答一覧（申請情報詳細取得時のみ） */
	@ApiModelProperty(value = "回答一覧")
	private List<AnswerForm> answers;

	/** 申請地番一覧 */
	@ApiModelProperty(value = "申請地番一覧")
	private List<LotNumberForm> lotNumbers;

	/** 申請ファイル一覧 */
	@ApiModelProperty(value = "申請ファイル一覧")
	private List<ApplicationFileForm> applicationFiles;

	/** 申請ファイル版情報一覧 */
	@ApiModelProperty(value = "申請ファイル版情報一覧")
	private List<ApplicationFileVersionForm> applicationFileVersions;
	
	/** 回答権限 */
	@ApiModelProperty(value = "回答通知権限", example = "true")
	private Boolean notificable;
	
	/** 回答履歴 */
	@ApiModelProperty(value = "回答履歴一覧")
	private List<AnswerHistoryForm> answerHistory;
	
	/** 回答ファイル更新履歴 */
	@ApiModelProperty(value = "回答ファイル更新履歴一覧")
	private List<AnswerFileHistoryForm> answerFileHistory;
}
