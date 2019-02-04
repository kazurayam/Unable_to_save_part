import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

switch(STRATEGY) {
	case 'last':
		WebUI.comment("STRATEGY is last")
		break
	case '1hourAgo':
		// restore the shot of 1 hour ago or older
		WebUI.comment("STRAGEGY is 1hourAgo")
		break
	default:
		KeywordUtil.markFailedAndStop("unknown STRATEGY: ${STRATEGY}")
}