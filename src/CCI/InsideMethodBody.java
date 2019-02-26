
public class InsideMethodBody {

	public static void main(String args[]) {
		String methodName = "resolveId";
		String methodBody =  "protected String resolveId(Element element, AbstractBeanDefinition definition, ParserContext parserContext) throws BeanDefinitionStoreException {\r\n" + 
				"		      String id = element.getAttribute(\"id\");\r\n" + 
				"		      if (!StringUtils.hasText(id)) {\r\n" + 
				"		         id = DEFAULT_CACHE_MANAGER_BEAN_NAME;\r\n" + 
				"		      }\r\n" + 
				"		      return id;\r\n" + 
				"		   }";
		methodBody = methodBody.replaceAll(System.lineSeparator(),"");
		methodBody = methodBody.replaceAll("\\s+"," ");
		methodBody = methodBody.substring(methodBody.indexOf("{")+1, methodBody.lastIndexOf("}"));
		System.out.println("safösaf");
		if(!methodBody.matches("\\s*")) {
			System.out.println(methodBody);
		}
	}
}
