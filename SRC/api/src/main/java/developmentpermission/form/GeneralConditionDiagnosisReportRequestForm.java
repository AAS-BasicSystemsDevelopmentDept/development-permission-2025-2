package developmentpermission.form;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 概況診断結果レポート出力リクエストフォーム
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class GeneralConditionDiagnosisReportRequestForm implements Serializable {

	/** シリアルバージョンUID */
	private static final long serialVersionUID = 1L;
	
	/** 一時フォルダ名*/
	@ApiModelProperty(value = "一時フォルダ名", example = "XXXXXXXX")
	private String folderName;

	/** 申請地番一覧 */
	@ApiModelProperty(value = "申請地番一覧")
	private List<LotNumberForm> lotNumbers;

	/** 申請区分選択一覧 */
	@ApiModelProperty(value = "申請区分選択一覧")
	private List<ApplicationCategorySelectionViewForm> applicationCategories;

	/** 概況診断結果一覧 */
	@ApiModelProperty(value = "概況診断結果一覧")
	private List<GeneralConditionDiagnosisResultForm> generalConditionDiagnosisResults;
	
	/** 回答ID-概況診断結果ID紐づけ情報 */
	@ApiModelProperty(value = "回答ID-概況診断結果ID紐づけ情報")
	private Map<Integer, Integer> answerJudgementMap;
}
